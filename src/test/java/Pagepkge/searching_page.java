package Pagepkge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searching_page {
	
	WebDriver driver;
	
public  searching_page(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}  

      @FindBy(xpath="//*[@id=\"header\"]/sticky-header/div[3]/div[1]/div/div[3]/a[1]/i/svg")WebElement search;

	@FindBy(xpath="//*[@id=\"Search\"]")WebElement KAMARBAND;
	
	@FindBy(xpath="//*[@id=\"nose-pin-buy-pure-silver-nose-ring-online-in-india-macs\"]/div[7]/div[2]/div/div[2]/div/form/label/i/svg")WebElement searching;

			
	@FindBy(xpath="//*[@id=\"nose-pin-buy-pure-silver-nose-ring-online-in-india-macs\"]/div[7]/div[2]/div/div[2]/div/div[2]/div[2]/a")WebElement view;


	
		public void Search()throws Exception
		{
			search.click();
		    
			KAMARBAND.sendKeys("Product");
		 
		    searching.click();
	     	view.click();
			Thread.sleep(1000);       
		}  
	
}
