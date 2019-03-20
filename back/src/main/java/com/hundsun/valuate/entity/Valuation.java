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
 * 估值模板表
 */
public class Valuation {

    //模板id
    private int mbid;

    //科目id
    private Integer kmid;

    //计算公式
    private String jsgs;

}
