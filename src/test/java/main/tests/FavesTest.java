package main.tests;

import android.intefaces.FlickS;
import main.FlickrTestInit;
import org.testng.annotations.Test;

import static android.wiki.FlickApp.favesPage;
import static org.assertj.core.api.Assertions.assertThat;

public class FavesTest extends FlickrTestInit implements FlickS {

    @Test
    public void tapSearchPhotoFawesTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.tapPhoto();
        searchSteps.favesClick();
        fawesSteps.folowClick();
    }

    @Test
    public void tapSearchPhotoFawesPlusBtnTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.tapPhoto();
        searchSteps.favesClick();
        fawesSteps.timerWaitPage();
        assertThat(favesPage.plusBtn.isExist()).as("Folow btn exist").isTrue();
    }
}
