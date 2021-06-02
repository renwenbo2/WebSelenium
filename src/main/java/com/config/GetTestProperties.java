package com.config;


public class GetTestProperties {
    static TestConfig tc = new TestConfig("conf/env.properties");
    static TestConfig goods = new TestConfig("conf/goods.env.properties");
    static TestConfig consultant = new TestConfig("conf/consultant.properties");
    static TestConfig element = new TestConfig("conf/element.properties");
    public static String getPicDir() {
        String picDir = goods.getValue("picDir");
        return picDir;
    }
    public static String getLiveGoodsname() {
        String live_goods_name = goods.getValue("live_goods_name");
        return live_goods_name;
    }

    public static String getLiveGoodsprice() {
        String live_goods_price = goods.getValue("live_goods_price");
        return live_goods_price;
    }

    public static String getLiveGoodsstock() {
        String live_goods_stock = goods.getValue("live_goods_stock");
        return live_goods_stock;
    }

    public static String getLiveGoodsdescribe() {
        String live_goods_stock = goods.getValue("live_goods_describe");
        return live_goods_stock;
    }

    public static String getVideoGoodsname() {
        String video_oods_name = goods.getValue("video_goods_name");
        return video_oods_name;
    }

    public static String getVideoGoodsprice() {
        String video_goods_price = goods.getValue("video_goods_price");
        return video_goods_price;
    }

    public static String getVideoGoodsstock() {
        String video_goods_stock = goods.getValue("video_goods_stock");
        return video_goods_stock;
    }

    public static String getVideoGoodsdescribe() {
        String live_goods_stock = goods.getValue("video_goods_describe");
        return live_goods_stock;
    }

    //测试商家端链接地址
    public static String getTestshopUrl() {
        String testshopurl = tc.getValue("testshopurl");
        return testshopurl;
    }

    //登录商家端用户名
    public static String getloginshopusername() {
        String loginshopusername = tc.getValue("loginshopusername");
        return loginshopusername;
    }

    //登录商家端密码
    public static String getloginshoppassword() {
        String loginshoppassword = tc.getValue("loginshoppassword");
        return loginshoppassword;
    }

    //测试运营端链接地址
    public static String getTestadminUrl() {
        String testadminurl = tc.getValue("testadminurl");
        return testadminurl;
    }

    //登录用户名
    public static String getloginadminusername() {
        String loginadminusername = tc.getValue("loginadminusername");
        return loginadminusername;
    }

    //登录密码
    public static String getloginadminpassword() {
        String loginadminpassword = tc.getValue("loginadminpassword");
        return loginadminpassword;
    }

    //咨询师名称
    public static String getconsultantname() {
        String consultant_name = consultant.getValue("consultant_name");
        return consultant_name;
    }

    //咨询师简介
    public static String getconsultantintroduce() {
        String consultantintroduce = consultant.getValue("consultant_introduce");
        return consultantintroduce;
    }

    //咨询师专业领域
    public static String getconsultantmajor() {
        String consultantmajor = consultant.getValue("consultant_major");
        return consultantmajor;
    }

    //咨询师教育经历
    public static String getconsultanteducation() {
        String consultanteducation = consultant.getValue("consultant_education");
        return consultanteducation;
    }

    //咨询师工作经历
    public static String getconsultantwork() {
        String consultantwork = consultant.getValue("consultant_work");
        return consultantwork;
    }

    //咨询师自我介绍
    public static String getconsultantself() {
        String consultantself = consultant.getValue("consultant_self");
        return consultantself;
    }
    //咨询师商品名称
    public static String getconsultantgoodsname() {
        String consultantgoodsname = goods.getValue("consultant_goods_name");
        return consultantgoodsname;
    }
    //咨询师商品单价
    public static String getconsultantgoodsprice() {
        String consultantgoodsprice = goods.getValue("consultant_goods_price");
        return consultantgoodsprice;
    }
    //咨询师商品库存
    public static String getconsultantgoodsstock() {
        String consultantgoodsstock = goods.getValue("consultant_goods_stock");
        return consultantgoodsstock;
    }
    //咨询师商品库存
    public static String getconsultantgoodsdescribe() {
        String consultantgoodsdescribe = goods.getValue("consultant_goods_describe");
        return consultantgoodsdescribe;
    }
    //咨询师成为志愿者
    public static String getconsultantvolunteer() {
        String consultantvolunteer = element.getValue("consultant_volunteer");
        return consultantvolunteer;
    }





}