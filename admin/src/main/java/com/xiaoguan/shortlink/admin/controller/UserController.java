package com.xiaoguan.shortlink.admin.controller;

import com.xiaoguan.shortlink.admin.common.convention.result.Result;
import com.xiaoguan.shortlink.admin.common.convention.result.Results;
import com.xiaoguan.shortlink.admin.dto.resp.UserRespDTO;
import com.xiaoguan.shortlink.admin.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UserController
 * Package: com.xiaoguan.shortlink.admin.controller
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/4 16:00
 * @Version 1.0
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username){

        return Results.success(userService.getUserByUsername(username));

    }
}
