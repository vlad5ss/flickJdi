package android.steps;

import android.config.UserConfig;
import android.wiki.pages.LoginPage;
import com.epam.jdi.light.mobile.elements.common.MobileKeyboard;
import com.jdiai.tools.Timer;
import io.appium.java_client.android.nativekey.AndroidKey;

import static android.wiki.FlickApp.loginPage;
import static android.wiki.FlickApp.navMenuPages;

public class LoginSteps {

    public LoginSteps loginFlickr() {
        new Timer(10000L).wait(() -> loginPage.getStarted.isDisplayed());
        loginPage.getStarted.click();
        new Timer(15000L).wait(() -> loginPage.emailTextfield.isDisplayed());
        MobileKeyboard.pressKey(AndroidKey.ENTER);
        loginPage.emailTextfield.input(UserConfig.CONF.email());
        new Timer(10000L).wait(() -> LoginPage.loginNextBtn.isDisplayed());
        LoginPage.loginNextBtn.click();
        new Timer(10000L).wait(() -> loginPage.passwordTextField.isDisplayed());
        MobileKeyboard.pressKey(AndroidKey.ENTER);
        MobileKeyboard.pressKey(AndroidKey.BACK);
        loginPage.passwordTextField.input(UserConfig.CONF.password());
        LoginPage.signinBtn.click();
        new Timer(20000L).wait(() -> navMenuPages.navMenuFeeds.isDisplayed());
        return this;
    }
}
