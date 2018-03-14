package com.juzi.wang.common.base;

import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * Created by Juzi on 2018-03-14.
 */
public interface BaseService<T>{
    /**
     * 插入一条数据
     * @param model
     */
    void save(T model);

    /**
     * 批量插入数据
     * @param models
     */
    void save(List<T> models);

    /**
     * 根据id删除数据
     * @param id
     */
    void deleteById(Object id);

    /**
     * 批量删除数据
     * @param ids
     */
    void deleteByIds(String ids);

    /**
     * 更新数据
     * @param model
     */
    void update(T model);
    /**
     * 批量更新数据
     * @param model
     */
    void update(List<T> model);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    T findById(Object id);

    /**
     * 查询所有数据
     * @return
     */
    List<T> queryAll();

    /**
     * 根据条件查询数据
     * @param condition
     * @return
     */
    List<T> queryByCondition(Condition condition);

    /**
     *
     * @param example
     * @return
     */
    List<T> queryByExample(Object example);
}
