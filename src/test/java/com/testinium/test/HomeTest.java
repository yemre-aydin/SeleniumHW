package com.testinium.test;

import org.junit.Test;
import com.testinium.driver.BaseTest;
import com.testinium.page.HomePage;

public class HomeTest extends BaseTest {

    @Test
    public void homeTest(){
        HomePage homePage=new HomePage();

        homePage.home();
        System.out.println("Anasayfa girişi Başarılı");
    }
}
