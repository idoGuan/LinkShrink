package com.xiaoguan.shortlink.admin.dto.req;

import lombok.Data;

/**
 * ClassName: UserLoginRespDTO
 * Package: com.xiaoguan.shortlink.admin.dto.resp
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/5 9:10
 * @Version 1.0
 */
@Data
public class UserLoginReqDTO {

    private String username;

    private String password;
}
