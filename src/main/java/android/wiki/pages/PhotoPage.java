package android.wiki.pages;

import com.epam.jdi.light.mobile.elements.common.Button;
import com.epam.jdi.light.mobile.elements.common.app.android.TextField;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.MobileFindBy;

public class PhotoPage {

    @MobileFindBy(id = "com.flickr.android:id/activity_lightbox_avatar")
    public static Button avatar;

    @MobileFindBy(id = "com.flickr.android:id/activity_lightbox_up")
    public static Button closeBtn;

    @MobileFindBy(id = "com.flickr.android:id/activity_lightbox_footer")
    public static Button footerView;

    @MobileFindBy(id = "com.flickr.android:id/activity_lightbox_comment_count_left")
    public static Button comment;

    @MobileFindBy(id = "com.flickr.android:id/activity_lightbox_fav_count_left")
    public static Button faves;

    @MobileFindBy(id = "com.flickr.android:id/profile_settings_upgrade")
    public static TextField joinPro;


}
