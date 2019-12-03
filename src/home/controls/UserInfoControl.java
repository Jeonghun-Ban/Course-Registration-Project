package home.controls;

import home.daos.UserInfoDao;
import home.model.UserModel;

public class UserInfoControl{
	
	UserInfoDao userInfoDao = new UserInfoDao();
	
	public UserModel checkCurrentUser() {
		return userInfoDao.checkCurrentUser();
	}
	
}
