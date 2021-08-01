package com.berlin.mapper;

import com.berlin.bean.Emp;

import java.util.List;

/**
 * @author Berlin
 * @date 2021/3/1 9:08
 * @description
 */
public interface EmpDeptMapper {

    List<Emp> getAllEmp();

    Emp getEmpStep(String eid);

}
