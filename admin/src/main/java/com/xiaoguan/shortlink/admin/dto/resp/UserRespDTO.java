package com.xiaoguan.shortlink.admin.dto.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.xiaoguan.shortlink.admin.common.serialize.PhoneDesensitizationSerializer;
import lombok.Data;

/**
 * ClassName: UserRespDTO
 * Package: com.xiaoguan.shortlink.admin.dto.resp
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/4 16:38
 * @Version 1.0
 */
@Data
public class UserRespDTO {

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    @JsonSerialize(using = PhoneDesensitizationSerializer.class)
    private String phone;

    /**
     * 邮箱
     */
    private String mail;


}
