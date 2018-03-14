package com.juzi.wang.common.base;

import tk.mybatis.mapper.common.*;
import tk.mybatis.mapper.common.base.insert.InsertMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * Created by Juzi on 2018/3/14.
 */
public interface BaseMapper<T> extends Mapper<T>, tk.mybatis.mapper.common.BaseMapper<T>,
        ConditionMapper<T>,
        IdsMapper<T>,
        InsertMapper<T>,
        InsertListMapper,
        ExampleMapper<T> {
}
