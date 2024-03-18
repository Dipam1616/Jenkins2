package Basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtils.PropertyFileUtil;
import CommonUtils.WebDriverUtil;




public class OrganizationsTest {

	PropertyFileUtil putil = new PropertyFileUtil();
	WebDriverUtil wutil = new WebDriverUtil();
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void OrganizationTest() throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//To maximize the window
		wutil.maximize(driver);
		
		//To apply wait for findelement()
		wutil.implicitwait(driver);
		
		//To read data from the Property File
		String URL = putil.getDataFromPropertyFile("Url");
		String USERNAME = putil.getDataFromPropertyFile("Username");
		String PASSWORD = putil.getDataFromPropertyFile("Password");
		
		//To launch the application
		driver.get(URL);
		
		//Login to application
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		
 }
	
}
