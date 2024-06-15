package com.xiaoguan.shortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: ShortLinkAdminApplication
 * Package: com.xiaoguan.shortlink.admin
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/3 8:13
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.xiaoguan.shortlink.admin.dao.mapper")
@EnableDiscoveryClient
@EnableFeignClients("com.xiaoguan.shortlink.admin.remote")
public class ShortLinkAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortLinkAdminApplication.class, args);
    }
}
