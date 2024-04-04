package com.submerge.subapi.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.submerge.subapi.mapper.DailyCheckInMapper;
import com.submerge.subapi.model.entity.DailyCheckIn;
import com.submerge.subapi.service.DailyCheckInService;
import org.springframework.stereotype.Service;

/**
 * @Author: Submerge
 * @Date: 2023/08/31 11:47:57
 * @Version: 1.0
 * @Description: 每日签到服务impl
 */
@Service
public class DailyCheckInServiceImpl extends ServiceImpl<DailyCheckInMapper, DailyCheckIn>
        implements DailyCheckInService {

}




