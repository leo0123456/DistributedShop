package com.mall.distributedshop.order.dao;

import com.mall.distributedshop.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author leo
 * @email 1064603765@qq.com
 * @date 2020-10-27 12:16:13
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
