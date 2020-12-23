package com.mall.mysql.job;

import com.mall.mysql.service.CrmUserService;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Zhang ZhiJie
 * @Date: 2020/12/21 16:07
 */
@JobHandler(value = "insertUserHandler")
@Component
public class CrmUserJob extends IJobHandler {

    @Autowired
    private CrmUserService crmUserService;

    @Override
    public ReturnT<String> execute(String s) throws Exception {
        crmUserService.insert();
        System.out.println("========添加用户成功啦！！！");
        return SUCCESS;
    }
}
