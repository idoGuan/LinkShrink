package com.xiaoguan.shortlink.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoguan.shortlink.project.dao.entity.LinkStatsTodayDO;
import com.xiaoguan.shortlink.project.dao.mapper.LinkStatsTodayMapper;
import com.xiaoguan.shortlink.project.service.LinkStatsTodayService;
import org.springframework.stereotype.Service;

/**
 * 短链接今日统计接口实现层
 */
@Service
public class LinkStatsTodayServiceImpl extends ServiceImpl<LinkStatsTodayMapper, LinkStatsTodayDO> implements LinkStatsTodayService {
}
