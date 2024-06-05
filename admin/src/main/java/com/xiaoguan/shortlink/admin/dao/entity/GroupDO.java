package com.xiaoguan.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xiaoguan.shortlink.admin.common.database.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: GroupDO
 * Package: com.xiaoguan.shortlink.admin.dao.entity
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/5 11:44
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("t_group")
public class GroupDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名称
     */
    private String name;

    /**
     * 创建分组用户名
     */
    private String username;

    /**
     * 分组排序
     */
    private Integer sortOrder;

}
