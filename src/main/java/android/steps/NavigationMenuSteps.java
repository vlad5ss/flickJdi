package android.steps;

import com.jdiai.tools.Timer;

import static android.wiki.FlickApp.navMenuPage;
import static android.wiki.FlickApp.profilePage;
import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class NavigationMenuSteps {

    public NavigationMenuSteps tapFeed(){
        log.println("Navmenu click");
        navMenuPage.navMenuFeeds.click();
        return this;
    }

    public NavigationMenuSteps tapSearch(){
        log.println("Navmenu click");
        navMenuPage.navMenuSearch.click();
        return this;
    }

    public NavigationMenuSteps tapProfile(){
        log.println("Navmenu click");
        navMenuPage.navMenuProfile.click();
        new Timer(10000L).wait(() -> profilePage.threeDot.isDisplayed());
        return this;
    }

    public NavigationMenuSteps tapNotification(){
        log.println("Navmenu click");
        navMenuPage.navMenuNotification.click();
        return this;
    }

    public NavigationMenuSteps tapCamera(){
        log.println("Navmenu click");
        navMenuPage.navMenuCamera.click();
        return this;
    }
}
