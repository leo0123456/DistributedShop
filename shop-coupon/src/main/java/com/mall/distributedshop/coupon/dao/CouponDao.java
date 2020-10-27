package com.mall.distributedshop.coupon.dao;

import com.mall.distributedshop.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author leo
 * @email 1064603765@qq.com
 * @date 2020-10-27 11:00:12
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
