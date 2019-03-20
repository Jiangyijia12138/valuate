package com.hundsun.valuate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
/**
 * 证券基本信息
 */
public class Baseinfo {

    //证券代码
    private String zqdm;

    //证券名称
    private String zqmc;

    //估值增值
    private double gzzz;

    //累计成本
    private double ljcb;

    //交易市场
    private String jysc;

    //起息日
    private Integer qxr;

    //到期日
    private Integer dqr;

    //证券类别
    private int zqlb;

    //持仓数量
    private double ccsl;

    //流通状态:0流通/1新股
    private String ltzt;

    //计息公式
    private String jxgs;

    //面值
    private double mz;

    //付息方式
    private String fxfs;

    //年利率
    private double pmll;

    //产品id
    private int cpid;
}
