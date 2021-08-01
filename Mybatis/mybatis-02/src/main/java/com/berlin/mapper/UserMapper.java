package com.berlin.mapper;

import com.berlin.bean.User;

/**
 * @author Berlin
 * @date 2021/2/24 15:31
 * @description
 */
public interface UserMapper {

    User getUserByUid(String uid);
}
