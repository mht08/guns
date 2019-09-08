package com.stylefeng.guns.modular.system.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.modular.system.model.Relation;

/**
 * <p>
  * 角色和菜单关联表 Mapper 接口
 * </p>
 *
 * @author stylefeng
 * @since 2017-07-11
 */
@Mapper
public interface RelationMapper extends BaseMapper<Relation> {

}