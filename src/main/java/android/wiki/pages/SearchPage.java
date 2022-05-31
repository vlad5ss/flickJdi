package android.wiki.pages;

import com.epam.jdi.light.mobile.elements.common.Button;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.MobileFindBy;
import com.epam.jdi.light.ui.html.elements.common.Image;
import com.epam.jdi.light.ui.html.elements.common.TextField;

public class SearchPage {

    @MobileFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]")
    public static Image firstImage;

    @MobileFindBy(id = "com.flickr.android:id/search_view_search_btn")
    public static Button searchBtn;

    @MobileFindBy(id = "com.flickr.android:id/search_view_autocompl_textview")
    public static TextField searchTextView;

}
