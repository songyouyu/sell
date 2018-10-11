package com.imooc.service;

import com.imooc.dto.OrderDto;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;

/**
 * 支付
 * @author youyusong
 * @date 2018/10/11
 */
public interface PayService {

    /**
     * 创建订单
     * @param orderDto
     */
    PayResponse create(OrderDto orderDto);

    /**
     * 微信异步通知
     * @param notifyData
     */
    PayResponse notify(String notifyData);

    /**
     * 退款
     * @param orderDTO
     * @return
     */
    RefundResponse refund(OrderDto orderDTO);
}
