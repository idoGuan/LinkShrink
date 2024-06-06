package com.xiaoguan.shortlink.admin.controller;

import com.xiaoguan.shortlink.admin.common.convention.result.Result;
import com.xiaoguan.shortlink.admin.common.convention.result.Results;
import com.xiaoguan.shortlink.admin.dto.req.UserLoginReqDTO;
import com.xiaoguan.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.xiaoguan.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.xiaoguan.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.xiaoguan.shortlink.admin.dto.resp.UserRespDTO;
import com.xiaoguan.shortlink.admin.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/api/short-link/admin/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username){

        return Results.success(userService.getUserByUsername(username));

    }

    @GetMapping("/api/short-link/admin/v1/user/has-username")
    public Result<Boolean> hasUsername(@RequestParam("username") String username){
        return Results.success(userService.hasUsername(username));
    }

    /**
     * 注册用户
     */
    @PostMapping("/api/short-link/admin/v1/user")
    public Result<Void> register(@RequestBody UserRegisterReqDTO userRegisterReqDTO){
        userService.register(userRegisterReqDTO);
        return Results.success();
    }

    /**
     * 修改用户信息
     */
    @PutMapping("/api/short-link/admin/v1/user")
    public Result<Void> update(@RequestBody UserUpdateReqDTO UserUpdateReqDTO){
        userService.update(UserUpdateReqDTO);
        return Results.success();
    }

    @PostMapping("/api/short-link/v1/admin/user/login")
    public Result<UserLoginRespDTO> login(@RequestBody UserLoginReqDTO userLoginReqDTO){
        UserLoginRespDTO userLoginRespDTO = userService.login(userLoginReqDTO);
        return Results.success(userLoginRespDTO);
    }

    @GetMapping("/api/short-link/v1/admin/user/check-login")
    public Result<Boolean> login(@RequestParam("username") String username, @RequestParam("token") String token){
        return Results.success(userService.checkLogin(username, token));
    }

    @DeleteMapping("/api/short-link/admin/v1/user/logout")
    public Result<Void> logout(@RequestParam("username") String username, @RequestParam("token") String token){
        userService.logout(username, token);
        return Results.success();
    }
}
