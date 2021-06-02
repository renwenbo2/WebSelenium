package com.page.goodspublic;

import com.util.LogsInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hyj_GoodsPublicPage extends LogsInit {
    /**
     * 商品名称
     */
    public void GoodsName(WebDriver driver, String goodsname)  {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-0\"]/div/div[1]/form/div[1]/div/div/input")).sendKeys(goodsname);
            Thread.sleep(3000);
            log.info("输入直播商品名称成功");
        } catch (Exception e) {
            log.info("输入直播商品名称失败"+e);

        }
    }
    /**
     * 商品分类
     */
    public void GoodsType(WebDriver driver)  {//,By input1,By one,By two,By three
        try {
            driver.findElement( By.xpath("//*[@id=\"pane-0\"]/div/div[1]/form/div[2]/div/div/div[1]/input")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/ul/li[1]/span/span")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/ul/li[2]/span/span")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/div[1]/ul/li[2]/span/span")).click();
            Thread.sleep(3000);
            log.info("选择直播商品类型成功");
        } catch (Exception e) {
            log.info("选择直播商品类型失败"+e);
        }

    }
    /**
     * 商品单价
     */
    public void GoodsPrice(WebDriver driver,String goodsprice) {

        try {
            driver.findElement(By.xpath("//*[@id=\"pane-0\"]/div/div[1]/form/div[3]/div/div/input")).clear();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"pane-0\"]/div/div[1]/form/div[3]/div/div[1]/input")).sendKeys(goodsprice);
            Thread.sleep(3000);
            log.info("输入商品单价成功");
        } catch (Exception e) {
            log.info("输入商品单价失败"+e);
        }

    }
    /**
     * 直播--商品库存
     */
    public void GoodsStock(WebDriver driver,String goodsstock) {
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-0\"]/div/div[1]/form/div[4]/div/div/input")).clear();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"pane-0\"]/div/div[1]/form/div[4]/div/div[1]/input")).sendKeys(goodsstock);
            Thread.sleep(3000);
            log.info("输入商品库存成功");
        } catch (Exception e) {
            log.info("输入商品库存失败"+e);

        }
    }

    /**
     *
     * 推荐到机构首页
     */
    public void GoodsRecommend(WebDriver driver){
        try {
            driver.findElement(By.xpath("//*[@id=\"pane-0\"]/div/div[1]/form/div[6]/div/div/label[2]/span[1]/span")).click();
            Thread.sleep(3000);
            log.info("推荐到机构首页选择成功");
        } catch (Exception e) {
            log.info("推荐到机构首页选择失败"+e);
        }

    }

    /**
     *
     * 授课语种
     */
    public void GoodsLanguages(WebDriver driver) {

        try {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[5]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div/form/div[1]/div/div/label[1]/span[2]")).click();
            Thread.sleep(3000);
            log.info("选择授课语种成功");
        } catch (Exception e) {
            log.info("选择授课语种失败"+e);
        }

    }

    /**
     *
     * 适应人群
     */
    public void GoodsCrowd(WebDriver driver) {
        try {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[5]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div/form/div[2]/div/div/label[1]/span[2]")).click();
            Thread.sleep(3000);
            log.info("选择适应人群成功");
        } catch (Exception e) {
            log.info("选择适应人群失败"+e);
        }

    }

    /**
     *
     * 上课模式
     */
    public void GoodsPattern(WebDriver driver){

        try {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[5]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div/form/div[3]/div/div/label[1]/span[2]")).click();
            Thread.sleep(3000);
            log.info("选择上课模式成功");
        } catch (Exception e) {
            log.info("选择上课模式失败"+e);
        }

    }

    /**
     *
     * 下一步
     */
    public void GoodsOnenext(WebDriver driver){

        try {
            driver.findElement(By.xpath("//*[@id=\"pane-0\"]/div/div[2]/button[2]")).click();
            Thread.sleep(3000);
            log.info("点击直播第一页的下一步成功");
        } catch (Exception e) {
            log.info("点击直播第一页的下一步失败"+e);
        }

    }

}
