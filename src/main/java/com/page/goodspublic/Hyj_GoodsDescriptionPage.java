package com.page.goodspublic;

import com.util.LogsInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hyj_GoodsDescriptionPage extends LogsInit {
    Hyj_UploadPicturesPage hyj_uploadPicturesPage=new Hyj_UploadPicturesPage();
    /**
     *点击上传图片框
     */
    public void ClickPhoto(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-2\"]/div/form/div[1]/div/div/div[1]/div")).click();
            Thread.sleep(3000);
            hyj_uploadPicturesPage.SystemPicture(1);
            hyj_uploadPicturesPage.Tailoring(driver);
            log.info("点击上传图片框成功");
        } catch (Exception e) {
            log.info("点击上传图片框失败"+e);
        }

    }
    /**
     *输入商品描述
     */
    public void Goodsdescribe(WebDriver driver,String describe){
        try {
            driver.findElement(By.xpath("//*[@id=\"myEditor\"]")).sendKeys(describe);
            Thread.sleep(3000);
            log.info("输入商品描述成功");
        } catch (Exception e) {
            log.info("输入商品描述失败"+e);
        }
    }

    /**
     * 第二页下一步
     */
    public void TwoNext(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-2\"]/div/div[5]/div/button[2]")).click();
            Thread.sleep(3000);
            log.info("点击第二页的下一步成功");
        } catch (Exception e) {
            log.info("点击第二页的下一步失败"+e);
        }
    }



}
