package android.steps;

import com.jdiai.tools.Timer;
import io.qameta.allure.Step;

import static android.wiki.FlickApp.commentPage;
import static android.wiki.FlickApp.favesPage;

public class FoawesSteps {

    @Step("Click folow")
    public void folowClick() {
        favesPage.folowsBtn.click();
    }

    @Step("Timer Wait")
    public void timerWaitPage() {
        new Timer(10000L).wait(() -> favesPage.plusBtn.isDisplayed());
    }
}
