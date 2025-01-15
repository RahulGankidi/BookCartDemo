package com.book.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class RegisterPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest test;
	
	public RegisterPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.test = test;
	}
	By ClickonLoginLink = By.xpath("(//*[@class=\"mdc-button__label\"])[2]");
	By ClickonRegister = By.xpath("/html/body/app-root/div/app-login/div/mat-card/mat-card-header/div[2]/button/span[2]");
	By EnterFirstName = By.xpath("//*[@id=\"mat-input-2\"]");
	By EnterLastName = By.xpath("//*[@id=\"mat-input-3\"]");
	By EnterUserName = By.xpath("//*[@id=\"mat-input-4\"]");
	By EnterPassword = By.xpath("//*[@id=\"mat-input-5\"]");
	By EnterConfirmPassword = By.xpath("//*[@id=\"mat-input-6\"]");
	By SelectGender = By.xpath("//*[@id=\"mat-radio-2\"]/div/label");
	By ClickonRegisterButton = By.xpath("(//*[@class=\"mdc-button__label\"])[6]");
	
	public void clickonloginLink() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement loginlinkElement = wait.until(ExpectedConditions.elementToBeClickable(ClickonLoginLink));
		loginlinkElement.click();
		test.pass("Clicked on Login Link");
	}
	public void clickonRegister() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement registerElement = wait.until(ExpectedConditions.elementToBeClickable(ClickonRegister));
		registerElement.click();
		test.pass("Clicked on Register");
	}
	public void enterfirstName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement firstnameElement = wait.until(ExpectedConditions.elementToBeClickable(EnterFirstName));
		firstnameElement.click();
		firstnameElement.sendKeys("Ravi");
		test.pass("Entered FirstName");
	}
	public void enterlastName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement lastnameElement = wait.until(ExpectedConditions.elementToBeClickable(EnterLastName));
		lastnameElement.click();
		lastnameElement.sendKeys("Rao");
		test.pass("Entered LastName");
	}
	public void enteruserName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement usernameElement = wait.until(ExpectedConditions.elementToBeClickable(EnterUserName));
		usernameElement.click();
		usernameElement.sendKeys("RAVIRAO");
		test.pass("Entered UserName");
	}
	public void enterPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(EnterPassword));
		passwordElement.click();
		passwordElement.sendKeys("Ravi@123");
		test.pass("Entered Password");
	}
	public void enterconfirmPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement confirmpasswordElement = wait.until(ExpectedConditions.elementToBeClickable(EnterConfirmPassword));
		confirmpasswordElement.click();
		confirmpasswordElement.sendKeys("Ravi@123");
		test.pass("Entered Confirm Password");
	}
	public void selectGender() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement genderElement = wait.until(ExpectedConditions.elementToBeClickable(SelectGender));
		genderElement.click();
		test.pass("Selected Gender");
	}
	public void clickonregisterButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement regbuttonElement = wait.until(ExpectedConditions.elementToBeClickable(ClickonRegisterButton));
		regbuttonElement.click();
		test.pass("Clicked on Register Button");
	}
}


