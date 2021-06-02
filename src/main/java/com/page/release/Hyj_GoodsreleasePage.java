package com.page.release;

import com.util.LogsInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hyj_GoodsreleasePage extends LogsInit {
    /**
     *
     * 商品上架页面直播
     */
    public void Livebroadcast(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"chooseClass \"]/div[2]/div/div[1]")).click();
            Thread.sleep(3000);
            log.info("点击直播执行成功");
        } catch (Exception e) {
            log.info("点击直播执行失败"+e);
        }
    }
    /**
     *
     * 商品上架页面录播
     */
    public void Video(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"chooseClass \"]/div[2]/div/div[2]")).click();
            Thread.sleep(3000);
            log.info("点击录播执行成功");
        } catch (Exception e) {
            log.info("点击录播执行失败"+e);
        }
    }
    /**
     *
     * 商品上架页面线下
     */
    public void Offline(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"chooseClass \"]/div[2]/div/div[3]")).click();
            Thread.sleep(3000);
            log.info("点击线下执行成功");
        } catch (Exception e) {
            log.info("点击线下执行失败"+e);
        }
    }
    /**
     *
     * 商品上架页面咨询
     */
    public void Consulting(WebDriver driver)  {
        try {
            driver.findElement(By.xpath("//*[@id=\"chooseClass \"]/div[2]/div/div[4]")).click();
            Thread.sleep(3000);
            log.info("点击咨询执行成功");
        } catch (Exception e) {
            log.info("点击咨询执行失败"+e);
        }
    }
    /**
     * 点击下一步
     */
    public void  Nextstep(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"chooseClass \"]/div[3]/button")).click();
            Thread.sleep(3000);
            log.info("点击下一步执行成功");
        } catch (Exception e) {
            log.info("点击下一步执行失败"+e);

        }
    }



}
