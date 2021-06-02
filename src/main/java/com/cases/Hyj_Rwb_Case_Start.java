package com.cases;

import com.business.*;
import com.config.DriverManage;
import com.config.GetTestProperties;
import com.config.OpenChrome;
import com.util.Selenium2Proxy;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Hyj_Rwb_Case_Start {
    Selenium2Proxy selenium2Proxy;
    OpenChrome openChrome;
    Hyj_LoginBusiness hyjLoginBusiness;
    Hyj_LeftmenuBusiness hyj_leftmenuBusiness;
    Hyj_GoodsreleaseBusiness hyj_goodsreleaseBusiness;
    Hyj_LIveBusiness hyj_lIveBusiness;
    Hyj_AdminGoodsExamineBusiness adminGoodsExamineBusiness;
    Hyj_VideoBusiness hyj_videoBusiness;
    Hyj_ConsultantlnformationBusiness hyj_consultantlnformationBusiness;
    WebDriver driver;
    int aa=0;
    @BeforeMethod
    public void BeforeMethod() throws Exception {
        selenium2Proxy=new Selenium2Proxy();
        openChrome=new OpenChrome();
        hyjLoginBusiness=new Hyj_LoginBusiness();
        hyj_leftmenuBusiness=new Hyj_LeftmenuBusiness();
        hyj_goodsreleaseBusiness=new Hyj_GoodsreleaseBusiness();
        hyj_lIveBusiness=new Hyj_LIveBusiness();
        adminGoodsExamineBusiness=new Hyj_AdminGoodsExamineBusiness();
        hyj_videoBusiness=new Hyj_VideoBusiness();
        hyj_consultantlnformationBusiness=new Hyj_ConsultantlnformationBusiness();
        //加载驱动
         driver =DriverManage.getDriver("3");
         //加载chrome浏览器及配置
        if (aa==0){
            openChrome.getchromepre(driver,"shop");
        }else {
            openChrome.getchromepre(driver,"admin");
        }
    }
    @Test(priority = 1)
    public void LiveBroadcastTest() throws Exception {
        aa=1;
        hyjLoginBusiness.loginShop(driver);//shop登录
        hyj_leftmenuBusiness.Leftmenu(driver);//左侧菜单切换
        hyj_goodsreleaseBusiness.Clicklive(driver);//点击直播商品
        hyj_goodsreleaseBusiness.Clicknextstep(driver);//选择直播商品后，点击下一步
        hyj_lIveBusiness.Live_OneOperation(driver);//直播商品发布第一页基本信息
        hyj_lIveBusiness.Live_AddTeache(driver);//添加老师
        hyj_lIveBusiness.Live_TwoOperation(driver);//直播商品发布第二页基本信息
        hyj_lIveBusiness.Live_ThreeOperation(driver);//直播商品发布第三页基本信息

    }

    @Test(priority = 2)
    public void AdminLiveExamine()  {
        aa=0;
        hyjLoginBusiness.LoginAdmin(driver);//登录运营端
        adminGoodsExamineBusiness.AdminGoodsExamine(driver,GetTestProperties.getLiveGoodsname());//商品审核
    }

    @Test(priority = 3)
    public void VideoGoods(){
        aa=1;
        hyjLoginBusiness.loginShop(driver);//shop登录
        hyj_leftmenuBusiness.Leftmenu(driver);//左侧菜单切换
        hyj_goodsreleaseBusiness.ClickVideo(driver);//点击录播商品
        hyj_goodsreleaseBusiness.Clicknextstep(driver);//选择录播商品后，点击下一步
        hyj_videoBusiness.Video_OneOperation(driver);//录播商品发布第一页基本信息
        hyj_videoBusiness.Video_AddTeache(driver);//添加老师
        hyj_videoBusiness.Video_TwoOperation(driver);//录播商品发布第二页基本信息
        hyj_videoBusiness.Video_ThreeOperation(driver);//录播商品发布第三页基本信息

    }
    @Test(priority = 4)
    public void AdminVideoExamine()  {
        aa=0;
        hyjLoginBusiness.LoginAdmin(driver);//登录运营端
        adminGoodsExamineBusiness.AdminGoodsExamine(driver,GetTestProperties.getVideoGoodsname());//商品审核
    }
    @Test(priority = 5)
    public void ConsultantGoods(){
        aa=1;
        hyjLoginBusiness.loginShop(driver);//shop登录
        hyj_leftmenuBusiness.Leftmenu(driver);//左侧菜单切换
        hyj_goodsreleaseBusiness.Clickconsulting(driver);//点击咨询商品
        hyj_goodsreleaseBusiness.Clicknextstep(driver);//选择咨询商品后，点击下一步
        hyj_consultantlnformationBusiness.ConsultantInformation(driver);//咨询师信息

    }
    @Test(priority = 6)
    public void AdminConsultantExamine()  {
        aa=0;
        hyjLoginBusiness.LoginAdmin(driver);//登录运营端
        adminGoodsExamineBusiness.AdminGoodsExamine(driver,GetTestProperties.getconsultantgoodsname());//商品审核
    }

    @AfterMethod
    public void AfterMethod(){
        selenium2Proxy.close(driver);
        selenium2Proxy.quit(driver);
    }



}
