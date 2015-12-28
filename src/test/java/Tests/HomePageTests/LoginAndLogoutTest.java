package Tests.HomePageTests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.AzubuHomePage;
import Steps.LoginSteps;

/**
 * Created by oryabinskiy on 12/11/2015.
 */
@RunWith(SerenityRunner.class)
public class LoginAndLogoutTest extends AzubuHomePage{

    @Managed
    WebDriver browserDriver;

    @Steps
    LoginSteps loginSteps;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C://Program Files//Google//Chrome//Application//chromedriver.exe");
    }
    @Before
    public void openBrowser(){
    loginSteps.homePage.open();
    browserDriver.manage().window().maximize();
    }

    @Test
    public void testLoginAndLogout(){
        loginSteps.open_login_form_by_clicking_on_login_link();
        loginSteps.enter_username_and_password("stage_roagold", "Oleg6534");
        loginSteps.click_on_login_button();
        loginSteps.verify_that_avatar_present();
        loginSteps.open_account();
        loginSteps.verify_that_avatar_present();
        loginSteps.logout_from_account();
        loginSteps.verify_logout();
    }
}








