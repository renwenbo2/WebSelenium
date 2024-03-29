package com.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.HasInputDevices;
import org.openqa.selenium.Keyboard;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Mouse;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.config.GetTestProperties;

/**
 * Selenium 2.0
 *
 */
public class Selenium2Proxy extends LogsInit {

	public void close(WebDriver driver) {driver.close(); }

	public void quit(WebDriver driver) {
		driver.quit();
	}

	public void forward(WebDriver driver) {
		driver.navigate().forward();
	}

	public void back(WebDriver driver) {
		driver.navigate().back();
	}

	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	/**
	 * 清除所有的cookies
	 */
	public void deleteAllCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
	}

	// // 截图
	// public void captureScreenshot(String fileName) {
	// TakesScreenshot tsDriver = (TakesScreenshot) driver;
	// File image = new File(fileName);
	// tsDriver.getScreenshotAs(OutputType.FILE).renameTo(image);
	// }

	/**
	 * 截图,路径为工程目录下的screenshot,追加方法名
	 *
	 * @param methodname
	 */
	public void captureScreenshot(String methodname,WebDriver driver)
			throws InterruptedException {
		if (!isAlertExist(driver)) {
			// 定义了截图存放目录名
			// String dir_name = "screenshot";
			String dir_name = GetTestProperties.getPicDir();
			// 判断是否存在该目录
			if (!(new File(dir_name).isDirectory())) {
				// 如果不存在则新建一个目录
				new File(dir_name).mkdir();
			}

			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
			// 格式化当前时间，例如20121231-165210
			String time = sdf.format(new Date());

			try {
				// 执行屏幕截图，默认会把截图保存到temp目录
				File source_file = ((TakesScreenshot) driver)
						.getScreenshotAs(OutputType.FILE);
				// 将截图另存到我们需要保存的目录，例如screenshot\20121231-165210.png
				FileUtils.copyFile(source_file, new File(dir_name
						+ File.separator + time + "_" + methodname + ".png"));
			} catch (IOException e) {
				e.printStackTrace();
			} catch (UnhandledAlertException e1) {
				// e1.printStackTrace();
				RobotScreenShot cam = new RobotScreenShot();
				cam.snapShot(methodname);
			} catch (NoSuchWindowException e2) {
				// e2.printStackTrace();
				RobotScreenShot cam = new RobotScreenShot();
				cam.snapShot(methodname);
			}
		} else {
			RobotScreenShot cam = new RobotScreenShot();
			cam.snapShot(methodname);
		}
	}

	/**
	 * 截图,路径为工程目录下的screenshot
	 */
	public void captureScreenshot(WebDriver driver) throws InterruptedException {
		if (!isAlertExist(driver)) {
			// 定义了截图存放目录名
			// String dir_name = "screenshot";
			String dir_name = GetTestProperties.getPicDir();
			// 判断是否存在该目录
			if (!(new File(dir_name).isDirectory())) {
				// 如果不存在则新建一个目录
				new File(dir_name).mkdir();
			}

			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
			// 格式化当前时间，例如20121231-165210
			String time = sdf.format(new Date());

			try {
				// 执行屏幕截图，默认会把截图保存到temp目录
				File source_file = ((TakesScreenshot) driver)
						.getScreenshotAs(OutputType.FILE);
				// 将截图另存到我们需要保存的目录，例如screenshot\20121231-165210.png
				FileUtils.copyFile(source_file, new File(dir_name
						+ File.separator + time + ".png"));
			} catch (IOException e) {
				e.printStackTrace();
			} catch (UnhandledAlertException e1) {
				// e1.printStackTrace();
				RobotScreenShot cam = new RobotScreenShot();
				cam.snapShot();
			} catch (NoSuchWindowException e2) {
				// e2.printStackTrace();
				RobotScreenShot cam = new RobotScreenShot();
				cam.snapShot();
			}
		} else {
			RobotScreenShot cam = new RobotScreenShot();
			cam.snapShot();
		}
	}

	// // 切换指定的窗口----遍历最多10次，找到为止
	// public void switchToWindow(String windowTitle) {
	// for (int a = 0; a < 9; a++) {
	// Set<String> windowHandles = driver.getWindowHandles();
	// for (String handler : windowHandles) {
	// driver.switchTo().window(handler);
	// String title = driver.getTitle();
	// log.info("fangfa " + driver.getTitle());
	// if (windowTitle.equals(title)) {
	// // log.info("遍历了几次啊？？？！！！" +a);
	// a = 10;
	// break;
	// }
	// }
	// }
	// }

	/**
	 * 改进版的切换指定的窗口,适用于只弹出一个窗口的情况,不需要传入任何参数,直接切换到下一个窗口
	 */
	public void switchToWindow(WebDriver driver) {
		// 得到当前窗口的句柄
		String currentWindow = driver.getWindowHandle();
		// 得到所有窗口的句柄
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			String handle = it.next();
			if (currentWindow.equals(handle))
				continue;
			WebDriver window = driver.switchTo().window(handle);
			log.info("title,url = " + window.getTitle() + ","
					+ window.getCurrentUrl());
		}
	}

	/**
	 * 判断指定的窗口存在--遍历最多10次，找到为止，适用于多个弹窗的情况，传入指定窗口的title
	 *
	 * @param windowTitle
	 * @return
	 */
	public boolean switchToWindow(String windowTitle,WebDriver driver) {
		boolean flag = false;
		for (int a = 0; a < 9; a++) {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String handler : windowHandles) {
				driver.switchTo().window(handler);
				String title = driver.getTitle();
				if (windowTitle.equals(title)) {
					a = 10;
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

	/**
	 * 判断指定的窗口存在--适用于多个弹窗的情况，传入指定窗口的title(尚未测试)
	 *
	 * @param windowTitle
	 * @return
	 */
	public boolean switchToWindow2(String windowTitle,WebDriver driver) {
		boolean flag = false;
		try {
			String currentHandle = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String handler : handles) {
				if (handler.equals(currentHandle))
					continue;
				else {
					driver.switchTo().window(handler);
					if (driver.getTitle().equals(windowTitle)) {
						flag = true;
						log.info("Switch to window: " + windowTitle
								+ " successfully!");
						break;
					} else
						continue;
				}
			}
		} catch (NoSuchWindowException e) {
			log.info("Window: " + windowTitle + " cound not found!",
					e.fillInStackTrace());
			flag = false;
		}
		return flag;
	}

	/**
	 * 切换到对于的frame，传入参数为frame在dom中的id
	 */
	public void switchToFrame(String frameId,WebDriver driver) {
		driver.switchTo().frame(frameId);
	}

	/**
	 * 切换到对于的frame，传入参数为frame在dom中的index，从0开始
	 */
	public void switchToFrame(int frameId,WebDriver driver) {
		driver.switchTo().frame(frameId);
	}

	// 定位到所对应的Alert
	private Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	// 点击alert的确定按钮
	public void acceptAlert(WebDriver driver) {
		switchToAlert(driver).accept();
	}

	// 点击取消和上面的关闭按钮
	public void dismissAlert(WebDriver driver) {
		switchToAlert(driver).dismiss();
	}

	// 鼠标触发的事件，使用较少
	public Mouse getMouse(WebDriver driver) {
		return ((HasInputDevices) driver).getMouse();
		// mouse.mouseDown(((Locatable)weSecNav).getCoordinates());
	}

	// 得到键盘
	public Keyboard getKeyboard(WebDriver driver) {
		return ((HasInputDevices) driver).getKeyboard();
		// getKeyboard().pressKey(Keys.CONTROL);
	}

	/**
	 * 模拟键盘的ctrl+F5刷新
	 */
	public void refreshWithCtrlF5(WebDriver driver) {
		getKeyboard(driver).sendKeys(Keys.CONTROL, Keys.F5);
	}

	/**
	 * 模拟键盘的Tab切换焦点
	 */
	public void movefocusWithTab(WebDriver driver) {
		getKeyboard(driver).sendKeys(Keys.TAB);
	}

	/**
	 * 模拟键盘执行Alt+Ctrl+Delete的命令
	 */
	public void refreshWithAltCtrlDelete(WebDriver driver) {
		getKeyboard(driver).sendKeys(Keys.ALT, Keys.CONTROL, Keys.DELETE);
	}

	/**
	 * 模拟鼠标悬停事件
	 */
	public void moveToElement(By locator,WebDriver driver) {
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(locator)).perform();
	}

	/**
	 * 判断弹窗存在
	 * added by harry 2013-01-11
	 */
	public boolean isAlertExist(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException ex1) {
			return false;
		} catch (NoSuchWindowException ex2) {
			return false;
		}
	}

	/**
	 * 判断页面是否刷新
	 * added by harry 2013-01-29
	 *
	 * @param trigger
	 * @return
	 */
	public boolean waitPageRefresh(WebElement trigger) {
		int refreshTime = 0;
		boolean isRefresh = false;
		try {
			for (int i = 1; i < 60; i++) {
				refreshTime = i;
				trigger.getTagName();
				Thread.sleep(1000);
			}
		} catch (StaleElementReferenceException e) {
			isRefresh = true;
			log.info("Page refresh time is:" + refreshTime + " seconds!");
			return isRefresh;
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Page didnt refresh in 60 seconds!");
		return isRefresh;
	}

	/**
	 * 处理一个潜在的弹窗
	 * added by harry 2013-01-29
	 *
	 * @param driver
	 * @param option
	 *            :true(click ok);false(click cancel)
	 * @return
	 */
	public boolean dealPotentialAlert(boolean option,WebDriver driver) {
		boolean flag = false;
		try {
			Alert alert = driver.switchTo().alert();
			if (null == alert)
				throw new NoAlertPresentException();
			try {
				if (option) {
					alert.accept();
					log.info("Accept the alert: " + alert.getText());
				} else {
					alert.dismiss();
					log.info("Dismiss the alert: " + alert.getText());
				}
				flag = true;
			} catch (WebDriverException ex) {
				if (ex.getMessage().startsWith("Could not find"))
					log.info("There is no alert appear!");
				else
					throw ex;
			}
		} catch (NoAlertPresentException e) {
			log.info("There is no alert appear!");
		}
		return flag;
	}
	public void implicitlyWaitZero(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}


	/**
	 * 判断元素是否存在
	 *
	 * @param
	 *
	 */
	public Boolean isElementExist(WebDriver driver,By by) {
		try {
			Thread.sleep(3000);
			driver.findElement(by);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	/**
	 *
	 * @param pathcode
	 * @throws Exception
	 */
	public void getSystempop(Integer pathcode) throws Exception {
		Runtime exe = Runtime.getRuntime();
		String path1= CommonMethord.getRealath()+"res/ceshi.exe";
		String path2= CommonMethord.getRealath()+"res/ceshi1.exe";
		if (pathcode == 1) {
			exe.exec(path1);
			Thread.sleep(3000);
		}else if (pathcode==2){
			exe.exec(path2);
			Thread.sleep(3000);
		}
		}

}