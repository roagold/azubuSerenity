package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

/**
 * Created by oryabinskiy on 12/21/2015.
 */
@DefaultUrl("http://www.stg.azubu.it/games")
@At("#HOST/games")
public class AzubuGamesPage extends PageObject {

    @FindBy(css = (".stream-list-header"))
    WebElementFacade pageTitle;

    @FindBy(css = (".stream-list-content ul"))
    List<WebElementFacade> gamesList;

    @FindBy(css = ("[ng-click=\"games.getDetail(game)\"]"))
    WebElementFacade gameCategory;

    //******Assertions********//
    public void verifyPageTitle(){
        pageTitle.equals("games");
    }

    public void verifyGamesCategoryDisplayed(){
        gamesList.contains(gameCategory);

    }


}
