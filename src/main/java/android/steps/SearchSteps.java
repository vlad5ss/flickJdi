package android.steps;

import com.epam.jdi.light.mobile.elements.common.MobileDevice;
import com.epam.jdi.light.mobile.elements.composite.MobileScreen;
import com.jdiai.tools.Timer;
import io.qameta.allure.Step;
import org.openqa.selenium.ScreenOrientation;

import static android.wiki.FlickApp.photoPage;
import static android.wiki.FlickApp.searchPage;

public class SearchSteps {

    @Step("Search item click")
    public void searchItemClick(String name) {
        searchPage.searchBtn.click();
        searchPage.searchTextView.input(name);
        searchPage.searchBtn.click();
    }

    @Step("Cancell item click")
    public void cancellItemClick() {
        searchPage.cancellBtn.click();
    }

    @Step("LandScape orientation")
    public void lanscapeOrientation() {
        MobileDevice.rotate(ScreenOrientation.LANDSCAPE);
    }

    @Step("Portrait orientation")
    public void portraitOrientation() {
        MobileDevice.rotate(ScreenOrientation.PORTRAIT);
    }

    @Step("Scrool down")
    public void scroolDown() {
        MobileScreen.scrollDown(2000);
    }

    @Step("Scrol Botom")
    public void scroollBotom() {
        MobileScreen.scrollToBottom();
    }

    @Step("Scrol top")
    public void scroollTop() {
        MobileScreen.scrollToTop();
    }

    @Step("Tap Photo")
    public void tapPhoto() {
        new Timer(10000L).wait(() -> searchPage.images.isDisplayed());
        searchPage.images.click();
    }

    @Step("Click comment")
    public void commentClick() {
      photoPage.comment.click();
    }

    @Step("Click faves")
    public void favesClick() {
        photoPage.faves.click();
    }
}
