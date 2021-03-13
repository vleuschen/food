package com.imooc.food.enummeration;

public enum OrderStatusEnum {

    /**
     * 创建中
     */
    ORDER_CREATING,
    /**
     * RESTAURANT
     */
    RESTAURANT_CONFIRMED,
    /**
     * 骑手确认
     */
    DELIVERYMAN_CONFIRM,
    /**
     * 已结算
     */
    SETTLEMENT_CONFIRMED,
    /**
     * 订单已创建
     */
    ORDER_CREATED,
    /**
     * 订单创建失败
     */
    FAILED;
}
