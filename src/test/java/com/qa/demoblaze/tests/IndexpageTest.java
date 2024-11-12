package com.qa.demoblaze.tests;

import org.testng.annotations.Test;

import com.qa.demoblaze.base.BaseTest;

public class IndexpageTest extends BaseTest {

	
	@Test(priority = 6)
	public void pageUrlTest() {
		System.out.println(indexPage.getCurrentPageUrl());
	}
	@Test(priority = 5)
	public void pageTitleTest() {
		System.out.println(indexPage.getCurrentPageTitle());
	}
	@Test(priority = 4)
	public void isAboutusButtonEnabledTest() throws InterruptedException {
		indexPage.isAboutUsButtonEnabled();
	}
	@Test(priority = 3)
	public void categoryListButtonsFunctioningTest() throws InterruptedException {
	      indexPage.isCategoryListButtonsFunctional();
	}
	@Test(priority = 2)
	public void isItemListEnabledTest() throws InterruptedException {
		indexPage.isItemListEnabled();
	}
	@Test(priority = 7)
	public void isContactUsEnabled() throws InterruptedException {
		indexPage.isContactUsEnabled();
	}
	@Test(priority = 1)
	public void placeAnOrderTest() throws InterruptedException {
		indexPage.loginButton();
	}
	@Test(priority = 8)
	public void signUpButtonTest() throws InterruptedException {
		indexPage.signUpButton();
	}
}
