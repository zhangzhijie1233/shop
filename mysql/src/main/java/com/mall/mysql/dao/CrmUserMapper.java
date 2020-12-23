package com.mall.mysql.dao;/**
 * @Description:
 * @Author: Zhang ZhiJie
 * @Date: 2020/12/18 10:35
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.mysql.entity.CrmUser;
import org.apache.ibatis.annotations.Mapper;

/**
 *@Author ZHANGZHIJIE
 *@Date 2020/12/18 10:35
 */
@Mapper
public interface CrmUserMapper extends BaseMapper<CrmUser> {
}
