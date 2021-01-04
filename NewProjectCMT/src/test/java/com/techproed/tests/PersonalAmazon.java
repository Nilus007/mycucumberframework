package com.techproed.tests;

import com.github.javafaker.Faker;
import com.techproed.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonalAmazon {
    @Test
    public void test1() {
         /*
         Amazon.com a gidelim
        // 1. Adım : Mouse'u moveToElement methodunu kullanarak,
         Account & Lists webelementinin üzerine götürün.
        // 2. Adım : Start here. linkine tıklayın.
        3. Adım  Başlığın Amazon Registration a eşit olup olmadığını kontrol edin
        4. adım yeni bir method oluşturarak kayıt olun

        // name id =ap_customer_name
        email id =ap_email
        password = ap_password
        repassword = ap_password_check
        submit = id=continue
         */
        Driver.getDriver().get("https://www.amazon.com");
        Actions actions = new Actions(Driver.getDriver());
        WebElement accountList = Driver.getDriver().findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']"));
        actions.moveToElement(accountList).perform();
        WebElement startheretext=Driver.getDriver().findElement(By.xpath("//*[text()='Start here.']"));
        startheretext.click();
        String title= Driver.getDriver().getTitle();
        Assert.assertEquals(title, "Amazon Registration");
    }
    @Test(dependsOnMethods = "test1")
    public void test2(){
        WebElement name=Driver.getDriver().findElement(By.id("ap_customer_name"));
        Faker faker=new Faker();
        name.sendKeys(faker.name().name());
        WebElement email=Driver.getDriver().findElement(By.id("ap_email"));
        email.sendKeys(faker.internet().emailAddress());
        WebElement password=Driver.getDriver().findElement(By.id("ap_password"));
        Faker faker1=new Faker();
        String fake=faker1.internet().password();
        password.sendKeys(fake);
        WebElement password1=Driver.getDriver().findElement(By.id("ap_password_check"));
        password1.sendKeys(fake);
        Driver.getDriver().findElement(By.id("a-autoid-0")).click();

    }
}
