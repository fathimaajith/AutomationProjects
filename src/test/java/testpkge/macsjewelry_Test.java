package testpkge;


import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import Pagepkge.Mousehover_page;
import Pagepkge.Registration_page;
import Pagepkge.Screenshot_page;
import Pagepkge.macsjewelry_page;
import Pagepkge.searching_page;
import Pagepkge.Addtocart;
import Pagepkge.Logo_page;

public class macsjewelry_Test{
	WebDriver driver;
	

@BeforeTest
	
	public void setUp(){
	
		driver = new ChromeDriver();
		driver.get("https://www.macsjewelry.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();

	}

@Test
public void test()throws Exception{

	Registration_page ob1=new Registration_page(driver);
	
	ob1.Register("Fathima","A","ruku2000@email.com","rubi2000");
 

	macsjewelry_page ob2=new macsjewelry_page(driver);
		
    ob2.Login("ruk2000@email.com","rubi2000");
 
    	
    	 Mousehover_page ob3=new Mousehover_page(driver);
    	    ob3.Mousehover();
    	    
   
    searching_page ob4=new searching_page(driver);
   	ob4.Search();
  
     Logo_page ob5=new Logo_page(driver);
	 ob5.Logo();

	 Screenshot_page ob6=new Screenshot_page(driver);
	  ob6.Screen();
	  
	  Addtocart ob7 = new Addtocart(driver); 
	 ob7.Addcart();  		
	      		
	}
	
}
	    
	    


	

	
			
