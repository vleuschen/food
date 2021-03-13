package com.imooc.food.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderCreateVo {

    /**
     * 用户Id
     */
    private Integer accountId;

    /**
     * 地址
     */
    private String address;

    /**
     * 产品Id
     */
    private Integer productId;


}
