package com.xiaoguan.shortlink.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoguan.shortlink.project.dao.entity.ShortLinkDO;
import com.xiaoguan.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.xiaoguan.shortlink.project.dto.resp.ShortLinkCreateRespDTO;

/**
 * ClassName: ShortLinkService
 * Package: com.xiaoguan.shortlink.project.service
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/6 9:29
 * @Version 1.0
 */
public interface ShortLinkService extends IService<ShortLinkDO> {
    ShortLinkCreateRespDTO createShortLink(ShortLinkCreateReqDTO shortLinkCreateReqDTO);
}
