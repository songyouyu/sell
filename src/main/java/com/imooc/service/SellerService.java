package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * 卖家端
 * @author youyusong
 * @date 2018/10/12
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);

}
