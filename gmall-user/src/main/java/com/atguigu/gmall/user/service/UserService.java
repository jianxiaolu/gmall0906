package com.atguigu.gmall.user.service;


import com.atguigu.gmall.user.bean.UserAddress;
import com.atguigu.gmall.user.bean.UserInfo;

import java.util.List;

/**
 * Created by admin on 2019/1/8.
 */
public interface UserService {

    List<UserInfo> getUserList();

//    List<UserAddress> getAddressList();
//
//    List<UserAddress> getAddressListByUserId(String userId);
//
//    UserAddress getAddressListById(String addressId);
}
