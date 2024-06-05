package com.xiaoguan.shortlink.admin.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginRespDTO {

    /**
     * 用户token
     */
    private String token;
}
