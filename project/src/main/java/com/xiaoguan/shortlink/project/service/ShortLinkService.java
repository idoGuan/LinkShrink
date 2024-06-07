package com.xiaoguan.shortlink.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoguan.shortlink.project.dao.entity.ShortLinkDO;
import com.xiaoguan.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.xiaoguan.shortlink.project.dto.req.ShortLinkPageReqDTO;
import com.xiaoguan.shortlink.project.dto.req.ShortLinkUpdateReqDTO;
import com.xiaoguan.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.xiaoguan.shortlink.project.dto.resp.ShortLinkGroupCountQueryRespDTO;
import com.xiaoguan.shortlink.project.dto.resp.ShortLinkPageRespDTO;

import java.util.List;

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

    IPage<ShortLinkPageRespDTO> pageShortLink(ShortLinkPageReqDTO requestParam);

    List<ShortLinkGroupCountQueryRespDTO> listGroupShortLinkCount(List<String> requestParam);

    /**
     * 修改短链接
     *
     * @param requestParam 修改短链接请求参数
     */
    void updateShortLink(ShortLinkUpdateReqDTO requestParam);
}
