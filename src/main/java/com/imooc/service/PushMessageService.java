package com.imooc.service;

import com.imooc.dto.OrderDto;

/**
 * 微信模版消息推送
 * @author youyusong
 * @date 2018/10/12
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDto orderDTO);

}
