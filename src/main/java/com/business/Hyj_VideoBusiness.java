package com.business;

import com.config.GetTestProperties;
import com.page.goodspublic.Hyj_GoodsDescriptionPage;
import com.page.goodspublic.Hyj_GoodsPublicPage;
import com.page.goodspublic.Hyj_GoodsTeachePage;
import com.page.goodsvideo.Hyj_VideoUploadPage;
import com.util.LogsInit;
import org.openqa.selenium.WebDriver;

public class Hyj_VideoBusiness extends LogsInit {
    Hyj_GoodsPublicPage hyj_goodsPublicPage=new Hyj_GoodsPublicPage();
    Hyj_GoodsTeachePage hyj_goodsTeachePage=new Hyj_GoodsTeachePage();
    Hyj_GoodsDescriptionPage hyj_goodsDescriptionPage=new Hyj_GoodsDescriptionPage();
    Hyj_VideoUploadPage hyj_videoUploadPage=new Hyj_VideoUploadPage();

    /**
     *
     *录播商品第一页基本信息
     */
    public void Video_OneOperation(WebDriver driver){
        hyj_goodsPublicPage.GoodsName(driver, GetTestProperties.getVideoGoodsname());//录播商品名称
        hyj_goodsPublicPage.GoodsType(driver);//录播商品类型
        hyj_goodsPublicPage.GoodsPrice(driver,GetTestProperties.getVideoGoodsprice());//录播商品单价
        hyj_goodsPublicPage.GoodsStock(driver,GetTestProperties.getVideoGoodsstock());//录播商品库存
        hyj_goodsPublicPage.GoodsRecommend(driver);//录播商品推荐首页
        hyj_goodsPublicPage.GoodsLanguages(driver);//录播商品授课语种
        hyj_goodsPublicPage.GoodsCrowd(driver);//录播商品适应人群
        hyj_goodsPublicPage.GoodsPattern(driver);//录播商品上课模式
        hyj_goodsPublicPage.GoodsOnenext(driver);//录播商品点击下一步
    }

    /**
     * 录播商品添加教师
     */
    public void Video_AddTeache(WebDriver driver){
        hyj_goodsTeachePage.ChooseTeache(driver);//选择老师按钮
        hyj_goodsTeachePage.SelectTeacher(driver);//选中老师复选框
        hyj_goodsTeachePage.ChooseTeacheConfirm(driver);//弹窗中确定按钮

    }

    /**
     * 录播商品第二页操作
     */
    public void Video_TwoOperation(WebDriver driver) {
        hyj_goodsDescriptionPage.ClickPhoto(driver);//点击上传图片
        hyj_goodsDescriptionPage.Goodsdescribe(driver,GetTestProperties.getVideoGoodsdescribe());//添加描述
        hyj_goodsDescriptionPage.TwoNext(driver);//点击第二页下一步
    }

    /**
     * 录播商品第三页操作
     */
    public void Video_ThreeOperation(WebDriver driver){
        hyj_videoUploadPage.VideoNewunit(driver);//添加单元
        hyj_videoUploadPage.VideoNewcourses(driver);//添加课程
        hyj_videoUploadPage.VideoReleaseButton(driver);//点击发布
    }
}
