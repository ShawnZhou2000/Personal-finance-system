package com.qlu.keshe.server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qlu.keshe.domain.Pay;
import com.qlu.keshe.mapper.PayMapper;
import com.qlu.keshe.server.PayService;
import org.springframework.stereotype.Service;

/**
 * @author：TuoJun
 * @date：2020/06/12 13:25
 * Description：
 */
@Service
public class PayServiceImpl extends ServiceImpl<PayMapper, Pay> implements PayService {
    @Override
    public double selectTotalIncome(int userId) {
        return this.baseMapper.selectTotalIncome(userId);
    }
}
