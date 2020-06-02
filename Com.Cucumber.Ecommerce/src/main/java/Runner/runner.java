package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import Com.Cucumber.Resourses.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="Com.Cucumber.stepDef",
		dryRun=false,
		monochrome=true,
		strict=true,
		tags= {"@smoke,@reg,@e2e"},
		plugin= {"pretty","html:target/myreport.html","json:target/cucumber.json","junit:target/cucumber.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		)


public class runner {
	 @AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	 }
	

}
