package android.wiki.pages;

import com.epam.jdi.light.mobile.elements.common.Button;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.MobileFindBy;

public class CameraPage {

    @MobileFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public static Button allowPerpessions;

    @MobileFindBy(id = "com.flickr.android:id/fragment_navigation_camera")
    public static Button cameraBtn;
}
