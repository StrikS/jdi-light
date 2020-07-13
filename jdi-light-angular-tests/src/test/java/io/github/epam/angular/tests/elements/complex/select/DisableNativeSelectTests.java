package io.github.epam.angular.tests.elements.complex.select;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

import static io.github.com.pages.sections.SelectSection.disableNativeSelect;

public class DisableNativeSelectTests extends TestsSelectBase {
    private static final String DISABLED = "disabled";

    @BeforeMethod(alwaysRun = true)
    public void before() {
        disableNativeSelect.show();
    }

    @Test
    public void checkLabelValue() {
        disableNativeSelect.label().has().value("Choose an option");
    }

    @Test
    public void verifyCheckboxCanDisableSelect() {
        pickDisableSelectCheckboxAsChecked();
        disableNativeSelect.waitFor().assertThat().hasAttribute(DISABLED);
    }

    @Test
    public void checkEnabledOptionCanBeSelectedByIndex() {
        pickDisableSelectCheckboxAsUnchecked();
        if (disableNativeSelect.base().get().getAttribute(DISABLED) == null) {
            disableNativeSelect.select(2);
            disableNativeSelect.is().selected(VOLVO);
        }
    }

    @Test
    public void checkDisabledOptionCannotBeSelectedByName() {
        pickDisableSelectCheckboxAsUnchecked();
        if (disableNativeSelect.base().get().getAttribute(DISABLED) == null) {
            String preselectedValue = disableNativeSelect.selected();
            disableNativeSelect.select(SAAB);
            disableNativeSelect.is().selected(preselectedValue);
        }
    }

    @Test
    public void checkListDisabledOptions() {
        disableNativeSelect.has().listDisabled();
    }

    @Test
    public void checkListEnabledOptions() {
        disableNativeSelect.has().listEnabled(Arrays.asList(VOLVO, MERCEDES, AUDI));
    }

    @Test
    public void checkAvailableOptions() {
        disableNativeSelect.assertThat().values(AUDI).values(Arrays.asList(AUDI, SAAB, MERCEDES, VOLVO));
    }
}
