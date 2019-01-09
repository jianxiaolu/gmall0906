package com.atguigu.gmall.user.service.impl;

import bean.UserInfo;
import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;
import java.util.List;

/**
 * Created by admin on 2019/1/8.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

//    @Autowired
//    UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> getUserList() {

        return userInfoMapper.selectAll();
    }

//    @Override
//    public List<UserAddress> getAddressList() {
//        return userAddressMapper.selectAll();
//    }
//
//    @Override
//    public List<UserAddress> getAddressListByUserId(String userId) {
//        return null;
//    }
//
//    @Override
//    public UserAddress getAddressListById(String addressId) {
//        return null;
//    }
}

