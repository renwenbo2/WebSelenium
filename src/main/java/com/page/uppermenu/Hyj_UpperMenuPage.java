package com.page.uppermenu;

import com.util.LogsInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hyj_UpperMenuPage extends LogsInit {

    /**
     * 上方导航菜单电商
     */
    public void  UpperOnlineRetailers(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"tab-0\"]")).click();
            Thread.sleep(3000);
            log.info("点击上方导航菜单电商成功");
        } catch (Exception e) {
            log.info("点击上方导航菜单电商执行失败"+e);
        }

    }

    /**
     *上方导航菜单教学管理
     */
    public void UpperTeaching(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"tab-1\"]")).click();
            Thread.sleep(3000);
            log.info("点击上方导航菜单教学管理执行成功");
        } catch (Exception e) {
            log.info("点击上方导航菜单教学管理执行失败"+e);
        }

    }

    /**
     *上方导航菜单通用管理
     */
    public void UpperCurrency(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"tab-2\"]")).click();
            Thread.sleep(3000);
            log.info("点击上方导航菜单通用管理执行成功");
        } catch (Exception e) {
            log.info("点击上方导航菜单通用管理执行失败"+e);
        }

    }
}
