package main.tests;


import android.steps.FlickS;
import com.jdiai.tools.Timer;
import main.FlickrTestInit;
import org.testng.annotations.Test;

import static android.wiki.FlickApp.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MainTests extends FlickrTestInit implements FlickS {

    @Test
    public void loginTest() throws InterruptedException {
        loginSteps.loginFlickr();
        assertThat(navMenuPages.navMenuFeeds.isDisplayed()).as("nav Menu is Displayed").isTrue();
        Thread.sleep(20000);
    }


    @Test
    public void viewProfile() throws InterruptedException {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapProfile();
        assertThat(profilePage.statsTab.isDisplayed()).as("Stats tab is displayed").isTrue();
        Thread.sleep(20000);
    }
}


