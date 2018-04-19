package com.liyuan.service;

import com.liyuan.model.UserVO;

public interface UserService {
    public UserVO findByUserNameAndPwd(String username,String password);
}
