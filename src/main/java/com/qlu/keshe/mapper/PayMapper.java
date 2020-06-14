package com.qlu.keshe.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qlu.keshe.domain.Pay;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author：TuoJun
 * @date：2020/06/12 13:21
 * Description：
 */
public interface PayMapper extends BaseMapper<Pay> {

    @Select("SELECT sum(money) FROM pay WHERE user_id = #{userId}")
    double selectTotalIncome(@Param("userId") int userId);
}
