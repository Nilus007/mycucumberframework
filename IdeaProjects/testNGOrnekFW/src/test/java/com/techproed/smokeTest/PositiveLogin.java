package com.techproed.smokeTest;

import com.techproed.pages.CkHotelsHomePage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.annotations.Test;

public class PositiveLogin {
    // dogru kullanıcı adı ile ck adresine gidip login username ve ppasswordd ile giiş yapabillelim
    @Test
    public void positiveSmokeTest() {
        CkHotelsHomePage ckHotelHomePage = new CkHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        ckHotelHomePage.ilkLogIn.click();
        ckHotelHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("ck_hotels_user"));
        ckHotelHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("ck_hotel_password"));
        ckHotelHomePage.loginButonu.click();

        Driver.closeDriver();
    }
}
