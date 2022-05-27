package android.steps;

import com.jdiai.tools.Timer;

import static android.wiki.FlickApp.profilePage;

public class ThreeDotSteps {

    public ThreeDotSteps clickThre(){
        profilePage.threeDot.click();
        new Timer(10000L).wait(() -> profilePage.joinPro.isDisplayed());
        return this;
    }

    public ThreeDotSteps clickAbout(){
        profilePage.about.click();
        return this;
    }
}
