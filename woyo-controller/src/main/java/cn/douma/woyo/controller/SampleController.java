package cn.douma.woyo.controller;

import cn.douma.woyo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/update")
    @ResponseBody
    public void update() {
        addressService.listForIdno("123", 5);
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
    }

}