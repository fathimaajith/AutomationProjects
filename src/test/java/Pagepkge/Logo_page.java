package Pagepkge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Logo_page {
	
	WebDriver driver;
	
	public Logo_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	
	
	private boolean Logo;

		public void Logo()throws Exception{
			
	 Boolean Logo=driver.findElement(By.xpath("//*[@id=\"header\"]/sticky-header/div[3]/div[1]/div/div[2]/div")).isDisplayed();
	 
	if(Logo)
	{
		System.out.println("Logo is dispaly");
	}
	else
	{
		System.out.println("Logo is not display");        
	}    
     
	}
}





