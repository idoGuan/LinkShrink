package com.xiaoguan.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoguan.shortlink.admin.dao.entity.UserDO;
import com.xiaoguan.shortlink.admin.dao.mapper.UserMapper;
import com.xiaoguan.shortlink.admin.dto.resp.UserRespDTO;
import com.xiaoguan.shortlink.admin.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.xiaoguan.shortlink.admin.service.impl
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/4 16:34
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {
    public UserRespDTO getUserByUsername(String username) {
        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class)
                .eq(UserDO::getUsername, username);
        UserDO userDO = baseMapper.selectOne(queryWrapper);
        UserRespDTO userRespDTO = new UserRespDTO();
        BeanUtils.copyProperties(userDO, userRespDTO);
        return userRespDTO;
    }
}
