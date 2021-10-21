package com.atguigu.gulimall.menber.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * xxxxxxxxxxxx
 *
 * @author aosun_wu
 * @date 2021-10-21 21:26
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

	@RequestMapping("/coupon/coupon/member/list")
	public R membercoupons();

}
