package com.business;

import com.config.GetTestProperties;
import com.page.goodspublic.Hyj_GoodsDescriptionPage;
import com.page.goodspublic.Hyj_GoodsPublicPage;
import com.page.goodspublic.Hyj_GoodsTeachePage;
import com.page.goodslive.Hyj_LiveUploadPage;
import com.util.LogsInit;
import org.openqa.selenium.WebDriver;


public class Hyj_LIveBusiness extends LogsInit {
    Hyj_GoodsTeachePage hyj_goodsTeachePage=new Hyj_GoodsTeachePage();
    Hyj_LiveUploadPage hyj_liveUploadPage =new Hyj_LiveUploadPage();
    Hyj_GoodsPublicPage hyj_goodsPublicPage=new Hyj_GoodsPublicPage();
    Hyj_GoodsDescriptionPage hyj_goodsDescriptionPage=new Hyj_GoodsDescriptionPage();


    /**
     *
     *直播商品第一页基本信息
     */
    public void Live_OneOperation(WebDriver driver) {
        hyj_goodsPublicPage.GoodsName(driver, GetTestProperties.getLiveGoodsname());//直播商品名称
        hyj_goodsPublicPage.GoodsType(driver);//直播商品类型
        hyj_goodsPublicPage.GoodsPrice(driver,GetTestProperties.getLiveGoodsprice());//直播商品单价
        hyj_goodsPublicPage.GoodsStock(driver,GetTestProperties.getLiveGoodsstock());//直播商品库存
        hyj_goodsPublicPage.GoodsRecommend(driver);//直播商品推荐首页
        hyj_goodsPublicPage.GoodsLanguages(driver);//直播商品授课语种
        hyj_goodsPublicPage.GoodsCrowd(driver);//直播商品适应人群
        hyj_goodsPublicPage.GoodsPattern(driver);//直播商品上课模式
        hyj_goodsPublicPage.GoodsOnenext(driver);//直播商品点击下一步
    }
    /**
     * 直播商品添加教师
     */
    public  void Live_AddTeache(WebDriver driver) throws Exception {

        hyj_goodsTeachePage.ChooseTeache(driver);//选择老师按钮
        hyj_goodsTeachePage.SelectTeacher(driver);//选中老师复选框
        hyj_goodsTeachePage.ChooseTeacheConfirm(driver);//弹窗中确定按钮

    }
    /**
    * 直播商品第二页操作
    */
    public void Live_TwoOperation(WebDriver driver) throws Exception{
        hyj_goodsDescriptionPage.ClickPhoto(driver);//点击上传图片
        hyj_goodsDescriptionPage.Goodsdescribe(driver,GetTestProperties.getLiveGoodsdescribe());//添加描述
        hyj_goodsDescriptionPage.TwoNext(driver);//点击第二页下一步
    }

    /**
     * 直播商品第三页操作
     */
     public void Live_ThreeOperation(WebDriver driver) throws  Exception{
         hyj_liveUploadPage.LiveNewunit(driver);//添加单元
         hyj_liveUploadPage.LiveNewcourses(driver);//添加课程
         hyj_liveUploadPage.LiveReleaseButton(driver);//点击发布

     }

}
