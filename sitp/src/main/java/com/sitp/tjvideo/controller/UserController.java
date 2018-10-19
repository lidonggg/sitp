package com.sitp.tjvideo.controller;

import com.sitp.tjvideo.entity.User;
import com.sitp.tjvideo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ls J
 * @date 2018/10/9 11:47 AM
 */
@Controller
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/getuser")
    public User getUser() {
        User user = new User();
        user.setUserName("test");
        user.setAge(22);
        user.setPassword("123456lidong");
        userService.save(user);
        return user;
    }


}
