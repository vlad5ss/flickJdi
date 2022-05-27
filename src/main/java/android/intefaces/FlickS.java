package android.intefaces;

import android.steps.CameraSteps;
import android.steps.LoginSteps;
import android.steps.NavigationMenuSteps;
import android.steps.ThreeDotSteps;

public interface FlickS {
    LoginSteps loginSteps = new LoginSteps();
    NavigationMenuSteps navigationMenuSteps = new NavigationMenuSteps();
    ThreeDotSteps threeDotSteps = new ThreeDotSteps();
    CameraSteps cameraSteps = new CameraSteps();
}
