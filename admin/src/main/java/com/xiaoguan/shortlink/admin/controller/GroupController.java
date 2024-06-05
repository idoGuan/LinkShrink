package com.xiaoguan.shortlink.admin.controller;

import com.xiaoguan.shortlink.admin.common.convention.result.Result;
import com.xiaoguan.shortlink.admin.common.convention.result.Results;
import com.xiaoguan.shortlink.admin.dto.req.ShortLinkGroupSaveReqDTO;
import com.xiaoguan.shortlink.admin.service.GroupService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: GroupController
 * Package: com.xiaoguan.shortlink.admin.controller
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/5 12:58
 * @Version 1.0
 */
@RestController
public class GroupController {

    @Resource
    private GroupService groupService;

    @PostMapping("/api/short-link/v1/group")
    public Result<Void> save(@RequestBody ShortLinkGroupSaveReqDTO shortLinkGroupSaveReqDTO){
        groupService.saveGroup(shortLinkGroupSaveReqDTO.getName());
        return Results.success();
    }
}
