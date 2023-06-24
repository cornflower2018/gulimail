package com.atguigu.gulimail.coupon.dao;

import com.atguigu.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author cuisanxing
 * @email 1286519253@qq.com
 * @date 2023-06-24 21:26:37
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}