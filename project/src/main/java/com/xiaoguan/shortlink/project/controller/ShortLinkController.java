package com.xiaoguan.shortlink.project.controller;

import com.xiaoguan.shortlink.project.common.convention.result.Result;
import com.xiaoguan.shortlink.project.common.convention.result.Results;
import com.xiaoguan.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.xiaoguan.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.xiaoguan.shortlink.project.service.ShortLinkService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/api/short-link/project/v1/create")
    public Result<ShortLinkCreateRespDTO> createRespDTOResult(@RequestBody ShortLinkCreateReqDTO requestParam){
        return Results.success(shortLinkService.createShortLink(requestParam));
    }
}
