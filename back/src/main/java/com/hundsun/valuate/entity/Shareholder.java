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
 * 股东信息
 */
public class Shareholder {

    //产品id
    private int cpid;

    //股东代码
    private String gddm;

    //1上交所/2深交所
    private String jysc;

    //账户类型 1普通/2信用
    private String zhlx;

}
