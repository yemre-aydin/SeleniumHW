package com.testinium.test;

import com.testinium.page.LoginPage;
import org.junit.Test;
import com.testinium.driver.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage=new LoginPage();

        loginPage.login();

        System.out.println("Login işlemi Başarılı");
    }
    @Test
    public void searchTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        System.out.println("aramaya başla");
        loginPage.search();
        System.out.println("arama başarılı");
    }
}
