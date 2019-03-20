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
 * 证券行情表
 */
public class Priceinfo {

    //证券代码
    private String zqdm;

    //昨日收盘价
    private double zrspj;

    //今日收盘价
    private double jrspj;

    //今日开盘价
    private double jrkpj;

    //行情日期
    private int hqrq;

}
