package com.atguigu.cloud.entities;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Zhanye
 * @since 2024/03/23 12:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayDTO implements Serializable
{
    private Integer id;
    //支付流水号
    private String payNo;
    //订单流水号
    private String orderNo;
    //用户账号ID
    private Integer userId;
    //交易金额
    private BigDecimal amount;
}
