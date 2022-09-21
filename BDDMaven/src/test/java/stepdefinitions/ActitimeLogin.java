package stepdefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.SeleniumUtility;

public class ActitimeLogin extends SeleniumUtility{

	WebDriver driver;
	@Given("^User is already in actitime login page$")
	public void user_is_already_in_actitime_login_page() {
	  driver=setUp("chrome", "https://demo.actitime.com/login.do");
	}

	@When("^user enters username$")
	public void user_enters_username() {
		driver.findElement(By.name("username")).sendKeys("admin");
	     
	}

	@When("^enter password$")
	public void enter_password() {
		 driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@When("^click on login button$")
	public void click_on_login_button() {
		 driver.findElement(By.id("loginButton")).click();
	}

	@Then("^verify actitime home page opened or not$")
	public void verify_actitime_home_page_opened_or_not() {
		setSleepTime(2000);
		 Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track", "Either login is not successful or page not loaded");
	}
	@And("^close the browser$")
	public void close_the_browser() {
		driver.close();
	}

	 @Given("User is already having valid url for actitime login page {string}")
	    public void user_is_already_having_valid_url_for_actitime_login_page(String url){
	    // Write code here that turns the phrase above into concrete actions
		driver=setUp("chrome", url);
	}

	@When("user enters username as {string}")
	public void user_enters_username_as_admin(String username) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(username);
	}

	@When("enter password as {string}")
	public void enter_password_as_manager(String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("pwd")).sendKeys(password);
	}

	@Then("verify that actitime page opened with title {string}")
	public void verify_that_actitime_page_opened_with_title_actiTIME_Enter_Time_Track(String title) {
	    // Write code here that turns the phrase above into concrete actions
		setSleepTime(2000);
		 Assert.assertEquals(driver.getTitle(), title, "Either login is not successful or page not loaded");
	}
	
	   @Given("^User is already having valid url for actitime login page (.+) for actitime application$")
	    public void user_is_already_having_valid_url_for_actitime_login_page_for_actitime_application(String url) {
		   driver=setUp("chrome", url);
	    }

	    @When("^user enters username as (.+) in actitime application$")
	    public void user_enters_username_as_in_actitime_application(String username) {
	    	driver.findElement(By.name("username")).sendKeys(username);
	    }

	    @Then("^verify that actitime page opened with title (.+) in actitime application$")
	    public void verify_that_actitime_page_opened_with_title_in_actitime_application(String pagetitle) {
	    	setSleepTime(2000);
			 Assert.assertEquals(driver.getTitle(), pagetitle, "Either login is not successful or page not loaded");
	    }

	    @And("^enter password as (.+) in actitime application$")
	    public void enter_password_as_in_actitime_application(String password) {
	    	driver.findElement(By.name("pwd")).sendKeys(password);
	    }
}
