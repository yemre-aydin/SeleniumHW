package com.testinium.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import com.testinium.methods.Methods;

public class HomePage {

    Methods methods;
    public HomePage(){
        methods=new Methods();
    }

    public void home(){
        methods.waitBySeconds(5);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon']")));

    }
}
