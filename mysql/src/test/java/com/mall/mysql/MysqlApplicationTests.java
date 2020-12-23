package com.mall.mysql;

import com.mall.mysql.service.CrmUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MysqlApplicationTests {
    
    @Autowired
    private CrmUserService crmUserService;

    @Test
    void contextLoads() {
        List list = crmUserService.selectAll();
        System.out.println(list);
    }

}
