package com.jdbc.app;

import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.controllers.AdminController;
import com.jdbc.controllers.UserController;
import com.jdbc.models.User;

public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		AdminController a = new AdminController();
		
		
		a.getUsers();
		
		
		

	}

}