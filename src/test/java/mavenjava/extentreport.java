package mavenjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreport {
	 ExtentReports s;
	
	@BeforeTest
	
	public void config()
	{
		String pol=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(pol);
         reporter.config().setCSS("Best automation");
         reporter.config().setDocumentTitle("Jenkinsreport");
        
          s=new ExtentReports();
         s.attachReporter(reporter);
         s.setSystemInfo("Tester", "NK");
         
	
	}
	@Test
	public void initial()
	{
		s.createTest("initial");
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\rahulshettyacademy.com");
		System.out.println(driver.getTitle());
	}

}
