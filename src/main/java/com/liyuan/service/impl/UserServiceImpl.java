package com.liyuan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyuan.model.UserVO;
import com.liyuan.persistence.mybatis.UserVOMapper;
import com.liyuan.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserVOMapper userVOMapper;
    
    @Override
    public UserVO findByUserNameAndPwd(String userName,String password){
        
        return userVOMapper.selectByUserNameAndpwd (userName, password);
    }

}
