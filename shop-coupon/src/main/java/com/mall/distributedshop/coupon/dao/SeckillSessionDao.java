package com.mall.distributedshop.coupon.dao;

import com.mall.distributedshop.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author leo
 * @email 1064603765@qq.com
 * @date 2020-10-27 11:00:12
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
