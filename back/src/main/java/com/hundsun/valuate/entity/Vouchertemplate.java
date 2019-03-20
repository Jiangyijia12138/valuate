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
 * 凭证模板表
 */
public class Vouchertemplate {

    //模板id
    private int mbid;

    //科目id
    private String kmid;

    //方向
    private String fx;

    //计算公式
    private String jsgs;

    //业务类别（10股票交易（股票100买入101股票卖出）
    private int ywlb;

}
