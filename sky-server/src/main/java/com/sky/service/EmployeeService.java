package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     *
     * @param employeeDTO 员工dto
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 页面查询
     *
     * @param employeePageQueryDTO 员工页面查询dto
     * @return {@link PageResult}
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);


    /**
     * 启动或停止账号
     *
     * @param status 地位
     * @param id     身份证件
     */
    void startOrStop(Integer status, Long id);

    /**
     * 按id获取
     *
     * @param id
     * @return {@link Employee}
     */
    Employee getById(Long id);


    /**
     * 编辑员工信息
     *
     * @param employeeDTO 员工dto
     */
    void update(EmployeeDTO employeeDTO);
}
