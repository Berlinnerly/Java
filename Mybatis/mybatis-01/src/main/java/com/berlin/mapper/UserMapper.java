package com.berlin.mapper;

import com.berlin.bean.User;

/**
 * @author Berlin
 * @date 2021/1/25 23:41
 * @description
 */
public interface UserMapper {
    User getUserByUid(String uid);
}
