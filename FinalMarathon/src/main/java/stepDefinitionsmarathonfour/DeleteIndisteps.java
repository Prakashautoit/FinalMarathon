package stepDefinitionsmarathonfour;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import finalmarathonbasepack.FinalMarathonBaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.CreateIndividuals;

public class DeleteIndisteps extends FinalMarathonBaseClass{

	@When("Click on Delete option")
	public DeleteIndisteps click_on_delete_option() throws InterruptedException {
		
		WebElement delete = driver.findElement(By.xpath("//a[@role='menuitem']/div[@title='Delete']"));
		driver.executeScript("arguments[0].click();", delete);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(2000);
		return this;
	}
	    
	

	@Then("Verify whether the Delete is successfull")
	public DeleteIndisteps verify_whether_the_delete_is_successfull() throws InterruptedException {
		String deletionmsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--small forceActionsText')]")).getText();
		Thread.sleep(2000);
		 System.out.println(deletionmsg);
		 return this;
	}

	@Then("Clear the searched input")
	public DeleteIndisteps clear_the_searched_input() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='slds-input']")).clear();
		Thread.sleep(4000);
		return this;
	}

	@Then("Verify whether the no records is dispalayed")
	public DeleteIndisteps verify_whether_the_no_records_is_dispalayed() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(LName,Keys.ENTER);
		Thread.sleep(3000);
		String verify = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
		System.out.println(verify);
		return this;
	
}
}