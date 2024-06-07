package com.xiaoguan.shortlink.project.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoguan.shortlink.project.common.convention.result.Result;
import com.xiaoguan.shortlink.project.common.convention.result.Results;
import com.xiaoguan.shortlink.project.dto.req.RecycleBinRecoverReqDTO;
import com.xiaoguan.shortlink.project.dto.req.RecycleBinSaveReqDTO;
import com.xiaoguan.shortlink.project.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.xiaoguan.shortlink.project.dto.resp.ShortLinkPageRespDTO;
import com.xiaoguan.shortlink.project.service.RecycleBinService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: RecycleBinController
 * Package: com.xiaoguan.shortlink.project.controller
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/7 16:42
 * @Version 1.0
 */
@RestController
public class RecycleBinController {

    @Resource
    private RecycleBinService recycleBinService;

    /**
     * 保存回收站
     */
    @PostMapping("/api/short-link/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody RecycleBinSaveReqDTO requestParam) {
        recycleBinService.saveRecycleBin(requestParam);
        return Results.success();
    }

    /**
     * 分页查询回收站短链接
     */
    @GetMapping("/api/short-link/v1/recycle-bin/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkRecycleBinPageReqDTO requestParam) {
        return Results.success(recycleBinService.pageShortLink(requestParam));
    }

    /**
     * 恢复短链接
     */
    @PostMapping("/api/short-link/v1/recycle-bin/recover")
    public Result<Void> recoverRecycleBin(@RequestBody RecycleBinRecoverReqDTO requestParam) {
        recycleBinService.recoverRecycleBin(requestParam);
        return Results.success();
    }

}
