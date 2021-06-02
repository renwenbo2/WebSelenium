package com.page.login;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import com.util.LogsInit;
public class Hyj_LoginPage extends LogsInit {
	/**
	 * shop-击选择密码登录
	 */
	public void PasswordSign(WebDriver driver) {
		try {
			driver.findElement(By.xpath("//*[@id=\"login_page_box\"]/div/section/div[2]/a")).click();
			Thread.sleep(3000);
			log.info("选择密码登录成功");
		} catch (Exception e) {
			log.info("选择密码登录失败"+e);
		}
	}

	/***
	 *
	 * shop-切换语言Choice
	 */
	public void Choicelg(WebDriver driver){

		try {
			driver.findElement(By.id("//*[@id=\"selecy-language\"]")).click();
			Thread.sleep(3000);
			log.info("登录页面切换语言成功");
		} catch (Exception e) {
			log.info("登录页面切换语言失败"+e);
		}

	}

	/**
	 * shop-切换繁体
	 */
	public void Chroictcc(WebDriver driver)  {
		try {
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[2]")).click();
			Thread.sleep(3000);
			log.info("登录页面切换繁体成功");
		} catch (Exception e) {
			log.info("登录页面切换繁体失败");
		}
	}

	/**
	 * shop-切换国籍
	 */
	public void ChoiceCty(WebDriver driver) {
		try {
			driver.findElement(By.xpath("//*[@id=\"login-model\"]/section/form/div[1]/div/div/div/div/div[1]/input")).click();//"input[placeholder='請選擇']"
			Thread.sleep(3000);
			log.info("登录页面切换国籍成功");
		} catch (Exception e) {
			log.info("登录页面切换国籍失败"+e);
		}
	}


	/**
	 * shop-选择+86或者+886国籍
	 */
	public void SwitchCty86(WebDriver driver) {
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[2]")).click();
			Thread.sleep(3000);
			log.info("选择86或者886成功");
		} catch (Exception e) {
			log.info("选择86或者886失败"+e);
		}
	}

	/**
	 * shop-填写手机号
	 */
	public void setUsername(WebDriver driver, String userText) {
		try {
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div/div/input")).sendKeys(userText);
			Thread.sleep(5000);
			log.info("填写手机号成功");
		} catch (Exception e) {
			log.info("填写手机号失败"+e);
		}
	}

	/**
	 * shop-设置密码
	 */
	public void setPassword(WebDriver driver, String passText) {
		try {
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div/input")).sendKeys(passText);
			Thread.sleep(3000);
			log.info("设置密码成功");
		} catch (Exception e) {
			log.info("设置密码失败"+e);
		}
	}


	/**
	 * shop-点击登录按钮
	 *
	 * @param driver
	 */
	public void clickButton(WebDriver driver) {
		try {
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
			Thread.sleep(3000);
			log.info("点击登录成功");
		} catch (Exception e) {
			log.info("点击登录失败"+e);
		}
	}

	/**
	 * admin-输入用户名
	 */
	public void Adminusername(WebDriver driver, String adminusername){
		try {
			driver.findElement(By.xpath("//*[@id=\"login-model\"]/section/form/div[1]/div/div[1]/input")).sendKeys(adminusername);
			Thread.sleep(3000);
			log.info("运营端输入账号成功");
		} catch (Exception e) {
			log.info("运营端输入账号失败"+e);
		}
	}

	/**
	 * admin-输入密码
	 */
	public void Adminpassword(WebDriver driver, String adminpassword) {
		try {
			driver.findElement(By.xpath("//*[@id=\"login-model\"]/section/form/div[2]/div/div/input")).sendKeys(adminpassword);
			Thread.sleep(3000);
			log.info("运营端输入密码成功");
		} catch (Exception e) {
			log.info("运营端输入密码失败"+e);
		}
	}
	/**
	 * admin-登录按钮
	 */
	public void AdminLoginButton(WebDriver driver) {
		try {
			driver.findElement(By.xpath("//*[@id=\"login-model\"]/section/form/div[3]/button")).click();
			Thread.sleep(3000);
			log.info("运营端点击登录成功");
		} catch (InterruptedException e) {
			log.info("运营端点击登录失败"+e);
		}
	}
}