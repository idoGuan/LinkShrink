package com.xiaoguan.shortlink.project.dto.req;

import lombok.Data;

import java.util.Date;

/**
 * ClassName: ShortLinkCreateReqDTO
 * Package: com.xiaoguan.shortlink.project.dto.req
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/6 9:48
 * @Version 1.0
 */
@Data
public class ShortLinkCreateReqDTO {

    /**
     * 域名
     */
    private String domain;

    /**
     * 原始链接
     */
    private String originUrl;


    /**
     * 分组标识
     */
    private String gid;

    /**
     * 创建类型 0：接口创建 1：控制台创建
     */
    private int createdType;

    /**
     * 有效期类型 0：永久有效 1：自定义
     */
    private int validDateType;

    /**
     * 有效期
     */
    private Date validDate;

    /**
     * 描述
     */
    private String describe;
}
