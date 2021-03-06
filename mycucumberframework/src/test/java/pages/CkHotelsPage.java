package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class CkHotelsPage {
public CkHotelsPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}
    @FindBy(linkText = "Log in")
    public WebElement ilkLogin;

    @FindBy(id = "UserName")
    public WebElement userNameTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id="btnSubmit")
    public WebElement ikinciLoginButonu;


    @FindBy(className = "caption")
    public WebElement listOfUserText;

    @FindBy(xpath = "//span[text()='Add User ']")
    public WebElement adduserButonu;

    @FindBy(xpath = "//span[text()='Try again please']")
    public WebElement sifreYanlisYaziElementi;
}
