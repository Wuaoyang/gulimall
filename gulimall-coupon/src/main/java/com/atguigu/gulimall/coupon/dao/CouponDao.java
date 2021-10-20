package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author aidem
 * @email aidem@gmail.com
 * @date 2021-10-20 20:41:11
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
