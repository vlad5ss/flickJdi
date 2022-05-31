package android.wiki.pages;

import com.epam.jdi.light.mobile.elements.common.Button;
import com.epam.jdi.light.mobile.elements.common.app.android.TextField;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.MobileFindBy;

public class CommentPage {

    @MobileFindBy(id = "com.flickr.android:id/add_comment_post")
    public static Button postBtn;

    @MobileFindBy(id = "com.flickr.android:id/fragment_header_back")
    public static Button backBtn;

    @MobileFindBy(id = "com.flickr.android:id/add_comment_content")
    public static TextField addComment;

    @MobileFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[6]/android.widget.TextView[2]")
    public static TextField messageTxt;
}
