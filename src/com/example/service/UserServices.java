package com.example.service;

import com.example.beans.Student;
import com.example.dao.DAO;
import com.example.dao.HibernateImpl;

public class UserServices {
	
	public boolean verifyUser(Student s) {
		return false;
	}
	public void sendOTP() {
		
	}
	
	public void sendEmail(String emailBody, String email) {
		
	}
	
	public Student loginUser(String username, String passwd) {
		// Create an Dao Object
		//db.login(username,passwd);
		DAO db = new HibernateImpl();
		Student s = db.login("root","root");
		return s;
	}
}
