package br.com.escola.view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class IndexTest {

	@Test
	@Disabled
	void testfirefox() {
		//
		System.setProperty("webdriver.gecko.driver", "C:\\driversjava\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//WebDriverWait espera = new WebDriverWait(driver,10);
		
		
		driver.get("http://localhost:8080/webescola/");
		assertEquals("Página Inicial",driver.getTitle());
		driver.findElement(By.name("txtNomeBusca")).sendKeys("a");
		driver.findElement(By.id("btnOk")).click();
			
		driver.close();
		
		
		
	}
	@Test
	@Disabled
	void testChrome() {
		//
		System.setProperty("webdriver.chrome.driver", "C:\\driversjava\\chromedriver2.exe");
		
		
			WebDriver driver = new ChromeDriver();		
			//WebDriverWait espera = new WebDriverWait(driver,10);
			
			
			driver.get("http://localhost:8080/webescola/");
			assertEquals("Página Inicial",driver.getTitle());
			driver.findElement(By.name("txtNomeBusca")).sendKeys("a");
			driver.findElement(By.id("btnOk")).click();
			
			
			
			
			driver.close();
		
		
	}
	
	
	@Test
	@DisplayName("Teste de Cadastro de Aluno e Notas Chrome")
	void testIncluirNovoChrome() {
		//
		System.setProperty("webdriver.chrome.driver", "C:\\driversjava\\chromedriver2.exe");
		
		
		WebDriver driver = new ChromeDriver();		
					
		driver.get("http://localhost:8080/webescola/");
		
		driver.findElement(By.linkText("Cadastrar Novo")).click();
		driver.findElement(By.name("txtAlunoNome")).sendKeys("Alan Gomes");
		driver.findElement(By.id("nota1")).sendKeys("9,2");
		driver.findElement(By.id("nota2")).sendKeys("8,3");
		driver.findElement(By.id("nota3")).sendKeys("5");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.id("btnOk")).click();
		
			
		driver.close();
		
		
	}
	
	
	@Test
	@DisplayName("Teste de Cadastro de Aluno e Notas FireFox")
	void testIncluirNovoFireFox() {
		//
		System.setProperty("webdriver.gecko.driver", "C:\\driversjava\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();		
					
		driver.get("http://localhost:8080/webescola/");
		
		driver.findElement(By.linkText("Cadastrar Novo")).click();
		driver.findElement(By.name("txtAlunoNome")).sendKeys("Pedro Paulo");
		driver.findElement(By.id("nota1")).sendKeys("8,5");
		driver.findElement(By.id("nota2")).sendKeys("9,8");
		driver.findElement(By.id("nota3")).sendKeys("10");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.id("btnOk")).click();
		
			
		driver.close();
		
		
	}

}
