package com.xiaoguan.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoguan.shortlink.admin.dao.entity.GroupDO;

/**
 * ClassName: GroupService
 * Package: com.xiaoguan.shortlink.admin.service
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/5 11:46
 * @Version 1.0
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * 新增短链接分组
     *
     * @param groupName 短链接分组名
     */
    void saveGroup(String groupName);
}
