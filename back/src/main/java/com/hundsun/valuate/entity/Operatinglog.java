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
 * 操作日志表
 */
public class Operatinglog {

    //日志id
    private int rzid;

    //用户id
    private int yhid;

    //操作时间
    private double czsj;

    //操作日期
    private int czrq;

    //操作
    private String cz;
}
