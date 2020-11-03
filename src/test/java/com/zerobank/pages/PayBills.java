package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBills extends BasePage{

    public PayBills() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText = "Pay Bills")
    public WebElement PayBills;
    @FindBy(linkText = "Add New Payee")
    public WebElement AddNewPayee;
    @FindBy (id="np_new_payee_name")
    public WebElement PayeName;
    @FindBy(id="np_new_payee_address")
    public WebElement PayeAddress;
    @FindBy(id="np_new_payee_account")
    public WebElement PayeAccount;
    @FindBy(id="np_new_payee_details")
    public WebElement PayeDetails;
    @FindBy(id="add_new_payee")
    public WebElement AddButton;
    @FindBy(id = "alert_content")
    public WebElement message;
}
