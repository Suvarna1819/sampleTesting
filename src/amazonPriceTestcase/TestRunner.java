package amazonPriceTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amazonPages.HomePage;


/**
 * @author USER
 *
 */
public class TestRunner {
	
	
	public static void main(String[] args) throws InterruptedException {
	
       System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Automate\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		HomePage p=new HomePage(driver);
		p.launchUrl();
		p.searchProduct("Samsung");
	p.titleofhomepage();
		p.clickonlink("Mobiles");
		
		
		
		

	}

}

