package com.xiaoguan.shortlink.admin.common.enums;

import com.xiaoguan.shortlink.admin.common.convention.errorcode.IErrorCode;

/**
 * ClassName: UserErrorCodeEnum
 * Package: com.xiaoguan.shortlink.admin.common.enums
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/4 17:25
 * @Version 1.0
 */
public enum UserErrorCodeEnum implements IErrorCode {

    USER_TOKEN_FAIL("A000200", "用户Token验证失败"),

    USER_NULL("BOO0200", "用户记录不存在"),

    USER_NAME_EXIST("BOO0201", "用户名已存在"),

    USER_EXIST("BOO0202", "用户记录已存在"),

    USER_SAVE_ERROR("BOO0203", "用户记录新增失败");


    private final String code;

    private final String message;

     UserErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String code() {
        return null;
    }

    public String message() {
        return null;
    }
}
