package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications","start-maximized");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.tamilmatrimony.in/");
		//select the profile
		WebElement dropdown = driver.findElement(By.id("REGISTERED_BY"));
		Select sle= new Select(dropdown);
		sle.selectByValue("1");
		//enter the first name
		driver.findElement(By.id("NAME")).sendKeys("kirthivasen");
		//select the gender
		driver.findElement(By.xpath("//input[@class='hp-gender']")).click();
		//select the birth day
		driver.findElement(By.xpath("//select[@id='DOBDAY']")).click();
		driver.findElement(By.xpath("//option[@value='15']")).click();
		//select the birth month
		driver.findElement(By.xpath("//select[@id='DOBMONTH']")).click();
		driver.findElement(By.xpath("//option[text()='Sep']")).click();
		//select the birth year
		driver.findElement(By.xpath("//select[@id='DOBYEAR']")).click();
		driver.findElement(By.xpath("//option[text()='2002']")).click();
		//select the  religion
		driver.findElement(By.xpath("//select[@id='RELIGION']")).click();
		driver.findElement(By.xpath("//option[text()='Hindu']")).click();
		//select the mother tongue
		driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']")).click();
		driver.findElement(By.xpath("//option[@value='47']")).click();
		//select the country
		driver.findElement(By.xpath("//select[@id='COUNTRY']")).click();
		driver.findElement(By.xpath("//option[text()='India']")).click();
		//enter the mobile number
		driver.findElement(By.id("MOBILENO")).sendKeys("8838995224");
		//enter the email
		driver.findElement(By.id("EMAIL")).sendKeys("ssn1970@gmail.com");
		//close the browser
		driver.close();
		
		
	}

}
