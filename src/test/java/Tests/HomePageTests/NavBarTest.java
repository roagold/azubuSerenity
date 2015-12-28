package Tests.HomePageTests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.AzubuHomePage;
import Steps.*;

/**
 * Created by oryabinskiy on 12/21/2015.
 */
@RunWith(SerenityRunner.class)
public class NavBarTest extends AzubuHomePage {

    @Managed
    WebDriver browserDriver;

    @Steps
    NavBarSteps navBarSteps;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C://Program Files//Google//Chrome//Application//chromedriver.exe");
    }

    @Before
    public void openBrowser(){
        navBarSteps.homePage.open();
        browserDriver.manage().window().maximize();
    }

    @Test
    public void testNavigationBar(){
        navBarSteps.open_discover_menu();
        navBarSteps.open_games_page_from_home_page();
        navBarSteps.open_channels_page_from_home_page();
    }

}
