package com.xiaoguan.shortlink.admin.remote.dto.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * ClassName: ShortLinkUpdateReqDTO
 * Package: com.xiaoguan.shortlink.project.dto.req
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/7 8:34
 * @Version 1.0
 */
@Data
public class ShortLinkUpdateReqDTO {

    /**
     * 原始链接
     */
    private String originUrl;

    /**
     * 完整短链接
     */
    private String fullShortUrl;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 有效期类型 0：永久有效 1：自定义
     */
    private Integer validDateType;

    /**
     * 有效期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date validDate;

    /**
     * 描述
     */
    private String describe;
}
