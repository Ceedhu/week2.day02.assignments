package week2.day02.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		//Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//locate Create New Account button
		driver.findElement(By .xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//locate firstname, lastname,mobile/email, password textboxes
		driver.findElement(By .name("firstname")).sendKeys("Sridhar");
		driver.findElement(By .name("lastname")).sendKeys("TK");
		driver.findElement(By .name("reg_email__")).sendKeys("7804343250");
		driver.findElement(By .name("reg_passwd__")).sendKeys("08bec77@3K");
		// select date of birth in dropdown boxes.
		Select drpday=new Select(driver.findElement(By .name("birthday_day")));
		drpday.selectByVisibleText("23");
		Select drpmonth=new Select(driver.findElement(By .name("birthday_month")));
		drpmonth.selectByVisibleText("Mar");
		Select drpyear=new Select(driver.findElement(By .name("birthday_year")));
		drpyear.selectByVisibleText("1993");
		Thread.sleep(10);
		//select gender in radio button
		WebElement radio2=driver.findElement(By .xpath("(//input[@type='radio'])[2]"));
		radio2.click();
		
		
		
		
		System.out.println("Radio Button Option 2 Selected");	
		
		
		
		
		// TODO Auto-generated method stub

	}

}
