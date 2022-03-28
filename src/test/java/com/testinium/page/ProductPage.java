package com.testinium.page;

import com.testinium.test.ProductTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import com.testinium.methods.Methods;

public class ProductPage {

    Methods methods;
    Logger logger= LogManager.getLogger(ProductPage.class);

    public ProductPage(){
        methods=new Methods();
    }

    public void selectProduct(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.click(By.cssSelector(".pr-img-link"));
        methods.scrollWithAction(By.id(".product-565088"));
        methods.waitBySeconds(1);
        methods.selectByText(By.xpath("//*[@id=\"product-565088\"]/div[1]/div[2]/a/span"),"Oylama (Düşük > Yüksek");
        methods.waitBySeconds(1);
    }

    public void attributeTest(){
        String attribute=methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("Alınan text: "+attribute);
        logger.info("Alınan text: "+attribute);
        methods.waitBySeconds(1);
    }
    public void textControl(){
        String text=methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text: "+text);
        logger.info("Alınan text: "+text);
        methods.waitBySeconds(1);
    }
    public void valueControlTest(){
        methods.sendKeys(By.id("search-input"),"testinium");
        String value=methods.getValue(By.id("search-input"));
        System.out.println("Alınan text: "+value);
        logger.info("Alınan text: "+value);
        Assert.assertEquals("testinium",value);
        methods.waitBySeconds(1);
    }




}
