package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class PlansOption extends BaseScreen {

    /**
     * Constructor method.
     *
     * @author Ella Gerstner
     *
     */
    public PlansOption(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }
    /** The Reserve Dining option. */
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Reserve Dining, 2 of 5, button']/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    private AndroidElement reserveDining;
    /**
     * @author Ella.Gerstner
     *
     * @descriptionTo validate if the option Reserve Dining is available
     */
    public boolean reserveAvailable(){
        return isElementAvailable(reserveDining);
    }

    /**
     * Alert control.
     */
    @Override
    public void alertControl() {
        // TODO Auto-generated method stub

    }
}
