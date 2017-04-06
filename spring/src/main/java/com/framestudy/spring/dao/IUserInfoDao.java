package com.framestudy.spring.dao;

import com.framestudy.spring.beans.UserInfo;

public interface IUserInfoDao {
	public void saveUserInfo(UserInfo user);
	public void updateUserInfo(UserInfo user);
}
