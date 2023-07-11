package org.daterangepicker;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.it.Date;


public class DateRangepicker {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://demo.seleniumeasy.com/jquery-date-picker-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]")).click();
		WebElement From=driver.findElement(By.id("from"));
		From.click();
		WebElement dropdown=driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]"));
		Select dd=new Select(dropdown);
		dd.selectByVisibleText("Jun");
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2023')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(1000);
		WebElement to=driver.findElement(By.id("to"));
		to.click();
		WebElement month=driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]"));
		Select m=new Select(month);
		m.selectByValue("6");
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'2023')]")).click();
		TakesScreenshot srcshot=(TakesScreenshot)driver;
		File src=srcshot.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\BALAJI S\\Desktop");
        driver.quit();
        
        
		
		
		 
		
		
		
		
		
		
		

	}

}
