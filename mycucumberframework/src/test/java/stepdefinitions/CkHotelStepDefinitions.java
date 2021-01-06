package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CkHotelsLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class CkHotelStepDefinitions {
    CkHotelsLoginPage ckHotelsLoginPage = new CkHotelsLoginPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        ckHotelsLoginPage.loginButonu.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        ckHotelsLoginPage.userNameTextBox.sendKeys(ConfigReader.getProperty("Ck_valid_user"));
    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        ckHotelsLoginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("Ck_valid_password"));
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        ckHotelsLoginPage.loginButonu.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(ckHotelsLoginPage.adduserButonu.isEnabled());
    }


    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        ckHotelsLoginPage.userNameTextBox.sendKeys(ConfigReader.getProperty("Ck_invalid_user"));
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        ckHotelsLoginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("Ck_invalid_password"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {

        Assert.assertTrue(ckHotelsLoginPage.sifreYanlisYaziElementi.isDisplayed());
    }

    @Given("kullanici Ck Hotels ana sayfasina gider")
    public void kullanici_ck_hotels_ana_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
    }


    @Then("kulllanici sayfayi kapatir")
    public void kulllanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("log in yazisina tıklar")
    public void logInYazisinaTıklar() {
        ckHotelsLoginPage.loginButonu.click();
    }

    @And("username olarak {string} girer")
    public void usernameOlarakGirer(String arg0) {
        ckHotelsLoginPage.userNameTextBox.sendKeys(arg0);
    }

    @And("password olarak {string} girer")
    public void passwordOlarakGirer(String arg0) {
        ckHotelsLoginPage.passwordTextBox.sendKeys(arg0);
    }
}