package home.controls;

import java.io.FileNotFoundException;

import home.daos.LoginDao;

public class LoginControl {
	
	LoginDao loginDao = new LoginDao();
	
	// Login DB�� ����� �Է°� �� �޼ҵ�
		public boolean authenticate(String inputID, String inputPassword) throws FileNotFoundException{
			return loginDao.authenticate(inputID, inputPassword);
		}
	
}