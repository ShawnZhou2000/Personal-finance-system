package com.qlu.keshe.server;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qlu.keshe.domain.Pay;

/**
 * @author：TuoJun
 * @date：2020/06/12 13:24
 * Description：
 */
public interface PayService extends IService<Pay> {

    double selectTotalIncome(int userId);
}
