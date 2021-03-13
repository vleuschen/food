package com.imooc.food.dto;

import com.imooc.food.enummeration.OrderStatusEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class OrderMessageDto {

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 订单状态
     */
    private OrderStatusEnum orderStatus;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 骑手ID
     */
    private Integer deliverymanId;

    /**
     * 产品ID
     */
    private Integer productId;

    /**
     * 用户id
     */
    private Integer accountId;

    /**
     * 结算id
     */
    private Integer settlementId;

    /**
     * 积分结算ID
     */
    private Integer rewardId;

    /**
     * 积分奖励数量
     */
    private Integer rewardAmount;

    /**
     * 确认
     */
    private Boolean confirmed;

}
