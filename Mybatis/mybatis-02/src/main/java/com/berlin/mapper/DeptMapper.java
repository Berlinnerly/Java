package com.berlin.mapper;

import com.berlin.bean.Dept;

/**
 * @author Berlin
 * @date 2021/3/1 10:14
 * @description
 */
public interface DeptMapper {

    Dept getDeptByBid(String did);

}
