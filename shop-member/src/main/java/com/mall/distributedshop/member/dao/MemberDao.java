package com.mall.distributedshop.member.dao;

import com.mall.distributedshop.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author leo
 * @email 1064603765@qq.com
 * @date 2020-10-27 11:15:18
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
