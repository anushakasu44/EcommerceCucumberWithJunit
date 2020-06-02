package Com.Cucumber.stepDef;

import java.io.IOException;

import Com.Cucumber.Util.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;




public class Hooks extends BaseClass{

	@Before
	public void setup() {
		BaseClass bas=BaseClass.getInstance();
		bas.openBrowser();
	}
	
	
	@After
	public void teardown(Scenario scenario) throws IOException {
		BaseClass.closeBrowser(scenario);
	}
}

