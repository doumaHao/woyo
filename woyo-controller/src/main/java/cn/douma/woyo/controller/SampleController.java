package cn.douma.woyo.controller;

import cn.douma.woyo.db.entity.UserInfo;
import cn.douma.woyo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    List<UserInfo> home() {
        return userService.list();
    }
}