package android.steps;

import io.qameta.allure.Step;

import static android.wiki.FlickApp.commentPage;
import static android.wiki.FlickApp.favesPage;

public class FoawesSteps {

    @Step("Click folow")
    public void folowClick() {
        favesPage.folowsBtn.click();
    }
}
