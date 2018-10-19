package com.sitp.tjvideo.controller;

import com.sitp.tjvideo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ls J
 * @date 2018/10/19 9:53 AM
 * 客户端注册登录等
 */
@Controller
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    private IUserService userService;


}
