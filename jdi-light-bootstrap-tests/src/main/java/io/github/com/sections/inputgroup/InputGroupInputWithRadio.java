package io.github.com.sections.inputgroup;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.ui.bootstrap.elements.complex.RadioButtons;
import com.epam.jdi.light.ui.html.elements.common.TextField;

public class InputGroupInputWithRadio extends Section{
    @Css("[type='radio']") public RadioButtons radio;
    @Css(".form-control") public TextField input;
}
