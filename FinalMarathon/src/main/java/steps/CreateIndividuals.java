package steps;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import finalmarathonbasepack.FinalMarathonBaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIndividuals extends FinalMarathonBaseClass {
	public static String LastName="Manikandan";
 
	@Test
	public  void Create() throws InterruptedException  {		
	
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();

	WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
	driver.executeScript("arguments[0].scrollIntoView();", scroll);
	WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
    driver.executeScript("arguments[0].click();", individual);
    WebElement indi = driver.findElement(By.xpath("//a/span[text()='Individuals']"));
    driver.executeScript("arguments[0].click();", indi);
    Thread.sleep(4000);
    WebElement ClickNew = driver.findElement(By.xpath("//a/div[text()='New']"));
    driver.executeScript("arguments[0].click();", ClickNew);
    WebElement selTitle = driver.findElement(By.xpath("(//a[@class='select'])[1]"));
    driver.executeScript("arguments[0].click();", selTitle);
    WebElement MrTitle = driver.findElement(By.xpath("//a[@title='Dr.']"));
    driver.executeScript("arguments[0].click();", MrTitle);
	driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(LastName);
	driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	System.out.println(message);
	
}
}