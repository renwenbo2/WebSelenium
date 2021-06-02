package com.page.goodsvideo;

import com.config.GetTestProperties;
import com.page.goodspublic.Hyj_GoodsPublicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hyj_VideoOnePage {
    Hyj_GoodsPublicPage hyj_goodsPublicPage=new Hyj_GoodsPublicPage();

    /**
     * 录播商品名称
     * @param driver
     *
    By.xpath("//*[@id=\"pane-0\"]/div/div[1]/form/div[2]/div/div/div[1]/input"),
    By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/ul/li[1]/span/span"),
    By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/ul/li[2]/span/span"),
    By.xpath("/html/body/div[3]/div[1]/div[3]/div[1]/ul/li[2]/span/span"));
    }
     */
    public void Video_Name(WebDriver driver){
       hyj_goodsPublicPage.GoodsName(driver,GetTestProperties.getVideoGoodsname());
    }
    public void Video_Type(WebDriver driver) {
        hyj_goodsPublicPage.GoodsType(driver);
    }
    public void Video_Stock(WebDriver driver){

    }
}
