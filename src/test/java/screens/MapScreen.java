package screens;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;


public class MapScreen extends BaseScreen{
    /**
     * Constructor method.
     *
     * @author Hans.Marquez
     * @param driver the driver
     */
    public MapScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /** To click on select category. */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(id = "com.disney.wdpro.dlr:id/categoryTitle")
    private AndroidElement dropList;

    /** To select the Hotels category. */
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Hotels, Category, 11of12, button']")
    private AndroidElement hotelOption;

    /** To show all result belongs to this category. */
    @AndroidFindBy(id= "com.disney.wdpro.dlr:id/toggleTitle")
    private AndroidElement showList;

    /**
     * @author Ella.Gerstner
     *
     * @description: Handle the option search hotel in maps.
     *
     */
    public void mapsOption(){
        click(dropList);
        click(hotelOption,1);
        click(showList);
    }

    public String getDropList(){
        return dropList.getAttribute("text");
    }

    /**
     * Alert control.
     */
    @Override
    public void alertControl() {
        // TODO Auto-generated method stub
    }


}
