package com.xiaoguan.shortlink.project.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoguan.shortlink.project.common.convention.result.Result;
import com.xiaoguan.shortlink.project.common.convention.result.Results;
import com.xiaoguan.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.xiaoguan.shortlink.project.dto.req.ShortLinkPageReqDTO;
import com.xiaoguan.shortlink.project.dto.req.ShortLinkUpdateReqDTO;
import com.xiaoguan.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.xiaoguan.shortlink.project.dto.resp.ShortLinkGroupCountQueryRespDTO;
import com.xiaoguan.shortlink.project.dto.resp.ShortLinkPageRespDTO;
import com.xiaoguan.shortlink.project.service.ShortLinkService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: ShortLinkController
 * Package: com.xiaoguan.shortlink.project.controller
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/6 9:34
 * @Version 1.0
 */
@RestController
public class ShortLinkController {

    @Resource
    private ShortLinkService shortLinkService;

    @PostMapping("/api/short-link/v1/create")
    public Result<ShortLinkCreateRespDTO> createRespDTOResult(@RequestBody ShortLinkCreateReqDTO requestParam){
        return Results.success(shortLinkService.createShortLink(requestParam));
    }

    /**
     * 分页查询短链接
     */
    @GetMapping("/api/short-link/v1/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkPageReqDTO requestParam) {
        return Results.success(shortLinkService.pageShortLink(requestParam));
    }

    /**
     * 查询短链接分组内数量
     */
    @GetMapping("/api/short-link/v1/count")
    public Result<List<ShortLinkGroupCountQueryRespDTO>> listGroupShortLinkCount(@RequestParam("requestParam") List<String> requestParam) {
        return Results.success(shortLinkService.listGroupShortLinkCount(requestParam));
    }

    /**
     * 修改短链接
     */
    @PostMapping("/api/short-link/v1/update")
    public Result<Void> updateShortLink(@RequestBody ShortLinkUpdateReqDTO requestParam) {
        shortLinkService.updateShortLink(requestParam);
        return Results.success();
    }
}
