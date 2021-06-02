package com.page.consultant;

import com.page.goodspublic.Hyj_UploadPicturesPage;
import com.util.LogsInit;
import com.util.Selenium2Proxy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConsultantInformationPage extends LogsInit {
    Hyj_UploadPicturesPage hyj_uploadPicturesPage=new Hyj_UploadPicturesPage();

    /**
     * 点击编辑
     */
    public void Consultant_Edit(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/div[1]/button")).click();
            Thread.sleep(3000);
            log.info("点击编辑成功");
        } catch (InterruptedException e) {
            log.info("点击编辑失败" + e);
        }

    }

    /**
     * 成为志愿者
     */
    public void Consultant_Volunteer(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/form/div[1]/div/label[1]/span[1]/span")).click();
            Thread.sleep(3000);
            log.info("选择成为志愿者成功");
        } catch (InterruptedException e) {
            log.info("选择成为志愿者失败" + e);
        }

    }

    /**
     * 输入咨询师名称
     *
     * @param driver
     * @param consultantname
     */
    public void Consultant_Name(WebDriver driver, String consultantname) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/form/div[2]/div/div[1]/input")).sendKeys(consultantname);
            Thread.sleep(3000);
            log.info("输入咨询师名称成功");
        } catch (InterruptedException e) {
            log.info("输入咨询师名称失败" + e);
        }

    }

    /**
     * 点击上传咨询师第一张照片框
     *
     * @param driver
     */
    public void Consultant_PhotoOne(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/form/div[3]/div/div/div[1]/div")).click();
            Thread.sleep(3000);
            hyj_uploadPicturesPage.SystemPicture(1);
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[5]/div/div[1]/div/div/form/div[3]/div/div/div[2]/div/div[2]/div[2]/button[2]")).click();
            Thread.sleep(3000);
            log.info("点击第一个咨询师上传照片框成功");
        } catch (InterruptedException e) {
            log.info("点击第一个咨询师上传照片框失败" + e);
        }

    }

    /**
     * 点击上传咨询师第二张照片框
     *
     * @param driver
     */
    public void Consultant_PhotoTwo(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/form/div[4]/div/div/div[1]/div")).click();
            Thread.sleep(3000);
            hyj_uploadPicturesPage.SystemPicture(1);
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[5]/div/div[1]/div/div/form/div[4]/div/div/div[2]/div/div[2]/div[2]/button[2]")).click();
            Thread.sleep(3000);
            log.info("点击第二个咨询师上传照片框成功");
        } catch (InterruptedException e) {
            log.info("点击第二个咨询师上传照片框失败" + e);
        }

    }

    /**
     * 输入咨询师简介
     *
     * @param driver
     * @param introduce
     */
    public void Consultant_Introduce(WebDriver driver, String introduce) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/form/div[5]/div/div[1]/textarea")).sendKeys(introduce);
            Thread.sleep(3000);
            log.info("输入咨询师简介成功");
        } catch (InterruptedException e) {
            log.info("输入咨询师简介失败" + e);
        }

    }

    /**
     * 咨询师擅长咨询类别
     *
     * @param driver
     */
    public void Consultant_Category(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/form/div[6]/div/div/label[3]")).click();
            Thread.sleep(3000);
            log.info("选择咨询师擅长咨询类别成功");
        } catch (InterruptedException e) {
            log.info("选择咨询师擅长咨询类别失败" + e);
        }

    }

    /**
     * 输入咨询师专业领域
     *
     * @param driver
     * @param major
     */
    public void Consultant_Major(WebDriver driver, String major) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/form/div[7]/div/div/input")).sendKeys(major);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/form/div[7]/div/div/div/button")).click();
            Thread.sleep(3000);
            log.info("输入咨询师专业领域成功");
        } catch (InterruptedException e) {
            log.info("输入咨询师专业领域失败" + e);
        }

    }

    /**
     * 输入咨询师教育经历
     *
     * @param driver
     * @param education
     */
    public void Consultant_Education(WebDriver driver, String education) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/form/div[8]/div/div/textarea")).sendKeys(education);
            Thread.sleep(3000);
            log.info("输入咨询师教育经历成功");
        } catch (InterruptedException e) {
            log.info("输入咨询师教育经历失败" + e);
        }

    }

    /**
     * 输入咨询师工作经历
     *
     * @param driver
     * @param work
     */
    public void Consultant_Work(WebDriver driver, String work) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/form/div[9]/div/div/textarea")).sendKeys(work);
            Thread.sleep(3000);
            log.info("输入咨询师工作经历成功");
        } catch (InterruptedException e) {
            log.info("输入咨询师工作经历失败" + e);
        }

    }
    /**
     * 点击设置服务时间
     *
     * @param driver
     */
    public void ConsultantService_Time(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/form/div[10]/div/button")).click();
            Thread.sleep(3000);
            log.info("点击设置服务时间成功");
        } catch (InterruptedException e) {
            log.info("点击设置服务时间失败" + e);
        }

    }


    /**
     * 添加持有证书
     *
     * @param driver
     */
    public void Consultant_Certificate(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/form/div[12]/div/button")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[5]/div/div[1]/div/div/div/div/div[2]/form/div[1]/div/div/label[5]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[5]/div/div[1]/div/div/div/div/div[2]/form/div[2]/div/button[1]")).click();
            Thread.sleep(3000);
            log.info("点击添加持有证书成功");
        } catch (InterruptedException e) {
            log.info("点击添加持有证书失败" + e);
        }
    }

    /**
     * 输入自我介绍
     *
     * @param driver
     * @param self
     */
    public void Consultant_Self_Introduce(WebDriver driver, String self) {
        try {
            driver.findElement(By.xpath("//*[@id=\"myEditor\"]")).sendKeys(self);
            Thread.sleep(3000);
            log.info("输入自我介绍成功");
        } catch (InterruptedException e) {
            log.info("输入自我介绍失败" + e);
        }

    }

    /**
     * 点击下一步
     *
     * @param driver
     */
    public void Consultant_NextStep(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//*[@id=\"iframe-box\"]/div[1]/div/div/form/div[14]/div/button")).click();
            Thread.sleep(3000);
            log.info("点击下一步成功");
        } catch (InterruptedException e) {
            log.info("点击下一步失败" + e);
        }

    }
}
