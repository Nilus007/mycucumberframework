package com.techproed.tests;

import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.annotations.Test;

public class D32_DataProviderTest {
    @Test
    public void amazonarama(){
        Driver.getDriver().get(ConfigReader.getProperty(""));



    }
}
