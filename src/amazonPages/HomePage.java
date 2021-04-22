package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


		
		WebDriver driver;
		By searchTextBox = By.xpath("//*[@id='twotabsearchtextbox']");
		 	
		

		public HomePage(WebDriver driver)
		{
			this.driver=driver;
		}

		
		public String  titleofhomepage()
		{
			return driver.getTitle();
		}
		public void launchUrl()
		{
			driver.get("https://www.amazon.in/");
		}
		
		public void searchProduct(String product)
		{
			driver.findElement(searchTextBox).sendKeys(product);
			driver.findElement(By.id("nav-search-submit-button")).click();
		}
		
		public void clickonlink(String link){
			
			driver.findElement(By.xpath("//*[@id='nav-xshop']/a[text()='"+link+"']")).click();
		}

}
