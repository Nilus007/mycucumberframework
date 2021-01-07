package com.techproed.tests;

import com.techproed.pages.CkHotelsHomePage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBaseRapor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D25_HtmlRapor extends TestBaseRapor {
    @Test
    public void positiveSmokeTest() {
        CkHotelsHomePage ckHotelHomePage = new CkHotelsHomePage();
extentTest=extentReports.createTest("ck hotel positive login ", "dogru kulanıcı adı ve şifresi girdiğimde sayfaya login olmalıyım");

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        extentTest.info("ck hotel ana sayfasina git");
        ckHotelHomePage.ilkLogIn.click();
        ckHotelHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("ck_hotels_user"));
        extentTest.info("dogru kullanici adi giriniz");

        ckHotelHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("ck_hotel_password"));
        ckHotelHomePage.loginButonu.click();

        Driver.closeDriver();
    }
}

