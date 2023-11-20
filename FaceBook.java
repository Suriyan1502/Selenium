package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//select the create new account button
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sriram");
		//enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		//enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8838995224");
		//enter the password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Vidhya08");
		//select the birth year
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		driver.findElement(By.xpath("//option[@value='15']")).click();
		//select the birth month
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		driver.findElement(By.xpath("//option[text()='Sep']")).click();
		//select the birth year
		driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
		driver.findElement(By.xpath("//option[@value='2002']")).click();
		//select the gender
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		//close the browser
		driver.close();
		
	}

}
