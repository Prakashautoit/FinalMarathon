package stepDefinitionsmarathonfour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import finalmarathonbasepack.FinalMarathonBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateIndisteps extends FinalMarathonBaseClass {
	
			
	@Given("Enter the username as {string}")
	public CreateIndisteps enter_the_username_as_hari_radhakrishnan_qeagle_com(String UName) {
		driver.findElement(By.id("username")).sendKeys(UName);
		return this;
	}

	@Given("Enter the password as {string}")
	public CreateIndisteps enter_the_password_as_leaf(String Pwd) throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys(Pwd);
		return this;
		
	}
	
	@When("Click LoginButton")
	public void click_login_button() throws InterruptedException {
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
	    
	}

	@Then("User should be taken to Home Page of Service Now Application.")
	public void user_should_be_taken_to_home_page_of_service_now_application() {
		String HomePageTitle = driver.getTitle();
		System.out.println("Title is " + HomePageTitle);
	    
	}

	@Given("Click on Toggle Menu on left hand corner")
	public CreateIndisteps click_on_toggle_menu_on_left_hand_corner() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
	}

	@Given("Click View All")
	public CreateIndisteps click_view_all() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return this;
	}

	@Given("Click on Individuals from App launcher")
	public CreateIndisteps click_on_individuals_from_app_launcher() {
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
	    driver.executeScript("arguments[0].click();", individual);
	    return this;
	}

	@Given("Click on Individuals from Dropdown")
	public CreateIndisteps click_on_individuals_from_dropdown() throws InterruptedException {
		WebElement indi = driver.findElement(By.xpath("//a/span[text()='Individuals']"));
	    driver.executeScript("arguments[0].click();", indi);
	    Thread.sleep(4000);
	    return this;
	}

	@Given("Click on New button to create an individual")
	public CreateIndisteps click_on_new_button_to_create_an_individual() {
	    WebElement ClickNew = driver.findElement(By.xpath("//a/div[text()='New']"));
	    driver.executeScript("arguments[0].click();", ClickNew);
	    return this;
	}

	@Given("Select the respective Title from dropdown")
	public CreateIndisteps select_the_respective_title_from_dropdown() {
	    WebElement selTitle = driver.findElement(By.xpath("(//a[@class='select'])[1]"));
	    driver.executeScript("arguments[0].click();", selTitle);
	    WebElement MrTitle = driver.findElement(By.xpath("//a[@title='Dr.']"));
	    driver.executeScript("arguments[0].click();", MrTitle);
	    return this;
	}

	@Given("Provide the lastname as (.*)$")
	public CreateIndisteps provide_the_lastname_as_balaraman(String LastName) {
		driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(LastName);
		LName=LastName;
		return this;
	}

	@When("User clicks on Save Button")
	public CreateIndisteps user_clicks_on_save_button() {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		return this;
		
	}

	@Then("Verify whether the Individual is created successfully")
	public Editindisteps verify_whether_the_individual_is_created_successfully() {
		String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(message);
		return new Editindisteps();
	}


	
}
