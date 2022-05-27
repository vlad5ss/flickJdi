package android.wiki;

import android.wiki.pages.LoginPage;
import android.wiki.pages.NavMenuPages;
import android.wiki.pages.ProfilePage;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.JApp;


@JApp(appPackage = "com.flickr.android", appActivity = "com.yahoo.mobile.client.android.flickr.activity.MainActivity")
public class FlickApp {

    public static LoginPage loginPage;
    public static NavMenuPages navMenuPages;
    public static ProfilePage profilePage;
}
