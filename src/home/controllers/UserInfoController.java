package home.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import home.controls.UserInfoControl;
import home.model.UserModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class UserInfoController implements Initializable{
	private MainController controller;
	
	@FXML Button closeWindowButton;
	
	@FXML Label nameLabel;
	@FXML Label numberLabel;
	@FXML Label collegeLabel;
	@FXML Label departmentLabel;	
	
	@FXML Label maxCreditLabel;
	@FXML Label currentCreditLabel;
	@FXML Label currentLectureLabel;
	
	// Current User Data
	private String userID;
	private String userName;
	private String userCollege;
	private String userDepartment;
	private String userNumber;
	
	// UserInfoControl
	UserInfoControl userInfoControl = new UserInfoControl();
		
	public UserInfoController() {
		this.controller = new MainController();
		
		this.checkCurrentUser();
	}
	
	public void checkCurrentUser() {
		UserModel user = userInfoControl.checkCurrentUser();

		userID = user.getUserID();
		userName = user.getUserName();
		userCollege = user.getUserCollege();
		userDepartment = user.getUserDepartment();
		userNumber = user.getUserNumber();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		closeWindowButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleCloseWindowButton(event);
			}
		});
		
		nameLabel.setText("Name : "+this.userName);
		numberLabel.setText("Number : "+this.userNumber);
		collegeLabel.setText("College : "+this.userCollege);
		departmentLabel.setText("Dept. : "+this.userDepartment);
	}
	
	private void handleCloseWindowButton(ActionEvent event) {
		Stage userInfo = (Stage)closeWindowButton.getScene().getWindow();
		userInfo.close();
	}
}
