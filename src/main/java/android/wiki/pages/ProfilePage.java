package android.wiki.pages;

import com.epam.jdi.light.mobile.elements.common.Button;
import com.epam.jdi.light.mobile.elements.common.app.android.TextField;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.MobileFindBy;

public class ProfilePage {

    @MobileFindBy(xpath = "//android.widget.TextView[@content-desc=\"Calendar\"]")
    public static Button statsTab;

    @MobileFindBy(id = "com.flickr.android:id/profile_header_overflow")
    public static Button threeDot;

    @MobileFindBy(id = "com.flickr.android:id/profile_settings_about")
    public static Button about;

    @MobileFindBy(id = "com.flickr.android:id/profile_settings_about")
    public static TextField aboutMe;

    @MobileFindBy(id = "com.flickr.android:id/profile_settings_help")
    public static TextField helpMe;

    @MobileFindBy(id = "com.flickr.android:id/profile_settings_upgrade")
    public static TextField joinPro;

    @MobileFindBy(id = "com.flickr.android:id/profile_settings_notifications_switch")
    public static Button notifySwitchTogle;

    @MobileFindBy(id = "com.flickr.android:id/profile_settings_native_camera_switch")
    public static Button cameraSwitchTogle;

    @MobileFindBy(id = " com.flickr.android:id/pro_crown")
    public static Button proCron;

}
