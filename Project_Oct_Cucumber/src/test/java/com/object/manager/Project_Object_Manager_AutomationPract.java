package com.object.manager;

import org.openqa.selenium.WebDriver;

import com.POM.automationpractice.Casual_Dresses;
import com.POM.automationpractice.Evening_Dresses;
import com.POM.automationpractice.Login;
import com.POM.automationpractice.My_Account;
import com.POM.automationpractice.My_Store;
import com.POM.automationpractice.My_Store2;
import com.POM.automationpractice.Order;
import com.POM.automationpractice.Order_Confirmation;
import com.POM.automationpractice.Order_History;

public class Project_Object_Manager_AutomationPract {

	public WebDriver driver;
	
	private	My_Store store;
	
	private Login logi;

private	My_Account account;

private Casual_Dresses casual_Dress;

private Order order;

private My_Store2 store2;

private Order_Confirmation order_conf;

private Order_History order_History; 

private Evening_Dresses eve_Dress;


public Evening_Dresses getEve_Dress() {

	eve_Dress = new Evening_Dresses(driver);

	return eve_Dress;
}

public Order_History getOrder_History() {

	order_History = new Order_History(driver); 

	return order_History;
}

public Order_Confirmation getOrder_conf() {

	 order_conf= new Order_Confirmation(driver);
	return order_conf;
}

public My_Store2 getStore2() {

	store2 = new My_Store2(driver);

	return store2;
}

public Order getOrder() {
	order = new Order(driver); 

	
	return order;
}

public Project_Object_Manager_AutomationPract(WebDriver driver2) {

	this.driver= driver2;
	
	}

	public My_Store getStore() {
		store = new My_Store(driver);
		return store;
	}

	public Login getLogi() {
		logi = new Login(driver);
		
		return logi;
	}
	
	public My_Account getAccount() {
		account = new My_Account(driver);

		
		return account;
	}

	public Casual_Dresses getCasual_Dress() {
		
		casual_Dress = new Casual_Dresses(driver);

			return casual_Dress;
		}
	
}
