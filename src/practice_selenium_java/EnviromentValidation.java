package practice_selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.edge.EdgeDriver;

public class EnviromentValidation {
	public static void main(String[] args) {
		
		//firefox variable
		System.setProperty("webdriver.gecko.driver", "D:\\Projects\\Java\\Testing_Java\\bin\\selenium_driver\\geckodriver.exe");
		WebDriver driveFirefox = new FirefoxDriver();
		driveFirefox.get("https://www.google.com.ar/");
		driveFirefox.quit();
		
		//chrome variable
		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Java\\Testing_Java\\bin\\selenium_driver\\chromedriver.exe");
	
		WebDriver driver_chrome = new ChromeDriver();
		driver_chrome.get("http://localhost:4200/");
		//driver_chrome.quit();
		
		
		//edge variable
		System.setProperty("webdriver.edge.driver", "D:\\Projects\\Java\\Testing_Java\\bin\\selenium_driver\\msedgedriver.exe");
		WebDriver driverEdge = new EdgeDriver();
		driverEdge.get("https://www.google.com.ar/");
		driverEdge.quit();
		
	
	}
	
}