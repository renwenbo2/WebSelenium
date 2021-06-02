package com.business;

import com.page.leftmenu.Hyj_LeftmenuPage;
import com.util.LogsInit;
import org.openqa.selenium.WebDriver;


public class Hyj_LeftmenuBusiness extends LogsInit {
    Hyj_LeftmenuPage leftpage=new Hyj_LeftmenuPage();
    public void Leftmenu(WebDriver driver) {
        leftpage.LeftGoodsadmin(driver);//点击左侧菜单商品管理
        leftpage.LeftGoodsrelease(driver);//点击左侧菜单商品上架
    }
}
