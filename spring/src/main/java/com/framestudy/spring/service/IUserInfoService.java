package com.framestudy.spring.service;

import com.framestudy.spring.beans.UserInfo;

public interface IUserInfoService {
	public void saveUserInfo(UserInfo user) throws Exception;
	
	public void updateUserInfo(UserInfo user) throws Exception;
}
