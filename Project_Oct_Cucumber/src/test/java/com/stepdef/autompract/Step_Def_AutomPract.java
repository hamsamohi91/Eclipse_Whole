package com.stepdef.autompract;

import org.openqa.selenium.WebDriver;

import com.object.manager.Project_Object_Manager_AutomationPract;
import com.runner.AutomPractic_Runner;
import com.utility.Utility_Files;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def_AutomPract extends Utility_Files{

	public static WebDriver driver = AutomPractic_Runner.driver;
	
	public static Project_Object_Manager_AutomationPract manag_Autom = new Project_Object_Manager_AutomationPract(driver);

	@Before
	public void click_Signin() {

		click_On_Element(manag_Autom.getStore().getSignup());
		
	}
	
	
	@After
	public void sign_Out() {

		
		click_On_Element(manag_Autom.getOrder_History().getSignouta());

		navigateTo("http://automationpractice.com/index.php");
	}
	
	
	@When("user Enter The Username In Username Field")
	public void user_enter_the_username_in_username_field() {

		send_Keys(manag_Autom.getLogi().getEmail(), "autopract@gmail.com");
	
	}
	@When("user Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() {

		send_Keys(manag_Autom.getLogi().getPwd(), "Automation");

	}
	@Then("user Click On The Login Button And It Navigates to the My Account Page")
	public void user_click_on_the_login_button_and_it_navigates_to_the_my_account_page() {

		click_On_Element(manag_Autom.getLogi().getSignin());

	}
	@When("user Click On The Casual Dresses Text And It Navigates To the Casual Dresses Page")
	public void user_click_on_the_casual_dresses_text_and_it_navigates_to_the_casual_dresses_page() {
		Actions(manag_Autom.getAccount().getDresses());
		Actions(manag_Autom.getAccount().getCasual());
		click_On_Element(manag_Autom.getAccount().getCasual());
		
	}
	@When("user Choose The Dress And Click On The Quick View")
	public void user_choose_the_dress_and_click_on_the_quick_view() {

		click_On_Element(manag_Autom.getCasual_Dress().getDress1());
		Frame_Method(manag_Autom.getCasual_Dress().getFrame());

	}
	@When("user Select The Quantity")
	public void user_select_the_quantity() {

		explicit_Visibility(manag_Autom.getCasual_Dress().getQuantity(), 15);
		
	}
	@When("user Select Size")
	public void user_select_size() {

		select_Value(manag_Autom.getCasual_Dress().getSize(), "2");

	}

	@When("user Click On Add To Cart Button And It Navigates To Proceed To Checkout page")
	public void user_click_on_add_to_cart_button_and_it_navigates_to_proceed_to_checkout_page() {

		click_On_Element(manag_Autom.getCasual_Dress().getAdd2cart());

	
	}
	@When("user Click On Proceed To Checkout Button And It Navigates To Order Page")
	public void user_click_on_proceed_to_checkout_button_and_it_navigates_to_order_page() {
	implicit_Wait(15);
		click_On_Element(manag_Autom.getCasual_Dress().getProceed());
        
	
	}
	@When("user Click On Proceed To Checkout Button And It Navigates To Address Field")
	public void user_click_on_proceed_to_checkout_button_and_it_navigates_to_address_field() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getOrder().getP2check());

	
	}
	@When("user Click On Proceed To Checkout Button And It Navigates To Shipping Field")
	public void user_click_on_proceed_to_checkout_button_and_it_navigates_to_shipping_field() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getOrder().getP2check2());
	
	}
	@When("user Check On Agree Button")
	public void user_check_on_agree_button() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getOrder().getAgree());
	
	}
	@When("user Click On Proceed To Checkout Button And It Navigates To Payment Field")
	public void user_click_on_proceed_to_checkout_button_and_it_navigates_to_payment_field() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getOrder().getP2check3());
	
	}
	@When("user Click On Pay By Bank Wire Link To Make The Payment")
	public void user_click_on_pay_by_bank_wire_link_to_make_the_payment() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getOrder().getBank());

	
	}
	@Then("user Click On I Confirm My Order Button")
	public void user_click_on_i_confirm_my_order_button() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getStore2().getConfrim());

	}

//Scenario2
	
	@When("user Enter The Username In Username Field2")
	public void user_enter_the_username_in_username_field2() {
		implicit_Wait(15);
		send_Keys(manag_Autom.getLogi().getEmail(), "autopract@gmail.com");

	}
	@When("user Enter The Password In Password Field2")
	public void user_enter_the_password_in_password_field2() {
		implicit_Wait(15);
		send_Keys(manag_Autom.getLogi().getPwd(), "Automation");

	}
	@Then("user Click On The Login Button And It Navigates to the My Account Page2")
	public void user_click_on_the_login_button_and_it_navigates_to_the_my_account_page2() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getLogi().getSignin());

	}
	@When("user Click On The Evening Dresses Text And It Navigates To the Evening Dresses Page")
	public void user_click_on_the_evening_dresses_text_and_it_navigates_to_the_evening_dresses_page() {
		implicit_Wait(15);
		Actions(manag_Autom.getAccount().getDresses2());
		Actions(manag_Autom.getAccount().getEvening());
		click_On_Element(manag_Autom.getAccount().getEvening());

	
	}
	@When("user Choose The Dress And Click On The Quick View2")
	public void user_choose_the_dress_and_click_on_the_quick_view2() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getEve_Dress().getClickdress2());
		Frame_Method(manag_Autom.getEve_Dress().getFrame2());

	
	}
	@When("user Select The Quantity2")
	public void user_select_the_quantity2() {
		implicit_Wait(15);
		Actions(manag_Autom.getEve_Dress().getCount2());

	
	}
	@When("user Select Size2")
	public void user_select_size2() {
		implicit_Wait(15);
		select_Value(manag_Autom.getEve_Dress().getSize2(), "3");

	}
		
	@When("user Select The Color")
	public void user_select_the_color() {

		implicit_Wait(15);
		click_On_Element(manag_Autom.getEve_Dress().getColor2());
	
	}
	@When("user Click On Add To Cart Button And It Navigates To Proceed To Checkout page2")
	public void user_click_on_add_to_cart_button_and_it_navigates_to_proceed_to_checkout_page2() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getEve_Dress().getAdd2cart2());

	}
	@When("user Click On Proceed To Checkout Button And It Navigates To Order Page2")
	public void user_click_on_proceed_to_checkout_button_and_it_navigates_to_order_page2() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getEve_Dress().getCheckout1());

	}
	@When("user Click On Proceed To Checkout Button And It Navigates To Address Field2")
	public void user_click_on_proceed_to_checkout_button_and_it_navigates_to_address_field2() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getOrder().getP2check2());
	
	}
	@When("user Click On Proceed To Checkout Button And It Navigates To Shipping Field2")
	public void user_click_on_proceed_to_checkout_button_and_it_navigates_to_shipping_field2() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getOrder().getP2check2());

	
	}
	@When("user Check On Agree Button2")
	public void user_check_on_agree_button2() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getOrder().getAgree2());

	}
	@When("user Click On Proceed To Checkout Button And It Navigates To Payment Field2")
	public void user_click_on_proceed_to_checkout_button_and_it_navigates_to_payment_field2() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getOrder().getCheckout4());

	
	}
	@When("user Click On Pay By Cheque Link To Make The Payment")
	public void user_click_on_pay_by_cheque_link_to_make_the_payment() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getOrder().getCheque());

	}
	@Then("user Click On I Confirm My Order Button2")
	public void user_click_on_i_confirm_my_order_button2() {
		implicit_Wait(15);
		click_On_Element(manag_Autom.getStore2().getConfrim());

	}
	
	
}
