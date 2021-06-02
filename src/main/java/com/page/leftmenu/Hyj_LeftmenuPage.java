package com.page.leftmenu;

import com.util.LogsInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.nio.file.Watchable;

public class Hyj_LeftmenuPage extends LogsInit {

    /**
     * 左侧菜单商品管理
     */
    public void  LeftGoodsadmin(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"public-main\"]/div[3]/div[1]/ul/li[1]/div")).click();
            Thread.sleep(3000);
            log.info("点击左侧商品管理执行成功");
        } catch (Exception e) {
            log.info("点击左侧商品管理执行失败"+e);
        }

    }

    /**
     *商品列表
     */
    public void LeftGoodsList(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"public-main\"]/div[3]/div[1]/ul/li[1]/ul/li[1]")).click();
            Thread.sleep(3000);
            log.info("点击左侧商品列表执行成功");
        } catch (Exception e) {
            log.info("点击左侧商品列表执行失败"+e);
        }

    }

    /**
     *商品上架
     */
    public void LeftGoodsrelease(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"public-main\"]/div[3]/div[1]/ul/li[1]/ul/li[2]")).click();
            Thread.sleep(3000);
            log.info("点击左侧商品上架执行成功");
        } catch (Exception e) {
            log.info("点击左侧商品上架执行失败"+e);
        }

    }
    /**
     *通用管理-店铺管理
     */
    public void shopMenu(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"public-main\"]/div[3]/div[1]/ul/li[2]/div")).click();
            Thread.sleep(3000);
            log.info("点击通用管理-店铺管理执行成功");
        } catch (Exception e) {
            log.info("点击通用管理-店铺管理执行失败"+e);
        }

    }
    /**
     *通用管理-店铺管理-咨询师信息
     */
    public void shopConsultantMenu(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"public-main\"]/div[3]/div[1]/ul/li[2]/ul/li[1]")).click();
            Thread.sleep(3000);
            log.info("点击通用管理-店铺管理-咨询师信息执行成功");
        } catch (Exception e) {
            log.info("点击通用管理-店铺管理-咨询师信息执行失败"+e);
        }

    }

}
