package com.techproed.tests;

import com.techproed.pages.AmazonPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazonTest {
    @Test
    public void Test01(){
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
    }
    /*
amazon' a gidelim
Linki Config Reader dan alalım
Başlığın Elektronik içerip içermediğini kontrol edelim
All Categories ' e gidelim
"Toys & Games" ı seçelim
Arama kelimesini config reader dan alalım
Arama kutusuna toy story yazdıralım-- Config reader dan alalım
İlk sayfadaki bütün fiyatları listeleyip yazdıralım en düşük ve en yüksek fiyatı bulalım
Herhangi bir  ürünü önce tıklayıp sonra sepete ekleyelim.
Sepete gidip seçimi yapıp yapamadığımızı assert edelim.
Çıkan tüm sonuçları yazdıralım

 */
    AmazonPage amazon = new AmazonPage();
    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Electronics"));
        Select select = new Select(amazon.allCategories);
        select.selectByVisibleText(ConfigReader.getProperty("arama_secenegi"));
        amazon.searchBox.sendKeys(ConfigReader.getProperty("arama_kelimesi")+ Keys.ENTER);

        int urunSayisi = amazon.tamKisimlarList.size();
        System.out.println(urunSayisi);
        for (WebElement w:amazon.tamKisimlarList) {
            System.out.print(w.getText()+" ");
        }
        System.out.println();
        for (WebElement w:amazon.ondalikliKisimlar) {
            System.out.print(w.getText()+" ");
        }

        List<Double> fiyatListesi = new ArrayList<>();
        for (int i=0;i<urunSayisi;i++){
            if(!amazon.tamKisimlarList.get(i).getText().isEmpty()){
                fiyatListesi.add(Double.valueOf(amazon.tamKisimlarList.get(i).getText()+"."+amazon.ondalikliKisimlar.get(i).getText()));
            }
        }
        System.out.println();
        System.out.println("Sıralanmamış liste "+fiyatListesi);
        Collections.sort(fiyatListesi);
        System.out.println("En düşük fiyat "+ fiyatListesi.get(0)+" $");
        System.out.println("En yüksek fiyat "+ fiyatListesi.get(fiyatListesi.size()-1)+" $");

        amazon.tamKisimlarList.get(5).click();
        Thread.sleep(3000);

       // ReusableMethods.waitAndClick(amazon.sepeteEkle,3);
       // ReusableMethods.waitAndClick(amazon.sepet,3);

        Assert.assertTrue(amazon.seciliUrun.isDisplayed());

        Driver.closeDriver();

    }

}


