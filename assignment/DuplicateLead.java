package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("XYZ@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		
		WebElement firstname=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		String oldname=firstname.getText();
		firstname.click();
		
		//System.out.println(oldname);
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.className("smallSubmit")).click();
		WebElement duplicateFirstName=driver.findElement(By.id("viewLead_firstName_sp"));
		String newname=duplicateFirstName.getText();
		//System.out.println(newname);
		if(oldname.equals(newname)) {
			System.out.println("the first name and duplicate name are same");
			driver.close();
		}else {
			System.out.println("the first name and duplicate name are not same");
		}
	}

}
