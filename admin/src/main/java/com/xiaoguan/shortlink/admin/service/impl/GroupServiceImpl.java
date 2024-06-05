package com.xiaoguan.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoguan.shortlink.admin.dao.entity.GroupDO;
import com.xiaoguan.shortlink.admin.dao.mapper.GroupMapper;
import com.xiaoguan.shortlink.admin.service.GroupService;
import com.xiaoguan.shortlink.admin.util.RandomGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * ClassName: GroupServiceImpl
 * Package: com.xiaoguan.shortlink.admin.service.impl
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/5 11:47
 * @Version 1.0
 */
@Slf4j
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {


    @Override
    public void saveGroup(String groupName) {
        String gid;
        do{
            gid = RandomGenerator.generateRandom();
        }while(!hasGid(gid));

        GroupDO groupDO = GroupDO.builder()
                .gid(gid)
                .name(groupName)
                .build();
        baseMapper.insert(groupDO);

    }

    private boolean hasGid(String gid) {
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getGid, gid)
                //TODO 设置用户名
                .eq(GroupDO::getUsername, null);
        GroupDO hasGroupFlag = baseMapper.selectOne(queryWrapper);
        return hasGroupFlag == null;
    }
}
