package Pagepkge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mousehover_page{
	
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"header\"]/sticky-header/div[3]/div[2]/div/div/div/nav/div/div[5]/a/span")WebElement Accessories; 
  
    @FindBy(xpath="//*[@id=\"header\"]/sticky-header/div[3]/div[2]/div/div/div/nav/div/div[5]/div/div/div[4]/a")WebElement BUGAI;
    

public Mousehover_page(WebDriver driver) {
	
this.driver=driver;
PageFactory.initElements(driver,this);
}

public void Mousehover()throws Exception
	{
	Actions act=new Actions(driver);
	Thread.sleep(1000);
	act.moveToElement(Accessories).perform();
    
    Accessories.click();
    BUGAI.click();
	Thread.sleep(1000);       
}
}