package week2.day02.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERail {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//launch the browser
			ChromeDriver driver = new ChromeDriver();
		//Load the url
			driver.get("http://erail.in/");
		//maimize the browser
			driver.manage().window().maximize();
			driver.findElement(By.id("txtStationFrom")).clear();
			driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.TAB);
			// clear allready text
			driver.findElement(By.id("txtStationTo")).clear();
		//enter the value SBC , keys.Tab	
			driver.findElement(By.id("txtStationTo")).sendKeys("SBC",Keys.TAB);
			driver.findElement(By.id("chkSelectDateOnly")).click();
			String trainno=driver.findElement(By .xpath("//a[contains(text(),'12007')]")).getText();
			System.out.println(trainno);
			
			String trainname=driver.findElement(By .xpath("//a[contains(text(),'12007')]/following::a[1]")).getText();
			System.out.println(trainname);
		// TODO Auto-generated method stub

	}

}
