package commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import testBase.Browserinfo;

public class Scshoot extends Browserinfo {
	
	
	
	public  void  shot() throws IOException {
       
        File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile,new File("C:\\Users\\kiran\\eclipse-workspace\\mavenseleniumproject\\resource\\schot\\error1.png"));	
		
	}

	

}
