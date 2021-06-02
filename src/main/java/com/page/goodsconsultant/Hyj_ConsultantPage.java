package com.page.goodsconsultant;

import com.page.goodspublic.Hyj_UploadPicturesPage;
import com.util.LogsInit;
import org.apache.poi.hssf.record.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hyj_ConsultantPage extends LogsInit {
    Hyj_UploadPicturesPage hyj_uploadPicturesPage = new Hyj_UploadPicturesPage();

    /**
     * 咨询商品名称
     *
     * @param driver
     * @param consultantgoodsname
     */
    public void ConsultantGoodsName(WebDriver driver, String consultantgoodsname) {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-0\"]/div/form/div[1]/div/div[1]/input")).sendKeys(consultantgoodsname);
            Thread.sleep(3000);
            log.info("输入咨询商品名称成功");
        } catch (InterruptedException e) {
            log.info("输入咨询商品名称失败" + e);
        }
    }

    /**
     * 咨询商品单价
     *
     * @param driver
     * @param consultantgoodsprice
     */
    public void ConsultantGoodsPrice(WebDriver driver, String consultantgoodsprice) {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-0\"]/div/form/div[2]/div/div/input")).clear();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"pane-0\"]/div/form/div[2]/div/div/input")).sendKeys(consultantgoodsprice);
            Thread.sleep(3000);
            log.info("输入咨询商品单价成功");
        } catch (InterruptedException e) {
            log.info("输入咨询商品单价失败" + e);
        }
    }

    /**
     * 咨询商品库存
     *
     * @param driver
     * @param consultantgoodsstock
     */
    public void ConsultantGoodsStock(WebDriver driver,String consultantgoodsstock) {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-0\"]/div/form/div[3]/div/div/input")).sendKeys(consultantgoodsstock);

            Thread.sleep(3000);
            log.info("输入咨询商品单价成功");
        } catch (InterruptedException e) {
            log.info("输入咨询商品单价失败" + e);
        }
    }

    /**
     * 咨询商品推荐到首页
     *
     * @param driver
     */
    public void ConsultantGoodsRecommend(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-0\"]/div/form/div[4]/div/div/label[2]")).click();
            Thread.sleep(3000);
            log.info("点击咨询商品推荐到首页成功");
        } catch (InterruptedException e) {
            log.info("点击咨询商品推荐到首失败" + e);
        }
    }

    /**
     * 咨询商品下一步
     *
     * @param driver
     */
    public void ConsultantGoodsNextStep(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-0\"]/div/div[2]/button[2]")).click();
            Thread.sleep(3000);
            log.info("点击咨询商品下一步成功");
        } catch (InterruptedException e) {
            log.info("点击咨询商品下一步失败" + e);
        }
    }

    /**
     * 咨询商品上传图片框
     *
     * @param driver
     */
    public void ConsultantGoodsUploadPictures(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-2\"]/div/form/div[1]/div/div/div[1]/div")).click();
            Thread.sleep(3000);
            hyj_uploadPicturesPage.SystemPicture(1);
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[5]/div/div[1]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div[2]/div/div[2]/div[2]/button[2]")).click();
            log.info("点击咨询上传图片框成功");
        } catch (InterruptedException e) {
            log.info("点击咨询上传图片框失败" + e);
        }
    }

    /**
     * 咨询商品描述
     * @param driver
     * @param consultantgoodsdescribe
     */
    public void ConsultantGoodsDescribe(WebDriver driver, String consultantgoodsdescribe) {
        try {
            driver.findElement(By.xpath("//*[@id=\"myEditor\"]")).sendKeys(consultantgoodsdescribe);
            Thread.sleep(3000);
            log.info("输入咨询商品描述成功");
        } catch (InterruptedException e) {
            log.info("输入咨询商品描述失败" + e);
        }
    }

    /**
     * 咨询商品发布
     *
     * @param driver
     */
    public void ConsultantGoodsRelease(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-2\"]/div/div/button[2]")).click();
            Thread.sleep(3000);
            log.info("点击咨询商品发布成功");
        } catch (InterruptedException e) {
            log.info("点击咨询商品发布失败" + e);
        }
    }


}
