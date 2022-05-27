package android.wiki.pages;

import com.epam.jdi.light.mobile.elements.common.Button;
import com.epam.jdi.light.mobile.elements.common.Text;
import com.epam.jdi.light.mobile.elements.common.app.android.TextField;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.MobileFindBy;

import java.util.List;

public class LoginPage {

    @MobileFindBy(id = "com.flickr.android:id/activity_welcome_sign_button")
    public static Button getStarted;

    @MobileFindBy(xpath = "//android.widget.EditText[@content-desc=\"Email address\"]")
    public static TextField emailTextfield;

    @MobileFindBy(xpath = "//android.webkit.WebView[@content-desc=\"Flickr Login\"]/android.view.View[4]")
    public static Button loginNextBtn;

    @MobileFindBy(xpath = "//android.webkit.WebView[@content-desc=\"Flickr Login\"]/android.view.View[4]/android.widget.EditText[2]")
    public static TextField passwordTextField;

    @MobileFindBy(xpath = "//android.widget.Button[@content-desc=\"Sign in\"]")
    public static Button signinBtn;

}
