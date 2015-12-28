package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by oryabinskiy on 12/21/2015.
 */
@DefaultUrl("http://www.stg.azubu.it/channels")
@At("#HOST/channels")
public class AzubuChannelsPage {

    @FindBy (css = (".stream-list-header"))
    WebElementFacade pageTitle;

    //****Assertions******//

    public void assertPageTitle(){
        pageTitle.equals("channels");
    }

}
