package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlbTraderSignUpPage {
    public GlbTraderSignUpPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@id='email']")
    public WebElement Email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signIn;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-warning btn-block']")
    public WebElement login;


}

