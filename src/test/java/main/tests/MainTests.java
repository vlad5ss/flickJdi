package main.tests;


import android.intefaces.FlickS;
import main.FlickrTestInit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static android.wiki.FlickApp.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MainTests extends FlickrTestInit implements FlickS {

    @Test
    public void loginTest() {
        loginSteps.loginFlickr();
        assertThat(navMenuPages.navMenuFeeds.isDisplayed()).as("nav Menu is Displayed").isTrue();
    }

    @Test
    public void viewProfileTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapProfile();
        assertThat(profilePage.threeDot.isDisplayed()).as("Stats tab is displayed").isTrue();
    }

    @Test
    public void threDotTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapProfile();
        threeDotSteps.clickThre();
        assertThat(profilePage.aboutMe.getText()).as("Stats tab is displayed").contains("About");
        assertThat(profilePage.helpMe.getText()).as("Stats tab is displayed").contains("Help");
    }

    @Test
    public void threSoftDotTest() {
        SoftAssert softAssertion = new SoftAssert();
        loginSteps.loginFlickr();
        navigationMenuSteps.tapProfile();
        threeDotSteps.clickThre();
        softAssertion.assertTrue(profilePage.aboutMe.isDisplayed());
        softAssertion.assertTrue(profilePage.notifySwitchTogle.isDisplayed());
        softAssertion.assertTrue(profilePage.cameraSwitchTogle.isDisplayed());
        softAssertion.assertTrue(profilePage.proCron.isDisplayed());
        softAssertion.assertTrue(profilePage.joinPro.isDisplayed());
        softAssertion.assertAll();
    }

    @Test
    public void clickOnAboutTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapProfile();
        threeDotSteps.clickThre().clickAbout();
        assertThat(aboutPage.credits.getText()).as("Stats tab is displayed").contains("Credits");
    }

    @Test
    public void viewCameraTest() throws InterruptedException {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapCamera();
        cameraSteps.clickAllowCamera();
        Thread.sleep(40000);
    }
}


