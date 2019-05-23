package com.epam.jdi.light.asserts;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.base.BaseElement;
import com.epam.jdi.light.elements.base.BaseUIElement;
import com.epam.jdi.tools.Timer;
import org.hamcrest.Matcher;
import java.util.List;
import static com.epam.jdi.light.asserts.SoftAssert.softAssertThat;
import static com.epam.jdi.light.common.Exceptions.exception;
import static com.epam.jdi.light.settings.TimeoutSettings.TIMEOUT;
import static com.epam.jdi.tools.ReflectionUtils.isClass;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class IsAssert<T extends IsAssert> extends BaseAssert implements CommonAssert<T> {

    public IsAssert(BaseElement element) {
        super(element);
    }

    private BaseUIElement toBaseUIElement(String action) {
        if (!isClass(element.getClass(), BaseUIElement.class))
            throw exception("%s not a BaseUIElement. %s assert allowed only for elements that extends BaseUIElement",
                    element.getName(), action);
        return (BaseUIElement) element;
    }

    @JDIAction("Assert that '{name}' text {0}")
    public T text(Matcher<String> condition) {
        softAssertThat(toBaseUIElement("text").getText(), condition);
        return (T) this;
    }

    @JDIAction("Assert that '{name}' attribute '{0}' {1}")
    public T attr(String attrName, Matcher<String> condition) {
        softAssertThat(element.getAttribute(attrName), condition);
        return (T) this;
    }

    @JDIAction("Assert that '{name}' css '{0}' {1}")
    public T css(String css, Matcher<String> condition) {
        softAssertThat(element.getCssValue(css), condition);
        return (T) this;
    }

    @JDIAction("Assert that '{name}' tag {0}")
    public T tag(Matcher<String> condition) {
        softAssertThat(element.getTagName(), condition);
        return (T) this;
    }

    @JDIAction("Assert that '{name}' has css class {0}")
    public T hasClass(String className) {
        return cssClass(containsString(className));
    }

    @JDIAction("Assert that '{name}' css class {0}")
    public T cssClass(Matcher<String> condition) {
        softAssertThat(element.getAttribute("class"), condition);
        return (T) this;
    }

    @JDIAction("Assert that '{name}' is displayed")
    public T displayed() {
        softAssertThat(element.displayed() ? "displayed" : "hidden", is("displayed"));
        return (T) this;
    }

    @JDIAction("Assert that '{name}' is disappear")
    public T disappear() {
        softAssertThat(element.displayed() ? "displayed" : "disappear", is("disappear"));
        return (T) this;
    }

    @JDIAction("Assert that '{name}' is hidden")
    public T hidden() {
        softAssertThat(element.displayed() ? "displayed" : "hidden", is("hidden"));
        return (T) this;
    }

    public T notAppear() {
        return notAppear(TIMEOUT.get());
    }

    @JDIAction(value = "Assert that '{name}' does not appear during {0} seconds", timeout = 0)
    public T notAppear(int timeoutSec) {
        boolean result = new Timer(timeoutSec * 1000)
                .wait(() -> element.displayed());
        softAssertThat(result ? "displayed" : "hidden", is("hidden"));
        return (T) this;
    }

    @JDIAction("Assert that '{name}' is selected")
    public T selected() {
        softAssertThat(toBaseUIElement("selected").isSelected() ? "selected" : "not selected", is("selected"));
        return (T) this;
    }

    @JDIAction("Assert that '{name}' is deselected")
    public T deselected() {
        softAssertThat(toBaseUIElement("deselected").isSelected() ? "selected" : "not selected", is("not selected"));
        return (T) this;
    }

    @JDIAction("Assert that '{name}' is enabled")
    public T enabled() {
        softAssertThat(element.isEnabled() ? "enabled" : "disabled", is("enabled"));
        return (T) this;
    }

    @JDIAction("Assert that '{name}' is disabled")
    public T disabled() {
         softAssertThat(element.isEnabled() ? "enabled" : "disabled", is("disabled"));
        return (T) this;
    }

    public List<Throwable> getResults() {
        return SoftAssert.getResults();
    }
}
