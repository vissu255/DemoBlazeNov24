package com.qa.demoblaze.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dry {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(5000);
		List<WebElement> eleList = driver.findElements(By.xpath("//nav//div[@id='navbarExample']//li//a"));
		Thread.sleep(5000);
		for (int i = 0; i <= 23; i++) {
			try {
				eleList.get(i).click();
				Thread.sleep(10000);

			} catch (StaleElementReferenceException e) {
				driver.navigate().refresh();
				Thread.sleep(10000);

				eleList = driver.findElements(By.xpath("//nav//div[@id='navbarExample']//li//a"));

				eleList.get(i).click();
				Thread.sleep(10000);

				driver.navigate().refresh();
				Thread.sleep(5000);

				eleList = driver.findElements(By.xpath("//nav//div[@id='navbarExample']//li//a"));
				String text = eleList.get(i).getText();
				System.out.println(text);
//				
//				
					if (text.equals("About us"));
					Thread.sleep(5000);
//
//					driver.findElement(By.xpath("//a[contains(text() , 'About us')]")).click();
//					Thread.sleep(5000);
//                        
//					{
						driver.navigate().refresh();
////						WebElement aboutUs = driver.findElement(By.xpath("(//span[contains(text() ,'×')])[4]"));
////						WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////						wait.until(ExpectedConditions.elementToBeClickable(aboutUs)).click();
//			
//					
//					}
//					
					if (text.equals("Log in"))
					{
						break;
					}
						;
//					Thread.sleep(5000);
////
//				{
//					
//					driver.findElement(By.xpath("//input[@id = 'loginusername']")).sendKeys("viswanath");
//					Thread.sleep(5000);
//
//					driver.findElement(By.xpath("//input[@id = 'loginpassword']")).sendKeys("08KT1a0255$");
//					Thread.sleep(5000);
//
//					driver.findElement(By.xpath("//button[contains(text() , 'Log in')]")).click();
////						driver.findElement(By.xpath("(//span[contains(text() , '×')])[3]")).click();
////						Thread.sleep(5000);
//					}
//				}

			}
		}
		driver.quit();
	}

}
