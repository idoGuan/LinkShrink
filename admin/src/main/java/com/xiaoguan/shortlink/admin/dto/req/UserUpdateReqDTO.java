package com.xiaoguan.shortlink.admin.dto.req;

import lombok.Data;

/**
 * ClassName: UserRegisterReqDTO
 * Package: com.xiaoguan.shortlink.admin.dto.req
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/4 19:59
 * @Version 1.0
 */
@Data
public class UserUpdateReqDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

}
