package android.wiki;

import android.wiki.pages.*;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.JApp;


@JApp(appPackage = "com.flickr.android", appActivity = "com.yahoo.mobile.client.android.flickr.activity.MainActivity")
public class FlickApp {
    public static LoginPage loginPage;
    public static NavMenuPage navMenuPage;
    public static ProfilePage profilePage;
    public static AboutPage aboutPage;
    public static CameraPage cameraPage;
    public static NotificationPage notificationPage;
    public static SearchPage searchPage;
    public static PhotoPage photoPage;
    public static CommentPage commentPage;
    public static FavesPage favesPage;
}
