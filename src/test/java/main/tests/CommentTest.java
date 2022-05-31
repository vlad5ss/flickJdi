package main.tests;

import android.intefaces.FlickS;
import main.FlickrTestInit;
import org.testng.annotations.Test;

import static android.wiki.FlickApp.commentPage;
import static org.assertj.core.api.Assertions.assertThat;

public class CommentTest extends FlickrTestInit implements FlickS {

    @Test
    public void tapSearchPhotoCommentTest() {
        loginSteps.loginFlickr();
        navigationMenuSteps.tapSearch();
        searchSteps.tapPhoto();
        searchSteps.commentClick();
        String actulResult = "Thanks";
        commentSteps.writeComment(actulResult);
        assertThat(actulResult).as("Comment is the same").isEqualTo(commentPage.messageTxt.getText());
    }
}
