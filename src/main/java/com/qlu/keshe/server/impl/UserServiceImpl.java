package com.qlu.keshe.server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qlu.keshe.domain.User;
import com.qlu.keshe.mapper.UserMapper;
import com.qlu.keshe.server.UserService;
import org.springframework.stereotype.Service;

/**
 * @author：TuoJun
 * @date：2020/06/12 13:25
 * Description：
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
