package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TicketBooking {

	WebDriver driver;
	
	public TicketBooking(WebDriver driver)
	{
		this.driver=driver;
	}
	

	
	public void selecttypeofjopurney(String input)
	{
		driver.findElement(By.xpath("//input[@type='radio' and @value='"+input+"']")).click();
	
		
	}
	
	

}



