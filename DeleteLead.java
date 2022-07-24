package week2.day02.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	//open url
	driver.get("http://leaftaps.com/opentaps/control/login");
	//maximize the page
	driver.manage().window().maximize();
	driver.findElement(By .id("username")).sendKeys("demosalesmanager");
    driver.findElement(By .id("password")).sendKeys("crmsfa");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By .className("decorativeSubmit")).click();
    driver.findElement(By .linkText("CRM/SFA")).click();
    driver.findElement(By .linkText("Leads")).click();
    driver.findElement(By .linkText("Find Leads")).click();
    Thread.sleep(10);
    driver.findElement(By .id("ext-gen248")).sendKeys("Sridhar");
    Thread.sleep(40);
   
 
    driver.findElement(By .xpath("//button[text()='Find Leads']")).click();
Thread.sleep(100);
driver.findElement(By .linkText("13054")).click();
Thread.sleep(100);
String ViewLead=driver.getTitle();
System.out.println("ViewLead");
Thread.sleep(100);
driver.findElement(By.linkText("Delete")).click();
Thread.sleep(100);
driver.findElement(By.linkText("Find Leads")).click();
WebElement noRecord = driver.findElement(By.xpath("//div[text()='No records to display']"));

if(noRecord.isDisplayed())
	System.out.println("The first record is deleted and not found on search ");
else System.out.println("The first record not deleted and displayed on search");
		// TODO Auto-generated method stub*/

	}

}
