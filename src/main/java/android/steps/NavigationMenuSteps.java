package android.steps;

import com.jdiai.tools.Timer;

import static android.wiki.FlickApp.navMenuPages;
import static android.wiki.FlickApp.profilePage;
import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class NavigationMenuSteps {

    public NavigationMenuSteps tapFeed(){
        log.println("Navmenu click");
        navMenuPages.navMenuFeeds.click();
        return this;
    }

    public NavigationMenuSteps tapSearch(){
        log.println("Navmenu click");
        navMenuPages.navMenuSearch.click();
        return this;
    }

    public NavigationMenuSteps tapProfile(){
        log.println("Navmenu click");
        navMenuPages.navMenuProfile.click();
        new Timer(10000L).wait(() -> profilePage.threeDot.isDisplayed());
        return this;
    }

    public NavigationMenuSteps tapNotification(){
        log.println("Navmenu click");
        navMenuPages.navMenuNotification.click();
        return this;
    }

    public NavigationMenuSteps tapCamera(){
        log.println("Navmenu click");
        navMenuPages.navMenuCamera.click();
        return this;
    }
}
