package com.mall.distributedshop.ware.dao;

import com.mall.distributedshop.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author leo
 * @email 1064603765@qq.com
 * @date 2020-10-27 12:22:49
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
