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
 *席位表
 */
public class Seat {

    //产品id
    private int cpid;

    //席位代码
    private String xwdm;

    //交易市场 1、上交所/2、深交所
    private String jysc;

    //券商代码
    private String qsdm;

}
