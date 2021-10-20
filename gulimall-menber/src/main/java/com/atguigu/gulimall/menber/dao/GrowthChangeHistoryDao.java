package com.atguigu.gulimall.menber.dao;

import com.atguigu.gulimall.menber.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author aidem
 * @email aidem@gmail.com
 * @date 2021-10-20 21:10:01
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
