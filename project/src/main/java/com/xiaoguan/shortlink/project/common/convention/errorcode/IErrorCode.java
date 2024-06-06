package com.xiaoguan.shortlink.project.common.convention.errorcode;

/**
 * ClassName: IErrorCode
 * Package: com.xiaoguan.shortlink.admin.common.convention.errorcode
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/4 17:23
 * @Version 1.0
 */
/**
 * 平台错误码
 */
public interface IErrorCode {

    /**
     * 错误码
     */
    String code();

    /**
     * 错误信息
     */
    String message();
}
