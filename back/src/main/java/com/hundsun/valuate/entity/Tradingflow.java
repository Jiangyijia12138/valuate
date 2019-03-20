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
 * 交易流水表
 */
public class Tradingflow {

    //流水号
    private int lsh;

    //证券id
    private String zqid;

    //交易日期
    private int jyrq;

    //业务类别
    private int ywlb;

    //成交数量
    private double cjsl;

    //成交价格
    private double cjjg;

    //成交金额
    private double cjje;

    //股东代码
    private String gddm;

    //印花税
    private double yhs;

    //经手费
    private double jsf;

    //过户费
    private double ghf;

    //证管费
    private double zgf;

    //佣金
    private double yj;

    //税前利息
    private double sqlx;

    //税后利息
    private double shlx;

    //清算日期
    private Integer qsrq;

    //券商代码
    private String qsdm;

    //产品id
    private int cpid;

    //记账日期
    private int jzrq;

}
