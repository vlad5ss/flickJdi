package android.steps;

import com.epam.jdi.light.mobile.elements.common.MobileDevice;
import com.epam.jdi.light.mobile.elements.composite.MobileScreen;
import com.jdiai.tools.Timer;
import io.qameta.allure.Step;
import org.openqa.selenium.ScreenOrientation;

import static android.wiki.FlickApp.searchPage;

public class SearchSteps {

    @Step("Search item click")
    public void searchItemClick(String name) {
        searchPage.searchBtn.click();
        searchPage.searchTextView.input(name);
        searchPage.searchBtn.click();
        new Timer(5000L).wait(() ->   searchPage.firstImage.isDisplayed());
    }

    @Step("Portrait orientation")
    public void lanscapeOrientation() {
        MobileDevice.rotate(ScreenOrientation.LANDSCAPE);
    }

    @Step("Landscape orientation")
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
}
