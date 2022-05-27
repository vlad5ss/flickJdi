package android.steps;

import com.jdiai.tools.Timer;

import static android.wiki.FlickApp.cameraPage;

public class CameraSteps {

    public CameraSteps clickAllowCamera(){
        new Timer(10000L).wait(() -> cameraPage.allowPerpessions.isDisplayed());
        cameraPage.allowPerpessions.click();
        cameraPage.allowPerpessions.click();
        cameraPage.allowPerpessions.click();
        return this;
    }
}
