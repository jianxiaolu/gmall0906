package service;



import bean.UserInfo;

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
