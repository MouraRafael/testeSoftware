package br.com.escola.view;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

class SeleniumTest {

	@Test
	
	void testfirefox() {
		//
		System.setProperty("webdriver.gecko.driver", "C:\\driversjava\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait espera = new WebDriverWait(driver,10);
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Senac rio" + Keys.ENTER);
		try {
			driver.wait(50);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
		driver.close();
		}
		
		
	}
	@Test


	void testChrome() {
		//
		System.setProperty("webdriver.chrome.driver", "C:\\driversjava\\chromedriver2.exe");
		try {
			WebDriver driver = new ChromeDriver();		
			WebDriverWait espera = new WebDriverWait(driver,10);
			
			
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("Senac rio" + Keys.ENTER);
			driver.close();
			}
			catch(Exception e) {e.printStackTrace();}
		
	}

}
