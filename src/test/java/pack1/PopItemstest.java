package pack1;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonmethods.ExtentReport;
import commonmethods.Scshoot;
import exceldata.Exceldrive;
import repository.HomePage;
import repository.Productpage;
import testBase.Browserinfo;

public class PopItemstest extends Browserinfo{
	
	static HomePage hp;
	static Productpage pro;
	static Exceldrive excel;
	static ExtentReport extentr;
	
	@BeforeTest
	public void setup()  {
		
		System.out.println("***********Test Started************");
		 extentr= new ExtentReport();
		 extentr.extentsetup();
		
		
	}
	
	@BeforeMethod
	public void browseropen() {
		
		Browserinfo b= new Browserinfo();
		b.launchBrowser("firefox");
		
	}
	@AfterMethod
	public void closebrowser() {
		driver.close();
		
	}
	
	
	@Test
	public void tabletest() throws InterruptedException, IOException {
		
		Thread.sleep(10000);
		 hp = new HomePage(driver);
		 pro= new Productpage(driver); 
		 hp.popitemslink().click();
		hp.tabletlink().click();
		String Actualtablettext=pro.producttext().getText();
		 excel = new Exceldrive();
		String expectedtablettext=excel.readdata(1, 0);
		
		if(Actualtablettext.contains(expectedtablettext)) {
			
			excel.writedata(1, 1, "validdata");
			//Assert.assertTrue(true);
			extentr.pass();
			
		}else {
			
			excel.writedata(1, 1, "invalid");
			Scshoot sc = new Scshoot();
			sc.shot();
			extentr.fail();
			
			
			//Assert.assertTrue(false);

		}
		
		
	}
	
	@Test
	public void laptopTest() throws InterruptedException, IOException {
		
		Thread.sleep(10000);
		 hp = new HomePage(driver);
		 pro= new Productpage(driver); 
		 hp.popitemslink().click();
		hp.laptoplink().click();
		String Actuallaptoptext=pro.producttext().getText();
		 excel = new Exceldrive();
		String expectedlaptoptext=excel.readdata(2, 0);
		
		if(Actuallaptoptext.contains(expectedlaptoptext)) {
			
			excel.writedata(2, 1, "validdata");
			//Assert.assertTrue(true);
			extentr.pass();
			
		}else {
			
			excel.writedata(2, 1, "invalid");
			Scshoot sc = new Scshoot();
			sc.shot();
			//Assert.assertTrue(false);

			extentr.fail();
		}
			
		
	}
	@Test
	public void spktest() throws IOException, InterruptedException {
		
		Thread.sleep(10000);
		 hp = new HomePage(driver);
		 pro= new Productpage(driver); 
		 hp.popitemslink().click();
		hp.spklink().click();
		String Actualspktext=pro.producttext().getText();
		 excel = new Exceldrive();
		String expectedspktext=excel.readdata(3, 0);
		
		if(Actualspktext.contains(expectedspktext)) {
			
			excel.writedata(3, 1, "validdata");
			//Assert.assertTrue(true);

			extentr.pass();
		}else {
			
			excel.writedata(3, 1, "invalid");
			Scshoot sc = new Scshoot();
			sc.shot();
			extentr.fail();
			//Assert.assertTrue(false);

		}
			
		
		
	}
	
	@AfterTest
	public void endtest() {
		
		System.out.println("********TEST ENDED**********");
        extentr.genre();
	}	
	
	
	
	

}
