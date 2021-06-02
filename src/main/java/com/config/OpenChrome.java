package com.config;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 打开chrome及配置
 */
public class OpenChrome {
    public String getchromepre(WebDriver driver, String urlpt) {
           Logger log =  Logger.getLogger("openchrome");
        try {
            log.info("成功打开谷歌浏览器");
            // 设置超时时长
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // 打开浏览器后，操作的URI
            Thread.sleep(3000);
            if (urlpt.equals("shop")){
                driver.get(GetTestProperties.getTestshopUrl());
            }else if (urlpt.equals("admin")){
                driver.get(GetTestProperties.getTestadminUrl());
            }
            log.info("成功打开网址");
            // 屏幕最大化
            Thread.sleep(3000);
            driver.manage().window().maximize();
            Thread.sleep(3000);
            return "成功打开浏览器";

        } catch (Exception e) {
            // 抛异常，打开浏览器异常
            log.info("打开谷歌浏览器出现错误"+e);
            return "打开浏览器出现异常"+e;

        }

    }
}
