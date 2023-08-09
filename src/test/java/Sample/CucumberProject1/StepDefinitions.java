package Sample.CucumberProject1;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
	
	private WebDriver driver;
	
	@Before
	public void initializeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	
	@After
	public void closeDriver() {
		driver.quit();
	}

	@Given("User is in homepage")
	public void user_is_in_homepage() {
		driver.get("http://www.automationpractice.pl");
	    
	}

	@When("Clicks on signin button")
	public void clicks_on_signin_button() {
	    driver.findElement(By.className("login")).click();
	}

	@Then("User see the sing in page")
	public void user_see_the_sing_in_page() {
		String str = driver.findElement(By.className("page-heading")).getText();
		Assertions.assertEquals("AUTHENTICATION", str);

	}
	@Then("enter user name {string}")
	public void enter_user_name(String string) {
	    driver.findElement(By.id("email")).sendKeys(string);
	}

	@Then("enter password {string}")
	public void enter_password(String string) {
	   driver.findElement(By.id("passwd")).sendKeys("stirng");
	}

	@Then("click sign in button")
	public void click_sign_in_button() {
	   driver.findElement(By.id("SubmitLogin")).click();
	}



	@Then("user redirected to the My Account Page")
	public void user_redirected_to_the_my_account_page() {
		String str = driver.findElement(By.className("page-heading")).getText();
		Assertions.assertEquals("MY ACCOUNT", str);
	}
	
		@Then("user sees the error message")
		public void user_sees_the_error_message() {
		   String str = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
		   Assertions.assertEquals("Invalid email address", str);
	    
	}


}
