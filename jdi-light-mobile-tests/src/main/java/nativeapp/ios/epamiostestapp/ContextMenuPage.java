package nativeapp.ios.epamiostestapp;

import com.epam.jdi.light.mobile.elements.base.mobileappuielement;
import com.epam.jdi.light.mobile.elements.composite.ios.app.ContextMenu;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.MobileFindBy;

public class ContextMenuPage {

    @MobileFindBy(accessibilityId = "Long press to open the menu")
    public static ContextMenu contextMenu;

    @MobileFindBy(accessibilityId = "one")
    public static mobileappuielement optionOne;

    @MobileFindBy(accessibilityId = "two")
    public static mobileappuielement optionTwo;

    @MobileFindBy(accessibilityId = "three")
    public static mobileappuielement optionThree;

}
