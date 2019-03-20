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
 * 账套表
 */
public class Book {

    //账套编号
    private int ztbh;

    //账套名称
    private String ztmc;

    //产品编号
    private int cpbh;

    //建账日期
    private int jzrq;

    //结束日期
    private int jsrq;

}
