package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Definition {
	WebDriver driver;
	@Given("If User is on login screen")
	public void if_user_is_on_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NandakumarN\\Desktop\\Drivers\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}


	@When("User enters name {string}")
	public void user_enters_name(String string) {
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	@When("User enters password {string}")
	public void user_enters_password(String string) {
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	@When("click on Submit")
	public void click_on_submit() {
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("I should see user name {string}")
	public void i_should_see_user_name(String LoginName) throws InterruptedException {
		String Actual=driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(LoginName, Actual);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(3000);
		System.out.println("Successfully Logged out");
		driver.close();
	
	}

	
}
