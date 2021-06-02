package com.business;

import com.page.release.Hyj_GoodsreleasePage;
import com.util.LogsInit;
import org.openqa.selenium.WebDriver;

public class Hyj_GoodsreleaseBusiness extends LogsInit {
    Hyj_GoodsreleasePage hyj_goodsreleasePage=new Hyj_GoodsreleasePage();

    /**
     * 直播
     */
    public void Clicklive(WebDriver driver)  {
        hyj_goodsreleasePage.Livebroadcast(driver);
    }
    /**
     * 录播
     */
    public void ClickVideo(WebDriver driver)  {
        hyj_goodsreleasePage.Video(driver);
    }
    /**
     * 线下
     */
    public void Clickoffline(WebDriver driver)  {
        hyj_goodsreleasePage.Offline(driver);
    }
    /**
     * 咨询
     */
    public void Clickconsulting(WebDriver driver) {
        hyj_goodsreleasePage.Consulting(driver);
    }
    /**
     * 下一步
     */
    public void Clicknextstep(WebDriver driver){
        hyj_goodsreleasePage.Nextstep(driver);
    }



}
