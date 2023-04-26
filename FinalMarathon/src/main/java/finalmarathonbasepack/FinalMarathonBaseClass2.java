package finalmarathonbasepack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class FinalMarathonBaseClass2 extends AbstractTestNGCucumberTests {
	
	public static ChromeDriver driver;
	public static String LName;
	@Parameters({"loginurl,UserName,Password"})
	@BeforeMethod		
	public void precondition(String url, String UName, String Pwd) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
	    driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(UName);
		driver.findElement(By.id("password")).sendKeys(Pwd);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		String HomePageTitle = driver.getTitle();
		System.out.println("Title is " + HomePageTitle);
		
	}
	
	@AfterMethod
public void postcondition() {
		
		driver.close();
		
	}

}
