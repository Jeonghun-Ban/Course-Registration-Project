package home.controls;

import java.io.FileNotFoundException;

import home.daos.LoginDao;

public class LoginControl {
	
	LoginDao loginDao = new LoginDao();
	
	// Login DB와 사용자 입력값 비교 메소드
		public boolean authenticate(String inputID, String inputPassword) throws FileNotFoundException{
			return loginDao.authenticate(inputID, inputPassword);
		}
	
}