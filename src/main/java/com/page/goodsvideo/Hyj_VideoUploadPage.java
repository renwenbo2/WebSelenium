package com.page.goodsvideo;

import com.util.LogsInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hyj_VideoUploadPage extends LogsInit {
    /**
     * 新增单元
     */
    public void VideoNewunit(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-3\"]/div/div[1]/button")).click();
            Thread.sleep(3000);
            log.info("点击新增单元成功");
        } catch (Exception e) {
            log.info("点击新增单元失败"+e);
        }
    }

    /**
     * 新增课程
     */
    public void VideoNewcourses(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-3\"]/div/div[2]/div[1]/div/div[1]/div/span[2]/span[2]/span/i[1]")).click();
            Thread.sleep(3000);
            log.info("点击新增课程成功");
        } catch (Exception e) {
            log.info("点击新增课程失败"+e);
        }
    }

    /**
     * 发布
     */
    public void VideoReleaseButton(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-3\"]/div/div[3]/button[2]")).click();
            Thread.sleep(3000);
            log.info("点击发布商品成功");
        } catch (Exception e) {
            log.info("点击发布商品成功"+e);
        }
    }

}


