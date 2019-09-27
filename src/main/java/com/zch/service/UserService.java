package com.zch.service;

import com.zch.domain.AqiGitHubTest;
import com.zch.mapper.UserMapper;

/**
 * @author : 赵长红
 * @date : 2019/9/27 10:18
 */
public class UserService {


 public int add(AqiGitHubTest aqiGitHubTest){

  UserMapper userMapper=new UserMapper();
  int i=userMapper.insert(aqiGitHubTest);

  return i;
 }


}
