package com.hundsun.valuate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
/**
 * 凭证表
 */
public class Certificateinfo {

    //凭证id
    private int pzid;

    //凭证号
    private int pzh;

    //凭证日期
    private int pzrq;

    //科目id
    private int kmid;

    //摘要
    private String zy;

    //金额
    private double je;

    //借贷方向
    private int jdfx;

    //流水号
    private int lsh;

    //产品id
    private int cpid;

    //记账时间
    private Timestamp jzsj;

}
