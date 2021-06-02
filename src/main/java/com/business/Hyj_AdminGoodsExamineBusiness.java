package com.business;

import com.page.admin.AdminGoodsExaminePage;
import com.util.LogsInit;
import org.openqa.selenium.WebDriver;

public class Hyj_AdminGoodsExamineBusiness extends LogsInit {
    AdminGoodsExaminePage adminGoodsExaminePage=new AdminGoodsExaminePage();

    /**
     *   运营端商品审核
     */
    public void AdminGoodsExamine (WebDriver driver,String inputname){
        adminGoodsExaminePage.CommodityManagement(driver);//商品管理
        adminGoodsExaminePage.CommodityAudit(driver);//商品管理-商品审核
        adminGoodsExaminePage.SearchName(driver,inputname);//商品管理-商品审核-商品名称输入框
        adminGoodsExaminePage.SearchButton(driver);//商品管理-商品审核-查询按钮
        adminGoodsExaminePage.Approved(driver);//通过按钮
        adminGoodsExaminePage.ApprovedDetermine(driver);//二次确认弹窗确定按钮
    }
}
