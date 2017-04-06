package com.framestudy.spring.service.impl;

import com.framestudy.spring.beans.UserInfo;
import com.framestudy.spring.dao.IUserInfoDao;
import com.framestudy.spring.service.IUserInfoService;

public class UserInfoServiceImpl implements IUserInfoService{
	private IUserInfoDao dao;

	public UserInfoServiceImpl(){
		super();
	} 
	public UserInfoServiceImpl(IUserInfoDao dao) {
		super();
		this.dao = dao;
	}
	public void saveUserInfo(UserInfo user) throws Exception {
		// TODO Auto-generated method stub
		dao.saveUserInfo(user);
	}

	public void updateUserInfo(UserInfo user) throws Exception {
		// TODO Auto-generated method stub
		dao.updateUserInfo(user);
	}

}
