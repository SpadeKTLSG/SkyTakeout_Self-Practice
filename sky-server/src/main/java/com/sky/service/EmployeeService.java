package com.sky.service;

import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     *
     * @param employeeLoginDTO 员工登录DTO
     * @return 员工实体对象
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}
