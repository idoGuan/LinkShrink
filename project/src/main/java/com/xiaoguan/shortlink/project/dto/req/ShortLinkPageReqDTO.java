package com.xiaoguan.shortlink.project.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoguan.shortlink.project.dao.entity.ShortLinkDO;
import lombok.Data;

/**
 * ClassName: ShortLinkPageReqDTO
 * Package: com.xiaoguan.shortlink.project.dto.req
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/6 14:48
 * @Version 1.0
 */
@Data
public class ShortLinkPageReqDTO extends Page<ShortLinkDO> {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 排序标识
     */
    private String orderTag;
}