package com.atguigu.gulimall.menber.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.menber.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author aidem
 * @email aidem@gmail.com
 * @date 2021-10-20 21:10:01
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

