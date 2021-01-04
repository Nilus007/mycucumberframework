package com.techproed.tests;

import com.techproed.pages.GlbTraderSignUpPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.annotations.Test;

public class GlbTrader {
    /*
    GlbTrader sayfasına girin ve giriş yapın
    All Categories e gidin ve rastgele bir seçeneği seçin
    Seçmiş olduğunuz kategoride kaç tane ürün olduğunu listeleyin
    Bütün ürünleri yazıdırıp sıralayarak en düşük ve en yüksek ücretli olan ürünü bulun
    Ürünlere ait tüm bilgileri yazdırın
    İlk ürüne tıklayın
    Arttırma ve azatlma linklerinin aktif olup olmadığını kontrol edin
    Ürünü 1 artırın
    Sepete giderek ürünün görünüp görünmediğini assert edin
    Ürünün 1 arttırılıp arttırılmadığını assert edin.
    Remove buttonuna tıklayıp, ürünün seçimini kaldırın
    Allert i accept edin.
     */
    GlbTraderSignUpPage glbTraderSignUpPage = new GlbTraderSignUpPage();

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("glb_link"));
        glbTraderSignUpPage.signIn.click();
        glbTraderSignUpPage.Email.sendKeys(ConfigReader.getProperty("glb_email"));
        glbTraderSignUpPage.password.sendKeys(ConfigReader.getProperty("glb_pasword"));
        glbTraderSignUpPage.login.click();

    }
}
