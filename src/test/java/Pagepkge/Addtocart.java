package Pagepkge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	WebDriver driver;



	@FindBy(xpath="//*[@id=\"header\"]/sticky-header/div[3]/div[2]/div/div/div/nav/div/div[4]/a/i[1]")WebElement Earr;
		
	
	@FindBy(xpath="//*[@id=\"CollectionProductGrid\"]/div[2]/product-item/div/form/div[2]/div[7]/div[3]/div[1]/button")WebElement Earring;
	
	
@FindBy(xpath="//*[@id=\"all-earrings\"]/div[8]/div[4]/div/div[2]/div[2]/div[2]/a[2]")WebElement Viewshoppings;
	

@FindBy(xpath="//*[@id=\"shopify-section-template--15572977352843__main\"]/div/div/div/div/form/div/div[1]/div[2]/a")WebElement page;


public  Addtocart(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}

public void Addcart() 

throws Exception{
	

	Earr.click();
	Earring.click();
	Viewshoppings.click();
  page.click();
  Thread.sleep(1000);
    
	

	
}
	
}
	




