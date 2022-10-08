package com.stepdef;

import org.openqa.selenium.WebDriver;

import com.object.manager.Project_Object_Manager_Adactin;
import com.runner.Adactin_Runner;
import com.singleton.pattern.File_Reader_Manager;
import com.utility.Utility_Files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def extends Utility_Files{

	public static WebDriver driver = Adactin_Runner.driver;

	
	public static Project_Object_Manager_Adactin manager = new Project_Object_Manager_Adactin(driver);	


	
	
	@Given("user Launch The Application")
	public void user_launch_the_application() {

        get("https://adactinhotelapp.com/");
	}
	@When("user Enter The {string} In Username Field")
	public void user_enter_the_in_username_field(String username) {
	
		send_Keys(manager.getHotel().getUname(), username);
		
	}
	@When("user Enter The {string} In Password Field")
	public void user_enter_the_in_password_field(String password) {
	
	send_Keys(manager.getHotel().getPwd(), password);
	}
	@Then("user Click On The Login Button And It Navigates To The Search Hotel Page")
	public void user_click_on_the_login_button_and_it_navigates_to_the_search_hotel_page() {

click_On_Element(manager.getHotel().getLogin());		
	}

	@When("user Select The {string} In Location Field")
	public void user_select_the_in_location_field(String location) {

		select_Value(manager.getSearch_Hotel().getLocation(), location);
	}
	@When("user Select The {string} In Hotels Field")
	public void user_select_the_in_hotels_field(String hotel) {

		select_Value(manager.getSearch_Hotel().getHotel(), hotel);
	
	}
	@When("user Select The {string} In Room Type Field")
	public void user_select_the_in_room_type_field(String roomtype) {
	
		select_Value(manager.getSearch_Hotel().getRoom(), roomtype);
	}
	@When("user Select The {string} In Number OF Rooms Field")
	public void user_select_the_in_number_of_rooms_field(String nroom) {

		select_Value(manager.getSearch_Hotel().getRtype(), nroom);
		
	}
	@When("user Enter The {string} In Check In Date Field")
	public void user_enter_the_in_check_in_date_field(String datein) {

		clear(manager.getSearch_Hotel().getDatein());
		
		send_Keys(manager.getSearch_Hotel().getDatein(), datein);
		
	}
	@When("user Enter The {string} In Check Out Date Field")
	public void user_enter_the_in_check_out_date_field(String dateout) {
		
		clear(manager.getSearch_Hotel().getDateout());
		
		send_Keys(manager.getSearch_Hotel().getDateout(), dateout);

		
	}
	@When("user Select The {string} In Adults Per Room Field")
	public void user_select_the_in_adults_per_room_field(String aroom) {

		select_VisibleText(manager.getSearch_Hotel().getAroom(), aroom);	    	   
	}
	@When("user Select The {int} In Children Per Room Field")
	public void user_select_the_in_children_per_room_field(int croom) {

		select_Index(manager.getSearch_Hotel().getCroom(), croom);

	}
	@Then("user Click On The Search Button And It Navigates To The Select Hotel Page")
	public void user_click_on_the_search_button_and_it_navigates_to_the_select_hotel_page() {

	    click_On_Element(manager.getSearch_Hotel().getSubmit());

		
	}

	@When("user Click On the Radio Button To Select Hotel")
	public void user_click_on_the_radio_button_to_select_hotel() {

		click_On_Element(manager.getSelect_Hotel().getOkay());
		

	}
	@Then("user Click On The Continue Button And It Navigates To The Book A Hotel Page")
	public void user_click_on_the_continue_button_and_it_navigates_to_the_book_a_hotel_page() {

		click_On_Element(manager.getSelect_Hotel().getCont());

	}
	
	@When("user Enter The {string} In First Name Field")
	public void user_enter_the_in_first_name_field(String fname) {

		send_Keys(manager.getBook_Hotel().getFname(), fname);

		
	}
	@When("user Enter The {string} In Last Name Field")
	public void user_enter_the_in_last_name_field(String lname) {

		send_Keys(manager.getBook_Hotel().getLname(), lname);

	}
	@When("user Enter The {string} In Billing Address Field")
	public void user_enter_the_in_billing_address_field(String add) {

		send_Keys(manager.getBook_Hotel().getAdd(), add);

		
	}
	@When("user Enter The {string} In Credit Card No. Field")
	public void user_enter_the_in_credit_card_no_field(String cc) {

		send_Keys(manager.getBook_Hotel().getCard(), cc);

	}
	@When("user Select The {string} In Credit Card Type Field")
	public void user_select_the_in_credit_card_type_field(String ctype) {

		select_Value(manager.getBook_Hotel().getCtype(), ctype);

		
	}
	@When("user Select The {int} and {string} In Expiry Date Field")
	public void user_select_the_and_in_expiry_date_field(int exmonth, String exyear) {

		select_Index(manager.getBook_Hotel().getExp(), exmonth);
		
		select_Value(manager.getBook_Hotel().getExp2(), exyear);

		
	}
	@When("user Enter The {string} In CVV Number Field")
	public void user_enter_the_in_cvv_number_field(String cvv) {

		send_Keys(manager.getBook_Hotel().getCvv(), "234");

	}
	@Then("user Click On The Book Now Button And HoTel Booking Is Taken Place")
	public void user_click_on_the_book_now_button_and_ho_tel_booking_is_taken_place() {

		click_On_Element(manager.getBook_Hotel().getBooknow());

	}


	
	
	
	
	
}
