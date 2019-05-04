package com.example.controller;

import com.example.beans.Student;
import com.example.service.UserServices;

public class LoginController {
	
	public void doPost(){
		//get the username and password
		
		// create an instance of UserService
		UserServices us = new UserServices();
		Student s = us.loginUser("root","root");
		if(s != null) {
			//forward to Home page
		}else {
			//Login Page
		}
		}
}
