package pseudo.site.section;

import com.epam.jdi.light.elements.complex.DataList;
import com.epam.jdi.light.elements.complex.webList;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Button;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ExtendedSection extends ExtendSection {
    @FindBy(id = "webElementPackage")
    WebElement webElementPackage;
    @FindBy(id = "webElementPublic")
    public WebElement webElementPublic;
    @FindBy(id = "webElementPrivate")
    private WebElement webElementPrivate;
    @UI(".webElementPackageUI")
    WebElement webElementPackageUI;
    @UI(".webElementPublicUI")
    public WebElement webElementPublicUI;
    @Css(".webElementPackageCss")
    WebElement webElementPackageCss;
    @XPath("//*[@class='webElementPublicXPath']")
    public WebElement webElementPublicXPath;

    @FindBy(id = "listWebElementPackage")
    List<WebElement> listWebElementPackage;
    @FindBy(id = "listWebElementPublic")
    public List<WebElement> listWebElementPublic;
    @FindBy(id = "listWebElementPrivate")
    private List<WebElement> listWebElementPrivate;
    @UI(".listWebElementPackageUI")
    List<WebElement> listWebElementPackageUI;
    @UI(".listWebElementPublicUI")
    public List<WebElement> listWebElementPublicUI;
    @Css(".listWebElementPackageCss")
    List<WebElement> listWebElementPackageCss;
    @XPath("//*[@class='listWebElementPublicXPath']")
    public List<WebElement> listWebElementPublicXPath;

    @FindBy(id = "uielementPackage")
    com.epam.jdi.light.elements.common.uiElement uielementPackage;
    @FindBy(id = "uielementPublic")
    public com.epam.jdi.light.elements.common.uiElement uielementPublic;
    @FindBy(id = "uielementPrivate")
    private com.epam.jdi.light.elements.common.uiElement uielementPrivate;
    @UI(".uielementPackageUI")
    com.epam.jdi.light.elements.common.uiElement uielementPackageUI;
    @UI(".uielementPublicUI")
    public com.epam.jdi.light.elements.common.uiElement uielementPublicUI;
    @Css(".uielementPackageCss")
    com.epam.jdi.light.elements.common.uiElement uielementPackageCss;
    @XPath("//*[@class='uielementPublicXPath']")
    public com.epam.jdi.light.elements.common.uiElement uielementPublicXPath;

    @FindBy(id = "buttonPackage")
    Button buttonPackage;
    @FindBy(id = "buttonPublic")
    public Button buttonPublic;
    @FindBy(id = "buttonPrivate")
    private Button buttonPrivate;
    @UI(".buttonPackageUI")
    Button buttonPackageUI;
    @UI(".buttonPublicUI")
    public Button buttonPublicUI;
    @Css(".buttonPackageCss")
    com.epam.jdi.light.elements.common.uiElement buttonPackageCss;
    @XPath("//*[@class='buttonPublicXPath']")
    public com.epam.jdi.light.elements.common.uiElement buttonPublicXPath;

    @FindBy(id = "listUIElementPackage")
    List<com.epam.jdi.light.elements.common.uiElement> listUIElementPackage;
    @FindBy(id = "listUIElementPublic")
    public List<com.epam.jdi.light.elements.common.uiElement> listUIElementPublic;
    @FindBy(id = "listUIElementPrivate")
    private List<com.epam.jdi.light.elements.common.uiElement> listUIElementPrivate;
    @UI(".listUIElementPackageUI")
    List<com.epam.jdi.light.elements.common.uiElement> listUIElementPackageUI;
    @UI(".listUIElementPublicUI")
    public List<com.epam.jdi.light.elements.common.uiElement> listUIElementPublicUI;
    @Css(".listUIElementPackageCss")
    List<com.epam.jdi.light.elements.common.uiElement> listUIElementPackageCss;
    @XPath("//*[@class='listUIElementPublicXPath']")
    public List<com.epam.jdi.light.elements.common.uiElement> listUIElementPublicXPath;

    @FindBy(id = "listButtonPackage")
    List<Button> listButtonPackage;
    @FindBy(id = "listButtonPublic")
    public List<Button> listButtonPublic;
    @FindBy(id = "listButtonPrivate")
    private List<Button> listButtonPrivate;
    @UI(".listButtonPackageUI")
    List<Button> listButtonPackageUI;
    @UI(".listButtonPublicUI")
    public List<Button> listButtonPublicUI;
    @Css(".listButtonPackageCss")
    List<Button> listButtonPackageCss;
    @XPath("//*[@class='listButtonPublicXPath']")
    public List<Button> listButtonPublicXPath;

    @FindBy(id = "webListPackage")
    webList webListPackage;
    @FindBy(id = "webListPublic")
    public webList webListPublic;
    @FindBy(id = "webListPrivate")
    private webList webListPrivate;
    @UI(".webListPackageUI")
    webList webListPackageUI;
    @UI(".webListPublicUI")
    public webList webListPublicUI;
    @Css(".webListPackageCss")
    webList webListPackageCss;
    @XPath("//*[@class='webListPublicXPath']")
    public webList webListPublicXPath;

    @FindBy(id = "uilistQuestionPackage")
    DataList<CustomSection, ?> uilistQuestionPackage;
    @FindBy(id = "uilistQuestionPublic")
    public DataList<CustomSection, ?> uilistQuestionPublic;
    @FindBy(id = "uilistQuestionPrivate")
    private DataList<CustomSection, ?> uilistQuestionPrivate;
    @UI(".uilistQuestionPackageData")
    DataList<CustomSection, ?> uilistQuestionPackageData;
    @UI(".uilistQuestionPublicData")
    public DataList<CustomSection, ?> uilistQuestionPublicData;
    @Css(".uilistQuestionPackageCss")
    DataList<CustomSection, ?> uilistQuestionPackageCss;
    @XPath("//*[@class='uilistQuestionPublicXPath']")
    public DataList<CustomSection, ?> uilistQuestionPublicXPath;

    @FindBy(id = "uilistSomedataPackage")
    DataList<CustomSection, SomeData> uilistSomedataPackage;
    @FindBy(id = "uilistSomedataPublic")
    public DataList<CustomSection, SomeData> uilistSomedataPublic;
    @FindBy(id = "uilistSomedataPrivate")
    private DataList<CustomSection, SomeData> uilistSomedataPrivate;
    @UI(".uilistSomedataPackageData")
    DataList<CustomSection, SomeData> uilistSomedataPackageData;
    @UI(".uilistSomedataPublicData")
    public DataList<CustomSection, SomeData> uilistSomedataPublicData;
    @Css(".uilistSomedataPackageCss")
    DataList<CustomSection, SomeData> uilistSomedataPackageCss;
    @XPath("//*[@class='uilistSomedataPublicXPath']")
    public DataList<CustomSection, SomeData> uilistSomedataPublicXPath;

    @JDropdown(root = "div[ui=droplistPackage", value = "input", list = "li", expand = ".expand")
    Dropdown droplistPackage;
    @JDropdown(root = "div[ui=droplistPublic", value = "input", list = "li", expand = ".expand")
    public Dropdown droplistPublic;
    @JDropdown(root = "div[ui=droplistPrivate", value = "input", list = "li", expand = ".expand")
    private Dropdown droplistPrivate;
    private static Dropdown droplistPrivateStatic;
    @UI(".droplistPackageUI")
    Dropdown droplistPackageUI;
    @UI(".droplistPublicUI")
    public Dropdown droplistPublicUI;

    public WebElement getWebElementPackage() {
        return webElementPackage;
    }

    public void setWebElementPackage(WebElement webElementPackage) {
        this.webElementPackage = webElementPackage;
    }

    public WebElement getWebElementPrivate() {
        return webElementPrivate;
    }

    public void setWebElementPrivate(WebElement webElementPrivate) {
        this.webElementPrivate = webElementPrivate;
    }


    public WebElement getWebElementPackageUI() {
        return webElementPackageUI;
    }

    public void setWebElementPackageUI(WebElement webElementPackageUI) {
        this.webElementPackageUI = webElementPackageUI;
    }

    public List<WebElement> getListWebElementPackage() {
        return listWebElementPackage;
    }

    public void setListWebElementPackage(List<WebElement> listWebElementPackage) {
        this.listWebElementPackage = listWebElementPackage;
    }

    public List<WebElement> getListWebElementPrivate() {
        return listWebElementPrivate;
    }

    public void setListWebElementPrivate(List<WebElement> listWebElementPrivate) {
        this.listWebElementPrivate = listWebElementPrivate;
    }

    public List<WebElement> getListWebElementPackageUI() {
        return listWebElementPackageUI;
    }

    public void setListWebElementPackageUI(List<WebElement> listWebElementPackageUI) {
        this.listWebElementPackageUI = listWebElementPackageUI;
    }

    public com.epam.jdi.light.elements.common.uiElement getUielementPackage() {
        return uielementPackage;
    }

    public void setUielementPackage(com.epam.jdi.light.elements.common.uiElement uielementPackage) {
        this.uielementPackage = uielementPackage;
    }

    public com.epam.jdi.light.elements.common.uiElement getUielementPrivate() {
        return uielementPrivate;
    }

    public void setUielementPrivate(com.epam.jdi.light.elements.common.uiElement uielementPrivate) {
        this.uielementPrivate = uielementPrivate;
    }

    public com.epam.jdi.light.elements.common.uiElement getUielementPackageUI() {
        return uielementPackageUI;
    }

    public void setUielementPackageUI(com.epam.jdi.light.elements.common.uiElement uielementPackageUI) {
        this.uielementPackageUI = uielementPackageUI;
    }

    public Button getButtonPackage() {
        return buttonPackage;
    }

    public void setButtonPackage(Button buttonPackage) {
        this.buttonPackage = buttonPackage;
    }

    public Button getButtonPrivate() {
        return buttonPrivate;
    }

    public void setButtonPrivate(Button buttonPrivate) {
        this.buttonPrivate = buttonPrivate;
    }

    public Button getButtonPackageUI() {
        return buttonPackageUI;
    }

    public void setButtonPackageUI(Button buttonPackageUI) {
        this.buttonPackageUI = buttonPackageUI;
    }

    public List<com.epam.jdi.light.elements.common.uiElement> getListUIElementPackage() {
        return listUIElementPackage;
    }

    public void setListUIElementPackage(List<com.epam.jdi.light.elements.common.uiElement> listUIElementPackage) {
        this.listUIElementPackage = listUIElementPackage;
    }

    public List<com.epam.jdi.light.elements.common.uiElement> getListUIElementPrivate() {
        return listUIElementPrivate;
    }

    public void setListUIElementPrivate(List<com.epam.jdi.light.elements.common.uiElement> listUIElementPrivate) {
        this.listUIElementPrivate = listUIElementPrivate;
    }


    public List<com.epam.jdi.light.elements.common.uiElement> getListUIElementPackageUI() {
        return listUIElementPackageUI;
    }

    public void setListUIElementPackageUI(List<com.epam.jdi.light.elements.common.uiElement> listUIElementPackageUI) {
        this.listUIElementPackageUI = listUIElementPackageUI;
    }

    public List<Button> getListButtonPackage() {
        return listButtonPackage;
    }

    public void setListButtonPackage(List<Button> listButtonPackage) {
        this.listButtonPackage = listButtonPackage;
    }

    public List<Button> getListButtonPrivate() {
        return listButtonPrivate;
    }

    public void setListButtonPrivate(List<Button> listButtonPrivate) {
        this.listButtonPrivate = listButtonPrivate;
    }

    public List<Button> getListButtonPackageUI() {
        return listButtonPackageUI;
    }

    public void setListButtonPackageUI(List<Button> listButtonPackageUI) {
        this.listButtonPackageUI = listButtonPackageUI;
    }

    public webList getWebListPackage() {
        return webListPackage;
    }

    public void setWebListPackage(webList webListPackage) {
        this.webListPackage = webListPackage;
    }

    public webList getWebListPrivate() {
        return webListPrivate;
    }

    public void setWebListPrivate(webList webListPrivate) {
        this.webListPrivate = webListPrivate;
    }

    public webList getWebListPackageUI() {
        return webListPackageUI;
    }

    public void setWebListPackageUI(webList webListPackageUI) {
        this.webListPackageUI = webListPackageUI;
    }

    public DataList<CustomSection, ?> getUilistQuestionPackage() {
        return uilistQuestionPackage;
    }

    public void setUilistQuestionPackage(DataList<CustomSection, ?> uilistQuestionPackage) {
        this.uilistQuestionPackage = uilistQuestionPackage;
    }

    public DataList<CustomSection, ?> getUilistQuestionPrivate() {
        return uilistQuestionPrivate;
    }

    public void setUilistQuestionPrivate(DataList<CustomSection, ?> uilistQuestionPrivate) {
        this.uilistQuestionPrivate = uilistQuestionPrivate;
    }


    public DataList<CustomSection, ?> getUilistQuestionPackageData() {
        return uilistQuestionPackageData;
    }

    public void setUilistQuestionPackageData(DataList<CustomSection, ?> uilistQuestionPackageData) {
        this.uilistQuestionPackageData = uilistQuestionPackageData;
    }

    public DataList<CustomSection, SomeData> getUilistSomedataPackage() {
        return uilistSomedataPackage;
    }

    public void setUilistSomedataPackage(DataList<CustomSection, SomeData> uilistSomedataPackage) {
        this.uilistSomedataPackage = uilistSomedataPackage;
    }

    public DataList<CustomSection, SomeData> getUilistSomedataPrivate() {
        return uilistSomedataPrivate;
    }

    public void setUilistSomedataPrivate(DataList<CustomSection, SomeData> uilistSomedataPrivate) {
        this.uilistSomedataPrivate = uilistSomedataPrivate;
    }

    public DataList<CustomSection, SomeData> getUilistSomedataPackageData() {
        return uilistSomedataPackageData;
    }

    public void setUilistSomedataPackageData(DataList<CustomSection, SomeData> uilistSomedataPackageData) {
        this.uilistSomedataPackageData = uilistSomedataPackageData;
    }

    public Dropdown getDroplistPackage() {
        return droplistPackage;
    }

    public void setDroplistPackage(Dropdown droplistPackage) {
        this.droplistPackage = droplistPackage;
    }

    public Dropdown getDroplistPrivate() {
        return droplistPrivate;
    }

    public void setDroplistPrivate(Dropdown droplistPrivate) {
        this.droplistPrivate = droplistPrivate;
    }

    public static Dropdown getDroplistPrivateStatic() {
        return droplistPrivateStatic;
    }

    public static void setDroplistPrivateStatic(Dropdown droplistPrivateStatic) {
        ExtendedSection.droplistPrivateStatic = droplistPrivateStatic;
    }

    public Dropdown getDroplistPackageUI() {
        return droplistPackageUI;
    }

    public void setDroplistPackageUI(Dropdown droplistPackageUI) {
        this.droplistPackageUI = droplistPackageUI;
    }

    public WebElement getWebElementPackageCss() {
        return webElementPackageCss;
    }

    public List<WebElement> getListWebElementPackageCss() {
        return listWebElementPackageCss;
    }

    public com.epam.jdi.light.elements.common.uiElement getUielementPackageCss() {
        return uielementPackageCss;
    }

    public com.epam.jdi.light.elements.common.uiElement getButtonPackageCss() {
        return buttonPackageCss;
    }

    public List<com.epam.jdi.light.elements.common.uiElement> getListUIElementPackageCss() {
        return listUIElementPackageCss;
    }

    public List<Button> getListButtonPackageCss() {
        return listButtonPackageCss;
    }

    public webList getWebListPackageCss() {
        return webListPackageCss;
    }

    public DataList<CustomSection, ?> getUilistQuestionPackageCss() {
        return uilistQuestionPackageCss;
    }

    public DataList<CustomSection, SomeData> getUilistSomedataPackageCss() {
        return uilistSomedataPackageCss;
    }
}
