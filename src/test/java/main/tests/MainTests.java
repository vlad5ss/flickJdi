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
    public void tapNotification() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapNotification();
        assertThat(notificationPage.welcomeTxt.getText()).as("Stats tab is displayed").isEqualTo(WELCOME);
    }

}


