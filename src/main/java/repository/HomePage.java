package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	static WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement popitemslink() {
		
	return	driver.findElement(By.linkText("POPULAR ITEMS"));
		
	}
	
	
	public WebElement tabletlink() {
		
		return	driver.findElement(By.id("details_16"));
			
		}
	
	
	public WebElement laptoplink() {
		
		return	driver.findElement(By.id("details_10"));
			
		}
	
	public WebElement spklink() {
		
		return	driver.findElement(By.id("details_21"));
			
		}
	
	

}
