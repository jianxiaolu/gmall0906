package com.atguigu.gmall.user.controller;

import bean.UserInfo;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

import java.util.List;

/**
 * Created by admin on 2019/1/8.
 */

@RestController
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("list")
    @ResponseBody
    public List<UserInfo> userList(){

        List<UserInfo> userInfos = userService.getUserList();
        return userInfos;
    }


}
