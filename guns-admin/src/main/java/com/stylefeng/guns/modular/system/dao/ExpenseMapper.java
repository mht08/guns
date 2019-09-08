package com.stylefeng.guns.modular.system.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.modular.system.model.Expense;

/**
 * <p>
  * 报销表 Mapper 接口
 * </p>
 *
 * @author stylefeng
 * @since 2017-12-04
 */
@Mapper
public interface ExpenseMapper extends BaseMapper<Expense> {

}