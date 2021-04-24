package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import screens.components.AlertPopup;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

/**
 * DashBoard screen.
 * 
 * @author Hans.Marquez
 *
 */
public class DashBoardScreen extends BaseScreen {

	/**
	 * Constructor method.
	 * 
	 * @author Hans.Marquez
	 * 
	 * @param driver
	 *            : AndroidDriver
	 */
	public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tmpsubacts_root\").childSelector(new UiSelector().textContains(\"Sign In\"))")
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tmpsubacts_primary\")")
    private AndroidElement signInButton;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Map, Tab, 2of5']")
	private AndroidElement mapbutton;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='More Options, Tab, 5of5, Features shopping, photos, mobile orders, tickets, chat with us, help and your profile.']")
	private AndroidElement legaButton;

	@AndroidFindBy(id = "com.disney.wdpro.dlr:id/tab_animated_icon")
	private AndroidElement planButton;

	/**
	 * @author Hans.Marquez
	 *
	 * @description: Handle with random PopUps available in DashBoard Screen.
	 *
	 */
	public LoginScreen goToLoginScreen() {
		click(signInButton);
		return new LoginScreen(driver);
	}
	/**
	 * @author Ella.Gerstner
	 *
	 * @description: Handle the option search hotel in maps.
	 *
	 */
	public MapScreen goToMap(){
		click(mapbutton);
		return new MapScreen(driver);
	}
	/**
	 * @author Ella.Gerstner
	 *
	 * @description: Handle Privacy & Legal option.
	 *
	 */
	public MenuScreen goToMenu(){
		click(legaButton);
		return new MenuScreen(driver);
	}

	/**
	 * @author Ella.Gerstner
	 *
	 * @description: Handle add plans option.
	 *
	 */
	public PlansOption goToPlans(){
		click(planButton);
		return new PlansOption(driver);
	}
	/**
	 * Alert control.
	 */
	@Override
	public void alertControl() {
		int retries = 0;
		try {
			while(retries < 3) {
				AlertPopup alertPopup = new AlertPopup(driver);
				alertPopup.accept();
				retries++;
			}
		} catch (Exception e) {
			log.info("No alerts found.");
			log.info(e);
		}
	}
}
