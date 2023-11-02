package Pagepkge;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class Screenshot_page {
	WebDriver driver;

	public Screenshot_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}

		public void Screen() throws Exception
		{
		driver.get("https://www.macsjewelry.com");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("E:\\screenshotes.png"));
		}
}
