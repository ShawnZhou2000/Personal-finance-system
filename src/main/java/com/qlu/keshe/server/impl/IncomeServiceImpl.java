package com.qlu.keshe.server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qlu.keshe.domain.Income;
import com.qlu.keshe.mapper.IncomeMapper;
import com.qlu.keshe.server.IncomeService;
import org.springframework.stereotype.Service;

/**
 * @author：TuoJun
 * @date：2020/06/12 13:25
 * Description：
 */
@Service
public class IncomeServiceImpl extends ServiceImpl<IncomeMapper, Income> implements IncomeService {
    @Override
    public double selectTotalIncome(int userId) {
        return this.baseMapper.selectTotalIncome(userId);
    }
}
