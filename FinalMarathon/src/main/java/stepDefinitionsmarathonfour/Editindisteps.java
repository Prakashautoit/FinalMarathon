package stepDefinitionsmarathonfour;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import finalmarathonbasepack.FinalMarathonBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.CreateIndividuals;

public class Editindisteps extends FinalMarathonBaseClass {
	
	@Given("Search for existing individuals")
	public Editindisteps search_for_existing_individuals() throws InterruptedException {
		WebElement name =driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		name.sendKeys(LName);
		name.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		return this;
		
	}

	@Given("Click on the retrieved result")
	public Editindisteps click_on_the_retrieved_result() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();", ele);
		Thread.sleep(3000);
		return this;
	}

	@Given("Click on Edit option")
	public Editindisteps click_on_edit_option() {
		WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']/div"));
		driver.executeScript("arguments[0].click();", edit);
		return this;
	}

	@Given("Edit the title to Mr")
	public Editindisteps edit_the_title_to_mr() {
		driver.findElement(By.xpath("//a[@class='select']")).click();
		driver.findElement(By.xpath("//a[text()='Mr.']")).click(); 
		return this;
	}

		
	@Given("Provide the First Name as (.*)$")
	public Editindisteps provide_the_first_name_as_prabhu(String FirstName) {
		driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys(FirstName);
		return this;
	}

	@When("User clicks on Save option")
	public Editindisteps user_clicks_on_save_option() throws InterruptedException {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		Thread.sleep(2000); 
		return this;
	}

	@Then("Verify whether the Edit is successfull")
	public DeleteIndisteps verify_whether_the_edit_is_successfull() {
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(msg);
		return new DeleteIndisteps();
	}



}
