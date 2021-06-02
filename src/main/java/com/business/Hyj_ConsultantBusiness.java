package com.business;

import com.config.GetTestProperties;
import com.page.goodsconsultant.Hyj_ConsultantPage;
import com.util.LogsInit;
import org.openqa.selenium.WebDriver;

public class Hyj_ConsultantBusiness extends LogsInit {
    Hyj_ConsultantPage hyj_consultantPage =new Hyj_ConsultantPage();
    public void ConsultantGoods(WebDriver driver){
        hyj_consultantPage.ConsultantGoodsName(driver, GetTestProperties.getconsultantgoodsname());//咨询商品名称
        hyj_consultantPage.ConsultantGoodsPrice(driver,GetTestProperties.getconsultantgoodsprice());//咨询商品单价
        hyj_consultantPage.ConsultantGoodsStock(driver,GetTestProperties.getconsultantgoodsstock());//咨询商品库存
        hyj_consultantPage.ConsultantGoodsRecommend(driver);//咨询商品推荐到首页
        hyj_consultantPage.ConsultantGoodsNextStep(driver);//咨询商品下一步
        hyj_consultantPage.ConsultantGoodsUploadPictures(driver);//咨询商品上传图片
        hyj_consultantPage.ConsultantGoodsDescribe(driver,GetTestProperties.getconsultantgoodsdescribe());//咨询商品描述
        hyj_consultantPage.ConsultantGoodsRelease(driver);//咨询商品发布

    }
}
