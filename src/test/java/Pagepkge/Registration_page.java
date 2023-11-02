package Pagepkge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_page {

	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id=\"header\"]/sticky-header/div[3]/div[1]/div/div[3]/a[3]")WebElement Account;
	 @FindBy(xpath="//*[@id=\"MainContent\"]/div[2]/div/div[2]/a")WebElement SIGNUP;
	@FindBy(xpath="//*[@id=\"FirstName\"]")WebElement Firstname;
	@FindBy(xpath="//*[@id=\"LastName\"]")WebElement Lastname;
	@FindBy(xpath="//*[@id=\"Email\"]")WebElement Email;
	@FindBy(xpath="//*[@id=\"CreatePassword\"]")WebElement Password;
	@FindBy(xpath="//*[@id=\"create_customer\"]/div/input")WebElement submit;
	
	public Registration_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}

		public void Register(String Fname,String Lname,String email,String pswd)
		throws Exception
			{
			Account.click();
			SIGNUP.click();
			Firstname.sendKeys(Fname);
			Lastname.sendKeys(Lname);
			Email.sendKeys(email);
			Password.sendKeys(pswd);
			submit.click();
			Thread.sleep(1000);
			
}
}
