package assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class UiBank {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications","start-maximized");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//load the url
		driver.get("https://uibank.uipath.com/register-account");
		//enter the name
		driver.findElement(By.id("firstName")).sendKeys("Suriyan");
		//select the title
		WebElement findElement = driver.findElement(By.id("title"));
		Select drop=new Select(findElement);
		drop.selectByValue("mr");
		//enter the initial
		driver.findElement(By.id("middleName")).sendKeys("Saravanan");
		//enter the last name
		driver.findElement(By.id("lastName")).sendKeys("S");
		//select the gender
		WebElement element = driver.findElement(By.id("sex"));
		Select drop1= new Select(element);
		drop1.selectByValue("male");
		//select the employment status
		WebElement dropdown = driver.findElement(By.id("employmentStatus"));
		Select sle=new Select(dropdown);
		sle.selectByVisibleText(" Unemployed");
		//enter the user name
		driver.findElement(By.id("username")).sendKeys("Suriyan");
		//enter the email
		driver.findElement(By.id("email")).sendKeys("ssn1970@gmail.com");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("Vidhya@08");
		//close the browser
		driver.close();
		
	}

}
