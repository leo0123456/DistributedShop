package com.mall.distributedshop.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.distributedshop.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author leo
 * @email 1064603765@qq.com
 * @date 2020-10-27 12:16:13
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

