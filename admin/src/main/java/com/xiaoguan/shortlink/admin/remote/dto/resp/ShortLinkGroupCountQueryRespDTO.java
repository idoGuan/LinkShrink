package com.xiaoguan.shortlink.admin.remote.dto.resp;

import lombok.Data;

/**
 * ClassName: ShortLinkGroupCountQueryRespDTO
 * Package: com.xiaoguan.shortlink.admin.dto.resp
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/6 16:55
 * @Version 1.0
 */
@Data
public class ShortLinkGroupCountQueryRespDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 短链接数量
     */
    private Integer shortLinkCount;
}
