package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import pages.modules.ProfileMenu;

/**
 * Created by oryabinskiy on 12/21/2015.
 */
@DefaultUrl("http://www.stg.azubu.it/")
public class AzubuChannelPage extends ProfileMenu{

    @FindBy (css = ("[ng-if=\"navbar.isAdministeringBroadcaster\"]"))
    WebElementFacade adminTitle;

    @FindBy (css = ("ng-transclude ul li"))
    WebElementFacade module;

    @FindBy (css = (".az-brick-exit"))
    WebElementFacade deleteModule;

    public void deleteModule(){
        module.shouldBeVisible();
        module.setWindowFocus();
        deleteModule.click();
    }
}
