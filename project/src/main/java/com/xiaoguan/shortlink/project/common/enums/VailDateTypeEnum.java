package com.xiaoguan.shortlink.project.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * ClassName: VailDateTypeEnum
 * Package: com.xiaoguan.shortlink.project.common.enums
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/7 8:24
 * @Version 1.0
 */
@RequiredArgsConstructor
public enum VailDateTypeEnum {

    /**
     * 永久有效期
     */
    PERMANENT(0),

    /**
     * 自定义有效期
     */
    CUSTOM(1);

    @Getter
    private final int type;
}
