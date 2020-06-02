package Com.Cucumber.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Cucumber.Resourses.eventlistener;
import cucumber.api.Scenario;


public class BaseClass {
    private static Logger log=Logger.getLogger(BaseClass.class);
	private static BaseClass base=null;
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wai;
	public static WebDriverEventListener list;
	public static EventFiringWebDriver event;
	
//	private BaseClass(){
//		
//	}
	
	
	public static BaseClass getInstance() {
		
		if(base==null) 
			base=new BaseClass();
		
		   return base;
		
	}
	
	public  WebDriver openBrowser()  {
		try {
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Com\\Cucumber\\Resourses\\Config.properties");
		prop.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(prop.getProperty("browser").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\anush\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
		
		}


		log.info("launching the URL");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(util.implicitWait, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	public static void closeBrowser(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			byte[] scrn=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(file, new File(System.getProperty("user.dir")+"\\target\\FailedScenarios\\"+scenario.getName()+System.currentTimeMillis()+".png"));
			System.out.println(scenario.getName());
			scenario.embed(scrn, "image/png");
			
		}
		
			driver.quit();
		}
	
	
	
	public static void wait(WebElement element) {
		wai.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static void scrolltoelement(WebElement element) {
		JavascriptExecutor exe=((JavascriptExecutor)driver);
		exe.executeScript("arguments[0].scrollintoview()", element);
	}
}


	

