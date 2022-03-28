package com.testinium.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import com.testinium.methods.Methods;

public class LoginPage {

    Methods methods;

    public LoginPage() {
        methods = new Methods();
    }

    public void login() {
        methods.click(By.cssSelector(".menu-top-button login>a"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-email"), "nese.aydin@testinium.com");
        methods.sendKeys(By.id("login-password"), "1q2w3e4r5t");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".attention")));
    }
    public void search(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.click(By.cssSelector(".pr-img-link"));
        methods.scrollWithAction(By.id(".product-565088"));
        methods.waitBySeconds(1);

    }
}
