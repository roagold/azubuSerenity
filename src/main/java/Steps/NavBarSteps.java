package Steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.AzubuChannelsPage;
import pages.AzubuGamesPage;
import pages.AzubuHomePage;



/**
 * Created by oryabinskiy on 12/21/2015.
 */
public class NavBarSteps extends ScenarioSteps {

    public AzubuHomePage homePage;
    public AzubuGamesPage gamePage;
    public AzubuChannelsPage channelsPage;

    @Step
    public void open_discover_menu(){
        homePage.openDiscoverMenu();
        homePage.verifyDiscoverMenuAppear();
    }

    @Step
    public void open_games_page_from_home_page(){
        homePage.openGamesPageFromHomePage();
        gamePage.verifyPageTitle();
        gamePage.verifyGamesCategoryDisplayed();
        homePage.backToHomePage();
    }

    @Step
    public void open_channels_page_from_home_page(){
        homePage.openChannelsPageFromHomePage();
        //channelsPage.assertPageTitle();
        homePage.backToHomePage();
    }


}


