package com.epam.jdi.bdd.stepdefs;

import com.epam.jdi.light.ui.html.elements.common.ColorPicker;
import cucumber.api.java.en.*;

import static com.epam.jdi.light.elements.init.entities.collection.EntitiesCollection.*;

/**
 * Created by Roman Iovlev on 26.09.2019
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */
public class ColorPickerSteps {
    public static ColorPicker colorPicker(String name) {
        return getUI(name, ColorPicker.class);
    }

    @Given("^the \"([^\"]*)\" was set to \"([^\"]*)\" color$")
    @When("^I set \"([^\"]*)\" to \"([^\"]*)\" color$")
    public void preSetColor(String name, String color) {
        colorPicker(name).setColor(color);
    }

    @Then("^the \"([^\"]*)\" has color \"([^\"]*)\"$")
    public void hasColor(String name, String color) {
        colorPicker(name).has().color(color);
    }
}
