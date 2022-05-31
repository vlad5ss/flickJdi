package main.tests;

import android.intefaces.FlickS;
import main.FlickrTestInit;
import org.testng.annotations.Test;

import static android.wiki.FlickApp.*;
import static org.assertj.core.api.Assertions.assertThat;

public class FavesTest extends FlickrTestInit implements FlickS {


    @Test
    public void tapSearchPhotoFawesTest() throws InterruptedException {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.tapPhoto();
        searchSteps.favesClick();
        fawesSteps.folowClick();
        Thread.sleep(40000);
       // assertThat(actulResult).as("Comment is the same").isEqualTo(commentPage.messageTxt.getText());
    }
}
