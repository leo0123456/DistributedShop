package com.mall.distributedshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.distributedshop.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author leo
 * @email 1064603765@qq.com
 * @date 2020-10-26 16:01:22
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

