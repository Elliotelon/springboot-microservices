package com.elliot.employeeservice.service;

import com.elliot.employeeservice.dto.APIResponseDto;
import com.elliot.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);

}
