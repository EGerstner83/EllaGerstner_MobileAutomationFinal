package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.springframework.context.annotation.Description;

import screens.*;
import util.tests.BaseMobileTest;

public class LoginAppTest extends BaseMobileTest {

	@Description(value = "Failed assertive login test ID:0001")
	@Test()
	public void failedLoginTest() {
		log.info("Starting Failed assertive login test");
		DashBoardScreen dashBoard = dismissTutorial();
		LoginScreen login = dashBoard.goToLoginScreen();
		login.fillInLoginData("email", "password");
		String bannerText = login.getBannerText();
		Assert.assertEquals(bannerText, "Something's not right…. We're sorry for the inconvenience!");
	}

	@Description(value = "Category list Test ID:0002")
	@Test()
	public void listTest() {
		log.info("Starting Category list test");
		DashBoardScreen dashBoard = dismissTutorial();
		MapScreen mapas = dashBoard.goToMap();
		mapas.mapsOption();
		String dropList = mapas.getDropList();
		Assert.assertEquals(dropList, "Hotels");
	}

	@Description(value = "Privacy & Legal ID:0003")
	@Test()
	public void menuScreen() {
		log.info("Starting Privacy & Legal ");
		DashBoardScreen dashBoard = dismissTutorial();
		MenuScreen menuScreen=dashBoard.goToMenu();
		menuScreen.privacyLegacy();
	}

	@Description(value = "Adds plans option ID:0004")
	@Test()
	public void menuMain() {
		log.info("Adds plans option");
		DashBoardScreen dashBoard = dismissTutorial();
		PlansOption plansOption= dashBoard.goToPlans();
		boolean answer = plansOption.reserveAvailable();
		Assert.assertEquals(answer,true);
	}
}