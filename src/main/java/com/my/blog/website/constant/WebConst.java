package com.my.blog.website.constant;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by BlueT on 2017/3/3.
 */
@Component
public class WebConst {
    public static Map<String, String> initConfig = new HashMap<>();


    public static String LOGIN_SESSION_KEY = "login_user";

    public static final String USER_IN_COOKIE = "S_L_ID";

    /**
     * aes加密秘钥 ,key 必须为16位(多了少了都不行)
     */
    public static String AES_SALT = "sleewasleewaslee";

    /**
     * 最大获取文章条数
     */
    public static final int MAX_POSTS = 9999;

    /**
     * 最大页码
     */
    public static final int MAX_PAGE = 100;

    /**
     * 文章最多可以输入的文字数
     */
    public static final int MAX_TEXT_COUNT = 200000;

    /**
     * 文章标题最多可以输入的文字个数
     */
    public static final int MAX_TITLE_COUNT = 200;

    /**
     * 点击次数超过多少更新到数据库
     */
    public static final int HIT_EXCEED = 10;

    /**
     * 上传文件最大1M
     */
    public static Integer MAX_FILE_SIZE = 1048576*10;

    /**
     * 成功返回
     */
    public static String SUCCESS_RESULT = "SUCCESS";

    /**
     * 同一篇文章在2个小时内无论点击多少次只算一次阅读
     */
    public static Integer HITS_LIMIT_TIME = 7200;

    /**
     * 设置网站网址
     */
    public static void setSocial() {
        final String prefix = "social_";
        initConfig.put(prefix + "weibo", "https://www.weibo.com/");
        initConfig.put(prefix + "zhihu",  "https://www.zhihu.com/");
        initConfig.put(prefix + "github", "https://www.github.com/");
        initConfig.put(prefix + "twitter", "https://www.twitter.com/");


        testsite_title();

    }

    public static void testsite_title() {
        initConfig.put("site_title", "commons.site_title()");
    }
}
