package com.liyuan.persistence.mybatis;

import org.apache.ibatis.annotations.Param;

import com.liyuan.model.UserVO;

public interface UserVOMapper {
    
    UserVO selectByUserNameAndpwd(@Param("user_name")String userName,@Param("password")String password);
    
}