package com.qlu.keshe.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qlu.keshe.domain.Income;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author：TuoJun
 * @date：2020/06/12 13:21
 * Description：
 */
public interface IncomeMapper extends BaseMapper<Income> {

    @Select("SELECT sum(money) FROM income WHERE user_id = #{userId}")
    double selectTotalIncome(@Param("userId") int userId);
}
