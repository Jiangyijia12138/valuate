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
 * 银行账户
 */
public class Account {

    //账户id
    private int zhid;

    //账户类型:1普通/2托管
    private String zhlx;

    //账户名称
    private String zhmc;

    //账户余额
    private double zhye;

    //开户行
    private String khh;

    //开户日期
    private int khrq;

    //原币币种
    private String ybbz;

    //账户状态:1激活/0销户
    private String zhzt;

    //产品id
    private int cpid;
}
