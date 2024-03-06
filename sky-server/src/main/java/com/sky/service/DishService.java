package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

import java.util.List;

public interface DishService {

    /**
     * 新增菜品
     *
     * @param dishDTO 菜品
     */
    public void saveWithFlavor(DishDTO dishDTO);

    /**
     * 页面查询
     *
     * @param dishPageQueryDTO 菜页查询dto
     * @return {@link PageResult}
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void deleteBatch(List<Long> ids);
}
