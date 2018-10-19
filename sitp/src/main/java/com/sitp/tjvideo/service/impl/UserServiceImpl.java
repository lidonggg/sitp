package com.sitp.tjvideo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sitp.tjvideo.entity.User;
import com.sitp.tjvideo.mapper.UserMapper;
import com.sitp.tjvideo.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author Ls J
 * @date 2018/10/9 11:53 AM
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
