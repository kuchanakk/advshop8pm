package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Productpage {
	
	
	static WebDriver driver;
	public Productpage(WebDriver driver) {
		this.driver=driver;
		
	}

	public WebElement producttext() {
		
		return driver.findElement(By.xpath("//*[@id=\"Description\"]/h1"));
	}
	
	

}
