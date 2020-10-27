package com.mall.distributedshop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.distributedshop.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author leo
 * @email 1064603765@qq.com
 * @date 2020-10-27 11:15:18
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

