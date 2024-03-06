package com.sky.service;

import com.sky.dto.DishDTO;

public interface DishService {

    /**
     * 新增菜品
     *
     * @param dishDTO 菜品
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
