package main.tests;


import android.intefaces.FlickS;
import main.FlickrTestInit;
import org.testng.annotations.Test;

import static android.wiki.FlickApp.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MainTests extends FlickrTestInit implements FlickS {

    private String CREDIT = "Credits";
    private String ABOUT = "About";
    private String HELP = "Help";
    private String WELCOME = "Welcome to Flickr!";
    private String NOTIFY_TXT = "Whenever friends follow you or fave your photos, you'll get a notification here";

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
        assertThat(profilePage.aboutMe.getText()).as("Stats tab is displayed").contains(ABOUT);
        assertThat(profilePage.helpMe.getText()).as("Stats tab is displayed").contains(HELP);
    }

    @Test
    public void threSoftDotTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapProfile();
        threeDotSteps.clickThre();
        assertThat(profilePage.aboutMe.isDisplayed()).as("Stats tab is displayed").isTrue();
    }

    @Test
    public void clickOnAboutTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapProfile();
        threeDotSteps.clickThre().clickAbout();
        assertThat(aboutPage.credits.getText()).as("Stats tab is displayed").contains(CREDIT);
    }

    @Test
    public void viewCameraTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapCamera();
        cameraSteps.clickAllowCamera();
    }

    @Test
    public void tapNotificationTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapNotification();
        assertThat(notificationPage.welcomeTxt.getText()).as("Welcome txt").isEqualTo(WELCOME);
    }

    @Test
    public void tapNotificationGetTxtTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapNotification();
        assertThat(notificationPage.notifyTxt.getText()).as("Get Notifi txt").isEqualTo(NOTIFY_TXT);
    }

}


