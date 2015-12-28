package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;

/**
 * Created by oryabinskiy on 12/11/2015.
 */
@DefaultUrl("http://www.stg.azubu.it")
@At("#HOST/")
public class AzubuHomePage extends PageObject {

    @FindBy(css = (".log-in"))
    WebElementFacade loginLink;

    @FindBy(css = ("#loginUsername"))
    WebElementFacade usernameForm;

    @FindBy(css = ("#loginPassword"))
    WebElementFacade passwordForm;

    @FindBy(css = ".megamenu-content-login-pane .mod-button")
    WebElementFacade loginButton;

    @FindBy(css = (".header-player-avatar"))
    WebElementFacade avatar;

    @FindBy(css = (".header-player-avatar"))
    WebElementFacade profileMenu;

    @FindBy(css = ("#signUpEmail"))
    WebElementFacade registrationEmailForm;

    @FindBy(css = (".megamenu-content-register .mod-button"))
    WebElementFacade signUpButton;

    @FindBy(css = (".megamenu-account-form-element .ng-binding"))
    WebElementFacade forgotPasswordLink;

    @FindBy(css = ("#retrieveEmail"))
    WebElementFacade retrieveEmailForm;

    @FindBy(css = (".megamenu-content-login .mod-button"))
    WebElementFacade retrieveEmailButton;

    @FindBy(css = ("[ng-click=\"navbar.logout();\"]"))
    WebElementFacade logoutButton;

    @FindBy (css = ("[ng-click=\"navbar.showDiscover();\"]"))
    WebElementFacade discoverMenuLink;

    @FindBy (css = (".megamenu-content"))
    WebElementFacade discoverMenuContent;

    @FindBy (css = (".delay-translate [ui-sref=\"games.main\"]"))
    WebElementFacade gamesMenuLink;

    @FindBy (css = (".delay-translate [ui-sref=\"channels.main\"]"))
    WebElementFacade channelsMenuLink;

    @FindBy (css = (".header-logo"))
    WebElementFacade azubuLogo;


    //*********METHODS*********//
    public void openLoginSection(){
        loginLink.click();
    }

    public void fillUsername(String username){
        usernameForm.type(username);
    }

    public void fillPassword(String password){
        passwordForm.type(password);
    }

    public void clickLogin(){
        loginButton.click();
    }

    public void clickLogout(){
        logoutButton.click();
    }

    public void openMegaMenu(){
        profileMenu.click();
    }

    public void openDiscoverMenu(){
        discoverMenuLink.click();
    }

    public void openGamesPageFromHomePage(){
        gamesMenuLink.click();
    }

    public void openChannelsPageFromHomePage(){
        channelsMenuLink.click();
    }

    public void backToHomePage(){
        azubuLogo.click();
    }

    //Assertions
    public void verifyLogin(){
        avatar.shouldBeVisible();
    }

    public void verifyLogout(){
        loginLink.shouldBeVisible();
    }

    public void verifyDiscoverMenuAppear(){
        discoverMenuContent.isDisplayed();
    }
}
