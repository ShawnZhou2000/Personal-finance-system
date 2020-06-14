package com.qlu.keshe.server;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qlu.keshe.domain.Income;

/**
 * @author：TuoJun
 * @date：2020/06/12 13:24
 * Description：
 */
public interface IncomeService extends IService<Income> {

    double selectTotalIncome(int userId);
}
