package Steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.AzubuChannelPage;

/**
 * Created by oryabinskiy on 12/23/2015.
 */
public class ModulesSteps extends ScenarioSteps {

    public AzubuChannelPage channelPage;

    @Step
    public void delete_module_from_channel_page(){
        channelPage.deleteModule();
    }

}
