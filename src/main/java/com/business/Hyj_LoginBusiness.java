package com.business;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.config.GetTestProperties;
import com.page.login.Hyj_LoginPage;
import com.util.LogsInit;
import com.util.Selenium2Proxy;

public class Hyj_LoginBusiness extends LogsInit {

	Hyj_LoginPage page = new Hyj_LoginPage();

	/**
	 * 打开测试URL
	 * 
	 * @param driver
	 */
	public void goTestShopUrl(WebDriver driver) {
		driver.get(GetTestProperties.getTestshopUrl());

	}

	/**
	 * 定义密码登录+86
	 * 
	 * @param driver
	 * @return
	 * @throws InterruptedException
	 */
	public void loginShop(WebDriver driver) {
		page.Choicelg(driver);//切换语言
		page.Chroictcc(driver);//选择繁体
		page.PasswordSign(driver);//点击密码登录
//		page.SwitchCty86(driver);//切换国籍
//		page.ChoiceCty(driver);//选择国籍
		page.setUsername(driver, GetTestProperties.getloginshopusername());//输入用户名
		page.setPassword(driver, GetTestProperties.getloginshoppassword());//输入密码
		page.clickButton(driver);//点击登录按钮
	}

	/**
	 *admin-账号登录
	 */
	public void LoginAdmin(WebDriver driver) {
	    page.Adminusername(driver,GetTestProperties.getloginadminusername());//输入admin用户名
		page.Adminpassword(driver,GetTestProperties.getloginadminpassword());//输入admin密码
		page.AdminLoginButton(driver);//点击admin登录按钮


	}



}
