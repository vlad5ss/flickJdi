package android.steps;

import io.qameta.allure.Step;

import static android.wiki.FlickApp.commentPage;

public class CommentSteps {

    @Step("Add Comment")
    public void writeComment(String name) {
        commentPage.addComment.input(name);
        commentPage.postBtn.click();
    }
}
