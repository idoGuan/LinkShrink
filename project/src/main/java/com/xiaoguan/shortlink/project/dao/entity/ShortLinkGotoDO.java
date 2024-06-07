package com.xiaoguan.shortlink.project.dao.entity;

/**
 * ClassName: ShortLinkGotoDO
 * Package: com.xiaoguan.shortlink.project.dao.entity
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/7 9:43
 * @Version 1.0
 */

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 短链接跳转实体
 */
@Data
@Builder
@TableName("t_link_goto")
@NoArgsConstructor
@AllArgsConstructor
public class ShortLinkGotoDO {

    /**
     * ID
     */
    private Long id;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 完整短链接
     */
    private String fullShortUrl;
}
