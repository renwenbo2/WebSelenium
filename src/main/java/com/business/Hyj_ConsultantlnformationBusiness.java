package com.business;

import com.config.GetTestProperties;
import com.page.consultant.ConsultantInformationPage;
import com.page.consultant.ConsultantTimePage;
import com.page.leftmenu.Hyj_LeftmenuPage;
import com.util.LogsInit;
import com.util.Selenium2Proxy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;

public class Hyj_ConsultantlnformationBusiness extends LogsInit {
    ConsultantInformationPage consultantInformationPage = new ConsultantInformationPage();
    ConsultantTimePage consultantTimePage = new ConsultantTimePage();
    Hyj_LeftmenuPage hyj_leftmenuPage = new Hyj_LeftmenuPage();
    Hyj_GoodsreleaseBusiness hyj_goodsreleaseBusiness = new Hyj_GoodsreleaseBusiness();
    Hyj_ConsultantBusiness hyj_consultantBusiness = new Hyj_ConsultantBusiness();
    Selenium2Proxy selenium2Proxy=new Selenium2Proxy();

    public void ConsultantInformation(WebDriver driver) {
        log.info(selenium2Proxy.isElementExist(driver,By.xpath(GetTestProperties.getconsultantvolunteer())));
        if (selenium2Proxy.isElementExist(driver, By.xpath(GetTestProperties.getconsultantvolunteer()))) {
            consultantInformationPage.Consultant_Volunteer(driver);//成为志愿者
            consultantInformationPage.Consultant_Name(driver, GetTestProperties.getconsultantname());//输入咨询师名称
            consultantInformationPage.Consultant_PhotoOne(driver);//点击上传咨询师第一张照片框
            consultantInformationPage.Consultant_PhotoTwo(driver);//点击上传咨询师第二张照片框
            consultantInformationPage.Consultant_Introduce(driver, GetTestProperties.getconsultantintroduce());//输入咨询师简介
            consultantInformationPage.Consultant_Category(driver);//咨询师擅长咨询类别
            consultantInformationPage.Consultant_Major(driver, GetTestProperties.getconsultantmajor());//输入咨询师专业领域
            consultantInformationPage.Consultant_Education(driver, GetTestProperties.getconsultanteducation());//输入咨询师教育经历
            consultantInformationPage.Consultant_Work(driver, GetTestProperties.getconsultantwork());//输入咨询师教育经历
            consultantInformationPage.Consultant_Certificate(driver);//添加持有证书
            consultantInformationPage.Consultant_Self_Introduce(driver, GetTestProperties.getconsultantself());//输入自我介绍
            consultantInformationPage.Consultant_NextStep(driver);//点击下一步
            ConsultantTime(driver);
            hyj_consultantBusiness.ConsultantGoods(driver);//咨询商品
        } else {
            hyj_consultantBusiness.ConsultantGoods(driver);//咨询商品
        }
    }

    public void ConsultantTime(WebDriver driver) {
        consultantTimePage.ConsultantAddTime(driver);//新增咨询服务时间按钮
        consultantTimePage.ConsultantChooseTime(driver);//选择咨询服务时间框
        consultantTimePage.ConsultantSelectDate(driver);//选择开始日期及结束日期
        consultantTimePage.ConsultantClickTime(driver);//选择开始结束时间
        consultantTimePage.ConsultantSelectTime(driver);//点击选择开始结束时间
        consultantTimePage.ConsultantPreservation(driver);//点击保存按钮
        consultantTimePage.ConsultantReturn(driver);//点击返回按钮
        hyj_leftmenuPage.LeftGoodsList(driver);//点击商品列表
        hyj_leftmenuPage.LeftGoodsrelease(driver);//点击商品上架
        hyj_goodsreleaseBusiness.Clickconsulting(driver);//点击咨询商品
        hyj_goodsreleaseBusiness.Clicknextstep(driver);//选择咨询商品后，点击下一步


    }


}
