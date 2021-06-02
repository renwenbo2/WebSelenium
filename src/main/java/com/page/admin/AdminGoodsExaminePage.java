package com.page.admin;

import com.config.GetTestProperties;
import com.util.LogsInit;
import org.apache.bcel.generic.DREM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.rmi.runtime.Log;

public class AdminGoodsExaminePage extends LogsInit {

    /**
     * 左侧菜单商品管理
     */
    public void CommodityManagement(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"public-main\"]/div[1]/div[1]/ul/li[2]/div")).click();//左侧菜单商品管理
            Thread.sleep(3000);
            log.info("运营端点击左侧菜单商品管理成功");
        } catch (Exception e) {
            log.info("运营端点击左侧菜单商品管理失败"+e);
        }

    }

    /**
     * 商品管理-商品审核
     */
    public void CommodityAudit(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"public-main\"]/div[1]/div[1]/ul/li[2]/ul/li[1]")).click();//左侧菜单商品管理-商品审核
            log.info("运营端点击左侧菜单商品管理-商品审核成功");
            Thread.sleep(3000);
        } catch (Exception e) {
            log.info("运营端点击左侧菜单商品管理-商品审核失败"+e);
        }

    }

    /*
     * 商品管理-商品审核-搜索框输入
     */
    public void SearchName(WebDriver driver,String inputname){
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/div[1]/form/div[1]/div/div/input")).sendKeys(inputname);
            Thread.sleep(3000);
            log.info("商品审核搜索输入框输入成功");
        } catch (Exception e) {
            log.info("商品审核搜索输入框输入失败"+e);
        }

    }
    /**
     * 商品管理-商品审核-查询
     */
    public void SearchButton(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/div[1]/form/div[4]/div/button[1]")).click();
            Thread.sleep(3000);
            log.info("商品审核点击查询成功");
        } catch (Exception e) {
            log.info("商品审核点击查询失败"+e);
        }

    }
    /**
     * 商品管理-商品审核-审核通过
     */
    public void Approved(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[11]/div/button[2]")).click();
            Thread.sleep(3000);
            log.info("商品审核点击审核通过成功");
        } catch (Exception e) {
            log.info("商品审核点击审核通过失败"+e);
        }
    }
    /**
     * 商品管理-商品审核-审核通过-确定
     */
    public void ApprovedDetermine(WebDriver driver) {

        try {
            driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[2]")).click();
            Thread.sleep(3000);
            log.info("商品审核审核通过点击弹窗商确定按钮成功");
        } catch (Exception e) {
            log.info("商品审核审核通过点击弹窗商确定按钮失败"+e);
        }

    }

}
