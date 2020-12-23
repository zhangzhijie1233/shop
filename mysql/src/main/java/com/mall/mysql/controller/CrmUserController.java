package com.mall.mysql.controller;

import com.mall.mysql.service.CrmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: Zhang ZhiJie
 * @Date: 2020/12/18 9:54
 */
@RestController
@RequestMapping("/api/user")
public class CrmUserController {

    @Autowired
    private CrmUserService crmUserService;

    @RequestMapping(value = "/selectAll")
    private List selectAll() {
        List list = crmUserService.selectAll();
        System.out.println(list);
        return list;
    }

    @RequestMapping(value = "/insert")
    private void insert() {
        crmUserService.insert();
    }
}
