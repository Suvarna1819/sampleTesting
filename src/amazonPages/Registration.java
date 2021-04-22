package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {

	WebDriver driver;
	
	public Registration(WebDriver driver)
	{
		this.driver=driver;
	}
	

	
	public void entervalues(String element,String input)
	{
		driver.findElement(By.name(element)).sendKeys(input);
	
		
	}
	
	
	public void clickonheader(String element)
	{
		driver.findElement(By.xpath("//a[text()='"+element+"']")).click();
	}
	
}



