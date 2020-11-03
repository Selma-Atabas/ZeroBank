package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(id = "signin_button")
    public WebElement signinbutton;

    @FindBy(id = "user_login")
    public WebElement usernameInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(css=".alert.alert-error")
    public WebElement errormessage;

    public void login(String username,String password){

        signinbutton.click();

         usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);

        if(username.equalsIgnoreCase("username")&&password.equalsIgnoreCase("password")){
            loginButton.click();
        }
     else if(!(username.equalsIgnoreCase("username"))||(!password.equalsIgnoreCase("password"))||(!username.isEmpty())||(!password.isEmpty())) {
            loginButton.click();
       Assert.assertTrue(errormessage.isDisplayed());
   }


    }
}
