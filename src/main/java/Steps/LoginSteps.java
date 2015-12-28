package Steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.AzubuHomePage;
import pages.modules.ProfileMenu;

/**
 * Created by oryabinskiy on 12/15/2015.
 */
public class LoginSteps extends ScenarioSteps {

    public AzubuHomePage homePage;
    public ProfileMenu profileMenu;

    @Step
    public void open_login_form_by_clicking_on_login_link(){
        homePage.openLoginSection();
    }

    @Step
    public void enter_username_and_password(String username, String password){
        homePage.fillUsername(username);
        homePage.fillPassword(password);
    }

    @Step
    public void click_on_login_button(){
        homePage.clickLogin();
    }

    @Step
    public void verify_that_avatar_present(){
        homePage.verifyLogin();
    }

    @Step
    public void logout_from_account(){
        homePage.openMegaMenu();
        homePage.clickLogout();
    }

    @Step
    public void verify_logout(){
        homePage.verifyLogout();
    }

    @Step
    public void open_account(){
        homePage.openMegaMenu();
        profileMenu.selectMenuItem("account");
    }


    }
