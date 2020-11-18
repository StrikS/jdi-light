package io.github.epam.pages;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.elements.common.ProgressBar;

public class HtmlMobilePage extends Section {

    @FindBy(css = "#progress")
    public static ProgressBar staticProgressBar;

}
