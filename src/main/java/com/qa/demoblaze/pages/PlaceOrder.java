package com.qa.demoblaze.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceOrder {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("cartur")).click();
		driver.findElement(By.xpath("//button[contains(text() , 'Place Order')]")).click();
		Thread.sleep(5000);
		List<WebElement> eleList = driver.findElements(By.xpath("//div[@id ='orderModal']//input"));
		for(WebElement e: eleList) {
			String text = e.getAttribute("id");
			Thread.sleep(2000);
			if(text.equals("name")) {
				e.sendKeys("abc");
				
			}
			if(text.equals("card")) {
				e.sendKeys("123");
			}
			System.out.println(text);
		}
		
		driver.findElement(By.xpath("//button[@onclick  = 'purchaseOrder()']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text() = 'OK']")).click();
		driver.quit();
	}

}
