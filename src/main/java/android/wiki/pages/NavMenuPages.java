package android.wiki.pages;

import com.epam.jdi.light.mobile.elements.common.Button;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.MobileFindBy;

public class NavMenuPages {
    @MobileFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Activity\"]")
    public static Button navMenuFeeds;

    @MobileFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Search\"]")
    public static Button navMenuSearch;

    @MobileFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Profile\"]")
    public static Button navMenuProfile;

    @MobileFindBy(id = "com.flickr.android:id/fragment_navigation_notifications")
    public static Button navMenuNotification;

    @MobileFindBy(id = "com.flickr.android:id/fragment_navigation_camera")
    public static Button navMenuCamera;
}
