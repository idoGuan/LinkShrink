package com.xiaoguan.shortlink.project.common.constant;

/**
 * ClassName: RedisKeyConstant
 * Package: com.xiaoguan.shortlink.project.common.constant
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/7 14:15
 * @Version 1.0
 */
public class RedisKeyConstant {

    /**
     * 短链接跳转前缀 Key
     */
    public static final String GOTO_SHORT_LINK_KEY = "short-link_goto_%s";

    /**
     * 短链接跳转锁前缀 Key
     */
    public static final String LOCK_GOTO_SHORT_LINK_KEY = "short-link_lock_goto_%s";

    /**
     * 短链接空值跳转前缀 Key
     */
    public static final String GOTO_IS_NULL_SHORT_LINK_KEY = "short-link_is-null_goto_%s";

}
