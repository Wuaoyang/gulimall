package com.atguigu.gulimall.menber.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.menber.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author aidem
 * @email aidem@gmail.com
 * @date 2021-10-20 21:10:01
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

