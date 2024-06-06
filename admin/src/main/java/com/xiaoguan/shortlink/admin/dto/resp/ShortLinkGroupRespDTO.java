package com.xiaoguan.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * ClassName: ShortLinkGroupRespDTO
 * Package: com.xiaoguan.shortlink.admin.dto.resp
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/5 17:00
 * @Version 1.0
 */
@Data
public class ShortLinkGroupRespDTO {
    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名称
     */
    private String name;

    /**
     * 分组排序
     */
    private Integer sortOrder;
}
