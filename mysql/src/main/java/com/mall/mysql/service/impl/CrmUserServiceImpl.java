package com.mall.mysql.service.impl;/**
 * @Description:
 * @Author: Zhang ZhiJie
 * @Date: 2020/12/18 9:47
 */

import cn.binarywang.tools.generator.ChineseAddressGenerator;
import cn.binarywang.tools.generator.ChineseMobileNumberGenerator;
import cn.binarywang.tools.generator.ChineseNameGenerator;
import cn.hutool.core.util.RandomUtil;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.mysql.dao.CrmUserMapper;
import com.mall.mysql.entity.CrmUser;
import com.mall.mysql.service.CrmUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *@Author ZHANGZHIJIE
 *@Date 2020/12/18 9:47
 */
@Service
public class CrmUserServiceImpl implements CrmUserService {

    @Resource
    private CrmUserMapper crmUserMapper;

    @Override
//    @DS("slave_1")
    public List selectAll() {
        QueryWrapper<CrmUser> condition = new QueryWrapper<CrmUser>() ;
        return crmUserMapper.selectList(condition);
    }

    @Override
    public int insert() {
        CrmUser crmUser = new CrmUser();
        crmUser.setUserName(ChineseNameGenerator.getInstance().generate());
        crmUser.setMobile(ChineseMobileNumberGenerator.getInstance().generate());
        crmUser.setAddress(ChineseAddressGenerator.getInstance().generate());
        crmUser.setPassWord(RandomUtil.randomNumbers(10));
        return crmUserMapper.insert(crmUser);
    }

    public static void main(String[] args) {
        System.out.println("姓名："+ChineseNameGenerator.getInstance().generate());
        System.out.println("手机号："+ChineseMobileNumberGenerator.getInstance().generate());
        System.out.println("地址："+ChineseAddressGenerator.getInstance().generate());
    }
}
