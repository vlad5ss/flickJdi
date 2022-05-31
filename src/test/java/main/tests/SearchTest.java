package main.tests;

import android.intefaces.FlickS;
import main.FlickrTestInit;
import org.testng.annotations.Test;

import static android.wiki.FlickApp.searchPage;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest extends FlickrTestInit implements FlickS {

    @Test
    public void tapSearch() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        assertThat(searchPage.firstImage.isDisplayed()).as("Image is displayed").isTrue();
    }

    @Test
    public void tapSearchTest() throws InterruptedException {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.searchItemClick("London");
        Thread.sleep(40000);
//        assertThat(searchPage.firstImage.isDisplayed()).as("Image is displayed").isTrue();
    }

    @Test
    public void tapSearchOrientationTest() throws InterruptedException {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.lanscapeOrientation();
        Thread.sleep(40000);
//        assertThat(searchPage.firstImage.isDisplayed()).as("Image is displayed").isTrue();
    }


    @Test
    public void searchScroolBotomTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.scroollBotom();
    }

    @Test
    public void searchScroolBotomTopTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.scroollBotom();
        searchSteps.scroollTop();
    }
}
