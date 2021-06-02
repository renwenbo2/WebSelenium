package com.page.goodspublic;

import com.util.LogsInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hyj_GoodsTeachePage extends LogsInit {
    /**
     *点击选择老师
     */
    public void ChooseTeache(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-2\"]/div/div[1]/button[2]")).click();
            Thread.sleep(3000);
            log.info("点击选择老师按钮成功");
        } catch (Exception e) {
            log.info("点击选择老师按钮失败"+e);

        }

    }
    /**
     * 选中弹窗老师
     */
    public void SelectTeacher(WebDriver driver) {

        try {
            driver.findElement(By.xpath("//*[@id=\"pane-2\"]/div/div[6]/div/div[2]/div[1]/div[3]/table/tbody/tr/td[1]/div/label/span/span")).click();
            Thread.sleep(3000);
            log.info("点击弹窗中的单选框，选择老师成功");
        } catch (Exception e) {
            log.info("点击弹窗中的单选框，选择老师失败"+e);
        }
    }
    /**
     * 选择老师弹窗中确定按钮
     */
    public void ChooseTeacheConfirm(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-2\"]/div/div[6]/div/div[2]/div[2]/button")).click();
            Thread.sleep(3000);
            log.info("点击选择老师弹窗中的确定按钮成功");
        } catch (Exception e) {
            log.info("点击选择老师弹窗中的确定按钮失败"+e);
        }
    }
}
