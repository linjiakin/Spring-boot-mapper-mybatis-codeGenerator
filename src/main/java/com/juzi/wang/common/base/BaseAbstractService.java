package com.juzi.wang.common.base;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 */
public abstract class BaseAbstractService<T> implements BaseService<T> {

    @Autowired
    protected BaseMapper<T> baseMapper;

    /**
     * 当前泛型真实类型的Class
     */
    private Class<T> modelClass;

    public BaseAbstractService() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }

    /**
     * 插入一条数据
     * @param model
     */
    public void save(T model) {
        baseMapper.insert(model);
    }

    /**
     * 批量插入数据
     * @param models
     */
    public void save(List<T> models) {
        baseMapper.insertList(models);
    }

    /**
     * 根据id删除数据
     * @param id
     */
    public void deleteById(Object id) {
        baseMapper.deleteByPrimaryKey(id);
    }

    /**
     * 批量删除数据
     * @param ids
     */
    public void deleteByIds(String ids) {
        baseMapper.deleteByIds(ids);
    }

    /**
     * 更新数据
     * @param model
     */
    public void update(T model) {
        baseMapper.updateByPrimaryKeySelective(model);
    }
    /**
     * 批量更新数据
     * @param models
     */
    public void update(List<T> models) {
        for (T obj: models) {
            baseMapper.updateByPrimaryKeySelective(obj);
        }
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public T findById(Object id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询所有数据
     * @return
     */
    public List<T> queryAll() {
        return baseMapper.selectAll();
    }

    /**
     * 根据条件查询数据
     * @param condition
     * @return
     */
    public List<T> queryByCondition(Condition condition) {
        return baseMapper.selectByCondition(condition);
    }

    /**
     *
     * @param example
     * @return
     */
    public List<T> queryByExample(Object example) {
        return baseMapper.selectByExample(example);
    }

}
