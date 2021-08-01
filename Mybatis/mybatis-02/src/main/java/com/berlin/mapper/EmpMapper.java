package com.berlin.mapper;

import com.berlin.bean.Emp;
import org.apache.ibatis.annotations.MapKey;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Berlin
 * @date 2021/1/26 13:30
 * @description
 */
public interface EmpMapper {

    // 根据eid查询一个信息
    Emp getEmpByEid(String eid);

    // 获取所有的员工信息
    List<Emp> getAllEmp();

    // 添加员工信息
    void addEmp(Emp emp);

    // 修改员工信息
    Boolean updateEmp(Emp emp);

    // 删除员工信息
    void deleteEmp(String eid);

    // 获得所有员工的数量
    Integer getCount();

    // 以Map集合获取所有员工信息
    // 设置Map的键，因为在查询时传出所有的员工信息，可以把员工信息作为值，但是必须设置键
    @MapKey("eid")
    Map<String, Emp> getAllEmpMap();

}
