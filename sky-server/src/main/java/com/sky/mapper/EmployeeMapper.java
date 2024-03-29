package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /**
     * 插入员工数据
     *
     * @param employee 员工
     */
    @Select("insert into employee (username, name, password, phone, sex, id_number, status, create_time, update_time, create_user, update_user)" +
            "values (#{username},#{name},#{password},#{phone},#{sex},#{idNumber},#{status},#{createTime},#{updateTime},#{createUser},#{updateUser})")
    @AutoFill(value = OperationType.INSERT)
    void insert(Employee employee);


    /**
     * 页面查询
     *
     * @param employeePageQueryDTO 员工页面查询dto
     * @return {@link Page}<{@link Employee}>
     */
    Page<Employee> pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 跟新
     *
     * @param employee 受雇者
     */
    @AutoFill(value = OperationType.UPDATE)
    void update(Employee employee);


    /**
     * 按id获取
     *
     * @param id
     * @return {@link Employee}
     */
    @Select("select * from employee where id = #{id}")
    Employee getById(Long id);
}
