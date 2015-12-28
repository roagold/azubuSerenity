package pages.modules;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by oryabinskiy on 12/23/2015.
 */
public class ProfileMenu {

    @FindBy (css = ("div.megamenu-account-btn"))
    WebElementFacade menuItem;

    public void selectMenuItem(String text){
      if(menuItem.containsElements(text)){
          menuItem.click();
      }

    }
}
