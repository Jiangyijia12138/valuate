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
 * 产品信息表
 */
public class Fund {

    //产品id
    private int cpid;

    //产品名称
    private String cpmc;

    //产品状态:1、有效/0、无效
    private String cpzt;

    //初始份额
    private double csfe;

    //初始金额
    private double csje;

}
