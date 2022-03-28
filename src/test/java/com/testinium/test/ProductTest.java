package com.testinium.test;

import org.junit.Test;
import com.testinium.driver.BaseTest;
import com.testinium.page.HomePage;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        ProductPage productPage=new ProductPage();
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        productPage.selectProduct();
    }

    @Test
    public void getAttributeTest(){
        ProductPage productPage=new ProductPage();
        productPage.attributeTest();
    }

    @Test
    public  void getTextTest(){

        LoginPage loginPage=new LoginPage();
        ProductPage productPage=new ProductPage();


        loginPage.login();

        productPage.textControl();
    }
    @Test
    public void valueTest(){
        ProductPage productPage=new ProductPage();

        productPage.valueControlTest();
    }
    @Test
    public  void searchTextTest(){

        LoginPage loginPage=new LoginPage();
        ProductPage productPage=new ProductPage();


        loginPage.login();

        productPage.selectProduct();
    }

}
