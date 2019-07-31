package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class LoginStepDefination {

	public static WebDriver driver;
	 
	@Given ("^User is already on Home page of The application$")
	public void  User_already_login() {
		String path=System.getProperty("user.dir")+"//driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path );

		driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
	}
	
//	@When("^User enter valid username and valid password$")
//	
//	public void user_valid_credential() {
//
//		driver.findElement(By.id("email")).sendKeys("admin");
//		driver.findElement(By.id("pass")).sendKeys("password");
//	}
//
//	@Then("^User click on login page button$")
//	
//	public void click_onlogin_button() {
//
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//
//	}
//
//	@And("^User is on homepage$")
//	
//	public void User_is_on_homepage() {
//             
//		String url=driver.getCurrentUrl();
//		
//		if(url.equals(""))
//		{
//			System.out.println("User is on Hompage");
//		}
//		else
//		{
//			System.out.println("user is not on homepage");
//		
//		}
//	}

}
