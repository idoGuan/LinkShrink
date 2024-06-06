package com.xiaoguan.shortlink.project.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: ShortLinkCreateRespDTO
 * Package: com.xiaoguan.shortlink.project.dto.resp
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/6 9:52
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShortLinkCreateRespDTO {

    /**
     * 分组信息
     */
    private String gid;

    /**
     * 完整短链接
     */
    private String fullShortUrl;

    /**
     * 原始链接
     */
    private String originUrl;

    /**
     * 点击量
     */
    private Integer clickNum;

}
