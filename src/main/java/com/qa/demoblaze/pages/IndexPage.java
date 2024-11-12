package com.qa.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.demoblaze.utilities.ElementUtil;


  

public class IndexPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By homeButton = By.xpath("//a[contains(text() , 'Home')] ");
	private By navBarButtons  = By.xpath("//div[@id = 'navbarExample']//ul//a");//*[@id="navbarExample"]/ul//a
	private By categoryListItemButtons = By.xpath("//div[@class = 'list-group']//a");
	private By itemTable =By.xpath("//*[@id= 'tbodyid']//a"); // By.xpath("//div[@class = 'col-lg-9']//a");
	private By playVideoButton = By.xpath("//div[@id = 'videoModal']//button//span[contains(text() , '×')]");//By.xpath("//*[@id='example-video']/button/span[1]");//By.xpath("//span[contains(text() , 'Play Video')]"); 
	private By aboutUs = By.xpath("//a[contains(text() , 'About us')]");
	private By contactUs = By.xpath("//a[text() = 'Contact']");
	private By contactEmailInputBox = By.id("recipient-email");
	private By contactNameInputBox = By.id("recipient-name");
	private By messageInputBox = By.id("message-text");
	private By sendMessageButton = By.xpath("//button[text() = 'Send message']");
	private By loginButton = By.id("login2");
	private By loginUserName = By.id("loginusername");
	private By loginPassword = By.id("loginpassword");
	private By loginOnClick = By.xpath("//button[@onclick = 'logIn()']");
	private By cartButton = By.id("cartur");
	private By placeOrderButton = By.xpath("//button[contains(text() , 'Place Order')]");
	private By placeOrderForm = By.xpath("//div[@id ='orderModal']//input");
	private By purchaseOrderOnClick = By.xpath("//button[@onclick  = 'purchaseOrder()']");
	private By purchaseConfirmationButton = By.xpath("//button[text() = 'OK']");
	private By purchaseItem = By.xpath("//a[text() = 'Nokia lumia 1520']");
	private By purchaseItem2 = By.xpath("//a[text() = 'Sony vaio i5']");
	private By addToCartButton = By.xpath("//a[text() = 'Add to cart']");
	private By signUpButton = By.xpath("//a[text() = 'Sign up']");
    private By signUpUserName = By.id("sign-username");
    private By signUpPassword = By.id("sign-password");
    private By userSignUpButton = By.xpath("//button[text() = 'Sign up']");
	
	 public IndexPage(WebDriver driver) {
		 this.driver=driver;
		 eleUtil = new ElementUtil(driver);
	 }
	 public void signUpButton() throws InterruptedException {
		 eleUtil.getElement(signUpButton).click();
		 Thread.sleep(5000);
		eleUtil.getElement(signUpUserName).sendKeys("BharathiViswanath");
		 Thread.sleep(5000);
		 eleUtil.getElement(signUpPassword).sendKeys("ABC");
		 Thread.sleep(5000);
		eleUtil.getElement(userSignUpButton).click();
	 }
	 public void loginButton() throws InterruptedException {
		 eleUtil.getElement(loginButton).click();
		 Thread.sleep(5000);
		 eleUtil.getElement(loginUserName).sendKeys("Suraksha Bharathi");
		 Thread.sleep(5000);

		 eleUtil.getElement(loginPassword).sendKeys("Viswanath");
		 Thread.sleep(5000);

		eleUtil.getElement(loginOnClick).click();
		 Thread.sleep(5000);

		 eleUtil.getElement(purchaseItem2).click();
		 Thread.sleep(5000);
		 
		 eleUtil.getElement(addToCartButton).click();
		 Thread.sleep(5000);
		 
		 driver.switchTo().alert().accept();
		 
		 
		 
		 eleUtil.getElement(cartButton).click();
		 Thread.sleep(5000);
		 
		 
		 eleUtil.getElement(placeOrderButton).click();
		 Thread.sleep(5000);

		 eleUtil.orderFormDetails(placeOrderForm,  "name","card", "RogerFederrer","swiss", "id");
		 
		 Thread.sleep(5000);
		 
		 eleUtil.getElement(purchaseOrderOnClick).click();
		 Thread.sleep(5000);
		 eleUtil.getElement(purchaseConfirmationButton).click();
		 
		 
	 }
	 public void isContactUsEnabled() throws InterruptedException {
		eleUtil.getElement(contactUs).click();
		 Thread.sleep(5000);
		 eleUtil.getElement(contactEmailInputBox).sendKeys("viswanathbuchi@gmail.com");
		 Thread.sleep(5000);
		 eleUtil.getElement(contactNameInputBox).sendKeys("viswanath");
		 Thread.sleep(5000);
		 eleUtil.getElement(messageInputBox).sendKeys("Automation Testing Selenium With Java");
		 Thread.sleep(5000);
		 eleUtil.getElement(sendMessageButton).click();
		 Thread.sleep(5000);
		 driver.switchTo().alert().accept();
		 
		 
	 }
	 
	 public  String  getCurrentPageUrl() {
		 String url = driver.getCurrentUrl();
		 return url;
	 }
	 public  String getCurrentPageTitle() {
		 String title = driver.getTitle();
		 return title;

	 }
	 public  void isAboutUsButtonEnabled() throws InterruptedException {
	     eleUtil.getElement(aboutUs).click();
	      Thread.sleep(10000);
		 eleUtil.getElement(playVideoButton).click();
//	      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	      wait.until(ExpectedConditions.elementToBeClickable(playVideoButton)).click();
	 }
	 
	 public  void isCategoryListButtonsFunctional() throws InterruptedException {
		eleUtil.getElement(homeButton).click();
		 Thread.sleep(5000);
	      eleUtil.eleFunctioningList(categoryListItemButtons);
	      
	 }
	 public void isItemListEnabled() throws InterruptedException {
		eleUtil.itemList(itemTable);
	 }
	 
	 
	 

}
