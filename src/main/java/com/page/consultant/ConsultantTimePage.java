package com.page.consultant;

import com.util.LogsInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConsultantTimePage extends LogsInit {

    /**
     * 新增咨询服务时间按钮
     *
     * @param driver
     */
    public void ConsultantAddTime(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/div[1]/div/button[1]")).click();
            Thread.sleep(3000);
            log.info("点击新增咨询时间成功");
        } catch (InterruptedException e) {
            log.info("点击新增咨询时间失败" + e);
        }

    }

    /**
     * 选择咨询服务时间框
     *
     * @param driver
     */
    public void ConsultantChooseTime(WebDriver driver) {
        try {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[5]/div/div[1]/div/div/div[4]/div/div[2]/div/div[2]/div/input[1]")).click();
            Thread.sleep(3000);
            log.info("点击选择咨询时间框成功");
        } catch (InterruptedException e) {
            log.info("点击选择咨询时间框失败" + e);
        }

    }

    /**
     * 选择开始日期及结束日期
     *
     * @param driver
     */
    public void ConsultantSelectDate(WebDriver driver) {
        try {
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/table/tbody/tr[3]/td[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/table/tbody/tr[4]/td[2]")).click();
            Thread.sleep(3000);
            log.info("点击选择咨询开始结束日期成功");
        } catch (InterruptedException e) {
            log.info("点击选择咨询开始结束日期失败" + e);
        }

    }

    /**
     * 选择开始结束时间
     *
     * @param driver
     */
    public void ConsultantClickTime(WebDriver driver) {
        try {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[5]/div/div[1]/div/div/div[4]/div/div[2]/div/div[4]/span/span/div")).click();
            Thread.sleep(3000);
            log.info("点击选择咨询开始结束日期成功");
        } catch (InterruptedException e) {
            log.info("点击选择咨询开始结束日期失败" + e);
        }

    }

    /**
     * 点击选择开始结束时间
     *
     * @param driver
     */
    public void ConsultantSelectTime(WebDriver driver) {
        try {
            driver.findElement(By.xpath("/html/body/div[4]/ul/li[12]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/ul/li[19]")).click();
            Thread.sleep(3000);
            log.info("点击选择咨询开始结束日期成功");
        } catch (InterruptedException e) {
            log.info("点击选择咨询开始结束日期失败" + e);
        }

    }

    /**
     * 点击保存按钮
     *
     * @param driver
     */
    public void ConsultantPreservation(WebDriver driver) {
        try {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[5]/div/div[1]/div/div/div[4]/div/div[2]/span/button")).click();
            Thread.sleep(3000);
            log.info("点击保存按钮成功");
        } catch (InterruptedException e) {
            log.info("点击保存按钮失败" + e);
        }

    }

    /**
     * 点击返回按钮
     *
     * @param driver
     */
    public void ConsultantReturn(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/div[3]/button")).click();
            Thread.sleep(3000);
            log.info("点击返回按钮成功");
        } catch (InterruptedException e) {
            log.info("点击返回按钮失败" + e);
        }

    }


}
