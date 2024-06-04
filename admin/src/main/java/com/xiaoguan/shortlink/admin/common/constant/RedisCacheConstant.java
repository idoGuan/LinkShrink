package com.xiaoguan.shortlink.admin.common.constant;

/**
 * ClassName: RedisCacheConstant
 * Package: com.xiaoguan.shortlink.admin.common.constant
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/4 21:04
 * @Version 1.0
 */
public class RedisCacheConstant {

    /**
     * 用户注册分布式锁
     */
    public static final String LOCK_USER_REGISTER_KEY = "short-link:lock_user-register:";

    /**
     * 分组创建分布式锁
     */
    public static final String LOCK_GROUP_CREATE_KEY = "short-link:lock_group-create:%s";

    /**
     * 用户登录缓存标识
     */
    public static final String USER_LOGIN_KEY = "short-link:login:";
}