package android.wiki.pages;

import com.epam.jdi.light.mobile.elements.common.Button;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.MobileFindBy;

public class ProfilePage {

    @MobileFindBy(xpath = "//android.widget.TextView[@content-desc=\"Calendar\"]")
    public static Button statsTab;

}
