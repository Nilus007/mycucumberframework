package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationpracticePage {
    public AutomationpracticePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signIn;
    @FindBy(id = "email_create")
    public WebElement emailbox;
    @FindBy(id = "uniform-id_gender1")
    public WebElement radioButton;
    @FindBy(id = "customer_firstname")
    public WebElement firstnamebox;
    @FindBy(id = "customer_lastname")
    public WebElement lastnamebox;
    @FindBy(id = "passwd")
    public WebElement passwordnamebox;
    @FindBy(xpath = "//select[@id='days']")
    public WebElement birtdatebox1;
    @FindBy(id = "uniform-months")
    public WebElement birthdatebox2;
    @FindBy(id = "uniform-years")
    public WebElement birthdatebox3;

}
