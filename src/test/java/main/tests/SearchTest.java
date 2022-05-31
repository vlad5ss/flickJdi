package main.tests;

import android.intefaces.FlickS;
import main.FlickrTestInit;
import org.testng.annotations.Test;

import static android.wiki.FlickApp.*;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest extends FlickrTestInit implements FlickS {

    private static final String REGEX_EMOGI = "(?:\uD83C[\uDF00-\uDFFF])|(?:\uD83D[\uDC00-\uDDFF])";
    private static final String REGEX_SPECIAL = "([A-Z]){4}([A-Z]){2}([0-9A-Z]){2}([0-9A-Z]{3})?";
    private static final String CITY_NAME = "Minsk";

    @Test
    public void tapSearchTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        assertThat(searchPage.firstImage.isDisplayed()).as("Image is displayed").isTrue();
    }

    @Test
    public void tapSearchPhotoTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.tapPhoto();
        assertThat(photoPage.avatar.isDisplayed()).as("Avatar is displayed").isTrue();
    }

    @Test
    public void tapSearchPhotoCommentTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.tapPhoto();
        searchSteps.commentClick();
        assertThat(commentPage.postBtn.isDisplayed()).as("Post btn is displayed").isTrue();
    }

    @Test
    public void tapSearchEmogiTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.searchItemClick(REGEX_EMOGI);
        assertThat(searchPage.listImages.size() < 1).as("size images").isTrue();

    }

    @Test
    public void tapSearchSpecialSymbolTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.searchItemClick(REGEX_SPECIAL);
        assertThat(searchPage.listImages.size() < 1).as("size images").isTrue();
    }

    @Test
    public void tapSearchCancellExistTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.searchItemClick(CITY_NAME);
        assertThat(searchPage.cancellBtn.isExist()).as("cancel Button Exist").isTrue();
    }

    @Test
    public void tapSearchCancelltTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.searchItemClick(CITY_NAME);
        searchSteps.cancellItemClick();
        assertThat(searchPage.firstImage.isDisplayed()).as("Image is displayed").isTrue();
    }

    @Test
    public void tapSearchOrientationTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.lanscapeOrientation();
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
