package com.xiaoguan.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoguan.shortlink.admin.dao.entity.UserDO;
import com.xiaoguan.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.xiaoguan.shortlink.admin.dto.resp.UserRespDTO;

/**
 * ClassName: UserService
 * Package: com.xiaoguan.shortlink.admin.service
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/4 16:34
 * @Version 1.0
 */
public interface UserService extends IService<UserDO> {

    UserRespDTO getUserByUsername(String username);

    Boolean hasUsername(String username);

    void register(UserRegisterReqDTO userRegisterReqDTO);
}
