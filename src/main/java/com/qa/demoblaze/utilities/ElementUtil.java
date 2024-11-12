package com.qa.demoblaze.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	 public  WebElement getElement(By locator) {
		 return driver.findElement(locator);
	 }
	 public List<WebElement> getElements(By locator) {
		 return driver.findElements(locator);
	 }
	 
	 public  List<String> eleFunctioningList(By locator) throws InterruptedException {
		 Thread.sleep(5000);
		 List<String> eleList = new ArrayList<String>();
		 Thread.sleep(10000);
		 List<WebElement> list = getElements(locator);
		 Thread.sleep(10000);
		 
		 for(int i=0; i<list.size();i++) {
//			 String text = list.get(i).getText();
//              System.out.println(text);			 
			 Thread.sleep(5000);
			 try {
			 list.get(i).click();
			 Thread.sleep(5000);
			 }catch (StaleElementReferenceException e) {
				 driver.navigate().refresh();
				 Thread.sleep(5000);
				 list = driver.findElements(locator);
				 list.get(i).click();

			}
			 
		 }return eleList;
	 }
	 public List<WebElement> itemList(By locator) throws InterruptedException {
		 List<WebElement> itemList = getElements(locator);
		 for(WebElement e : itemList) {
			 e.click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(5000);
		 }return itemList;
	 }
	 public void orderFormDetails(By locator , String textValue, String textValue2, String inputValue,String inputValue2, String attribute) throws InterruptedException {
		 List<WebElement> formList = getElements(locator);
		 for(int i=0; i<formList.size();i++) {
			 String text = formList.get(i).getAttribute(attribute);
			 if(text.equals(textValue)) {
				   formList.get(i).sendKeys(inputValue);
			 }
			 Thread.sleep(5000);
			 if(text.equals(textValue2)) {
				   formList.get(i).sendKeys(inputValue2);
			 }
		 }
	 }

}
