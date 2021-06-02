package com.page.goodspublic;

import com.util.LogsInit;
import com.util.Selenium2Proxy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hyj_UploadPicturesPage extends LogsInit {

    /**
     * 选择系统图片
     */
    public void SystemPicture(Integer pathcode)  {
        try {
            Selenium2Proxy selenium2Proxy =new Selenium2Proxy();
            selenium2Proxy.getSystempop(pathcode);
            log.info("选择系统图片成功");
        } catch (Exception e) {
            log.info("选择系统图片成功"+e);
        }
    }
    /**
     * 点击剪裁窗上的确定按钮
     */
    public void Tailoring(WebDriver driver){
        try {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[5]/div/div[1]/div/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div[2]/div/div[2]/div[2]/button[2]")).click();
            Thread.sleep(3000);
            log.info("点击剪裁弹窗上的确定按钮成功");
        } catch (Exception e) {
            log.info("点击剪裁弹窗上的确定按钮失败"+e);
        }
    }


}


