package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;
	By searchTextBox=By.xpath("//*[@id='twotabsearchtextbox']");
	By searchIcon=By.xpath("//*[@id='nav-search']/form/div[2]/div/input");
	By username=By.name("userName");
	By password=By.name("password");
	By loginn=By.name("login");
	By foot=By.xpath("//div[@class='footer']");
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public void login(String user,String pass)
	{
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginn).click();
		
	}
	
	public String footertxt()
	{
		return(driver.findElement(foot).getText());
	}
	
	
	
	
}
