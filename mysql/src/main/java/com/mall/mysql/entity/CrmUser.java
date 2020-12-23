package com.mall.mysql.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description:
 * @Author: Zhang ZhiJie
 * @Date: 2020/12/18 10:40
 */
@Data
@TableName("crm_user")
public class CrmUser {

    @TableField("id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField("user_name")
    private String userName;

    @TableField("pass_word")
    private String passWord;

    @TableField("mobile")
    private String mobile;

    @TableField("address")
    private String address;
}
