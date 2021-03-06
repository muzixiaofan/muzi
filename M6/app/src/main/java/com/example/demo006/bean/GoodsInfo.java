package com.example.demo006.bean;

import com.example.demo006.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "外套男女oversize摇", "水蜜桃粉橘粉上衣女", "保护套", "双肩包男女学院风", "肖战同款衣服", "高级感双肩包", "王一博同款粉色毛衣","COLOR KEY珂拉琪"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "外套男女oversize摇粒绒夹克",
            "230g水蜜桃粉橘粉上衣女樱花粉t恤男",
            "能语 充满希望万物可爱刺绣文字卡通iPhone 11 Pro Max苹果12手机壳X/xr/xsmax/SE2/mini情侣8p全包7保护套",
            "日系ulzzang复古风软妹双肩包男女学院风学生书包",
            "肖战同款衣服2019秋冬拼接外套男港风帅气休闲工装夹克加厚棉服女",
            "高级感双肩包百搭网红同款单肩斜挎软PU皮背包时尚潮流少女小书包",
            "王一博同款粉色毛衣男女宽松慵懒风大V领针织衫外穿上衣2020秋冬",
            "COLOR KEY珂拉琪 小黑镜唇釉漆光系列 唇蜜口红持久显白不易沾杯"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {188, 399, 290, 275, 198, 598,134,154};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.a001_s, R.drawable.a002_s, R.drawable.a003_s,
            R.drawable.a004_s, R.drawable.a005_s, R.drawable.a006_s,
            R.drawable.a007_s, R.drawable.a008_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.a001, R.drawable.a002, R.drawable.a003,
            R.drawable.a004, R.drawable.a005, R.drawable.a006,
            R.drawable.a007, R.drawable.a008
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}