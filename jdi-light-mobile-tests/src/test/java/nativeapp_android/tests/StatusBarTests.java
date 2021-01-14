package nativeapp_android.tests;

import com.epam.jdi.light.mobile.elements.composite.AndroidScreen;
import nativeapp_android.ApiDemosTestInit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static nativeapp.android.apidemos.IndexPage.appPage;
import static nativeapp.android.apidemos.app.AppPage.notificationPage;
import static nativeapp.android.apidemos.app.NotificationPage.clearNotificationButton;
import static nativeapp.android.apidemos.app.NotificationPage.happyButton;
import static nativeapp.android.apidemos.app.NotificationPage.statusBarButton;
import static nativeapp.android.apidemos.app.StatusBarPage.appIcon;
import static nativeapp.android.apidemos.app.StatusBarPage.appName;
import static nativeapp.android.apidemos.app.StatusBarPage.appText;
import static nativeapp.android.apidemos.app.StatusBarPage.clearAllButton;
import static nativeapp.android.apidemos.app.StatusBarPage.noNotifications;
import static nativeapp.android.apidemos.app.StatusBarPage.notificationPanel;
import static nativeapp.android.apidemos.app.StatusBarPage.title;

public class StatusBarTests extends ApiDemosTestInit {

    @BeforeMethod
    public void init() {
        appPage.click();
        notificationPage.click();
        statusBarButton.click();
        happyButton.click();
        AndroidScreen.openNotificationPanel();
    }

    @Test
    public void openNotificationTest() {
        notificationPanel.is().displayed();
        appIcon.is().displayed();

        appName.is().text("API Demos");
        title.is().text("Mood ring");
        appText.is().text("I am happy");

        appIcon.click();
        appIcon.is().displayed();
    }

    @Test
    public void clearAllButtonTest() {
        notificationPanel.is().displayed();
        AndroidScreen.closeNotificationPanel();
        clearAllButton.click();
        AndroidScreen.openNotificationPanel();
        notificationPanel.waitFor().is().displayed();
    }

    @AfterMethod
    public void afterMethodCloseStatusBar() {
        AndroidScreen.closeNotificationPanel();
    }

}
