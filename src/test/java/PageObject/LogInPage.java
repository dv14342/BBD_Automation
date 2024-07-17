package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	WebDriver  ldriver;

	public LogInPage (WebDriver rDriver)

	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver,this );

	}

	@FindBy(id ="Email")

	WebElement email;

	@FindBy(id ="Password")

	WebElement password;

//	@FindBy(xpath  = "//button[@class='button-1 login-button']")
//
//	WebElement LogInBtn;
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement LogInBtn;
	
	@FindBy(linkText="Logout")
	WebElement logout;

	public void enterEmail(String emailAdd)
	
	{
		email.clear();
		email.sendKeys(emailAdd);
	}


	public void enterPassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}


	public void clickOnLogInButton()
	{
		LogInBtn.click();
	}
	
	public void clickOnlogout()
	{
		logout.click();
	}





}
