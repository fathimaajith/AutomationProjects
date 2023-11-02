package Pagepkge;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class macsjewelry_page{ 
	
	WebDriver driver;
	

    @FindBy(xpath="//*[@id=\"header\"]/sticky-header/div[3]/div[1]/div/div[3]/a[3]")WebElement login;
	
	@FindBy(xpath="//*[@id=\"CustomerEmail\"]")WebElement email;
	
	@FindBy(xpath="//*[@id=\"CustomerPassword\"]")WebElement password;

	
     @FindBy(xpath="//*[@id=\"customer_login\"]/div/input")WebElement LOGIN;
     
 
	@FindBy(xpath="//*[@id=\"header\"]/sticky-header/div[3]/div[2]/div/div/div/nav/div/div[2]/a")WebElement home; 

public macsjewelry_page(WebDriver driver) {
	
this.driver=driver;
PageFactory.initElements(driver,this);
}

public void Login(String mail,String pssd)
throws Exception
	{	

	login.click();
	email.sendKeys(mail);
	password.sendKeys(pssd);
	LOGIN.click();
	home.click();
	Thread.sleep(1000);

}

}
	


	