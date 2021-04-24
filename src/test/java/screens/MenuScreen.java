package screens;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.screens.BaseScreen;

import java.util.List;

public class MenuScreen extends BaseScreen{

    /** To select the option Privacy & Legal option. */
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='Privacy & Legal button']")
    private AndroidElement privacyButton;
    /**
     * Constructor method.
     *
     * @author Ella Gerstner
     *
     */
    public MenuScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * @author Ella.Gerstner
     *
     * @description Click on the fifth menu and select the option Privacy & Legal option
     */
    public void privacyLegacy(){
        scrollDown(4);
        click(privacyButton);
        WebDriverWait wait = new WebDriverWait(driver,5);
    }

    /**
     * Alert control.
     */
    @Override
    public void alertControl() {
        // TODO Auto-generated method stub

    }
}
