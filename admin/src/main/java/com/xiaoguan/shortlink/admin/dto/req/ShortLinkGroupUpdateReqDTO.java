package com.xiaoguan.shortlink.admin.dto.req;

import lombok.Data;

/**
 * ClassName: ShortLinkGroupSaveReqDTO
 * Package: com.xiaoguan.shortlink.admin.dto.req
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/5 16:40
 * @Version 1.0
 */
@Data
public class ShortLinkGroupUpdateReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名
     */
    private String name;
}
