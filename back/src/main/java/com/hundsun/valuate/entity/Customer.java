package com.hundsun.valuate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
/**
 * 用户信息
 */
public class Customer {

    //用户id
    private int yhid;

    //用户名
    private String yhm;

    //密码
    private String mm;

    //联系电话
    private Integer lxdh;

    //邮箱
    private String yx;

    //是否有效:1有效/0无效
    private int sfyx;

    //权限:0普通/1高级用户/2管理员
    private int qx;
}
