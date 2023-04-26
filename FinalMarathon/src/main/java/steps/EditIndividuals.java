package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import finalmarathonbasepack.FinalMarathonBaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditIndividuals extends FinalMarathonBaseClass {

	@Test	
	public void Edit() throws InterruptedException {		
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
		WebElement clk = driver.findElement(By.xpath("//a[@title='Individuals']//span[1]"));
		driver.executeScript("arguments[0].click();", clk);
		WebElement name =driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		name.sendKeys(CreateIndividuals.LastName);
		name.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();", ele);
		Thread.sleep(3000);
		WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']/div"));
		driver.executeScript("arguments[0].click();", edit);
		driver.findElement(By.xpath("//a[@class='select']")).click();
		driver.findElement(By.xpath("//a[text()='Mr.']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys("Prakash");
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		Thread.sleep(2000);
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(msg);
	   
	}

}
