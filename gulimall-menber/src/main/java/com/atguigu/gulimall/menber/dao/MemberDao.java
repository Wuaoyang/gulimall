package com.atguigu.gulimall.menber.dao;

import com.atguigu.gulimall.menber.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author aidem
 * @email aidem@gmail.com
 * @date 2021-10-20 21:10:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
