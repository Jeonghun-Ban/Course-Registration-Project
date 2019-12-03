package home.controls;

import java.io.FileNotFoundException;
import java.util.Vector;

import home.daos.BasketDao;
import home.model.LectureModel;
import home.model.UserModel;

public class BasketControl{
	
	BasketDao basketDao = new BasketDao();
	
	// Check Login User
	public UserModel checkCurrentUser() {
		return basketDao.checkCurrentUser();
	}
	
	// Load Data Method
	public Vector<LectureModel> getBasketData(String fileName) throws FileNotFoundException{
		return basketDao.getBasketData(fileName);
	} 
	
	public Vector<LectureModel> getRegisterData(String fileName) throws FileNotFoundException{
		return basketDao.getRegisterData(fileName);
	} 
	
}