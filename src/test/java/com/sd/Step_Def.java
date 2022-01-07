package com.sd;

import org.openqa.selenium.WebDriver;

import com.Addactin_Cucumber.Addact_Manager;
import com.Addactin_Cucumber.Base_Amazon;
import com.Addactin_Cucumber.Cucumber_Runner;
import com.Addactin_Cucumber.File_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def extends Base_Amazon {
	
	public static WebDriver driver = Cucumber_Runner.driver;
	
	public static Addact_Manager am = new Addact_Manager(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		String geturl = File_Manager.fm().getinscr().geturl();
		
		url(geturl);
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {

		String usn = File_Manager.fm().getinscr().getusn();

		inputvalue(am.getinstancelp().getUsn(), usn);
		
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {

		String pswd = File_Manager.fm().getinscr().getpswd();

		inputvalue(am.getinstancelp().getPswd(), pswd);
		
	}

	@Then("^user Clicks Login Button And It Navigates To Search Hotel Page$")
	public void user_Clicks_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {

		getclick(am.getinstancelp().getLogin());
	}
	
	

	@When("^user Select Location$")
	public void user_Select_Location() throws Throwable {

		selectindex(am.gethp().getLocation(), "2");
	}

	@When("^user Select hotel$")
	public void user_Select_hotel() throws Throwable {

		selectindex(am.gethp().getHotel(), "2");
	}

	@When("^user Select Room Type$")
	public void user_Select_Room_Type() throws Throwable {

		selectindex(am.gethp().getRoomtype(), "2");
	}

	@When("^user Select Number Of Rooms$")
	public void user_Select_Number_Of_Rooms() throws Throwable {

		selectindex(am.gethp().getNoofroom(), "1");
	}

	@When("^user Select Check In Date$")
	public void user_Select_Check_In_Date() throws Throwable {

		inputvalue(am.gethp().getIndate(), "20/12/2021");
	}

	@When("^user Select Check Out Date$")
	public void user_Select_Check_Out_Date() throws Throwable {

		inputvalue(am.gethp().getOutdate(), "21/12/2021");
	}

	@When("^user Select Adult Per Room$")
	public void user_Select_Adult_Per_Room() throws Throwable {

		selectindex(am.gethp().getAdperroom(), "2");
	}

	@When("^user Select Child Per Room$")
	public void user_Select_Child_Per_Room() throws Throwable {

		selectindex(am.gethp().getChildperroom(), "2");
	}

	@Then("^user Clicks Search Button And Navigates To Confirm Hotel Page$")
	public void user_Clicks_Search_Button_And_Navigates_To_Confirm_Hotel_Page() throws Throwable {

		getclick(am.gethp().getSearch());
	}

	@When("^user clicks Radio Button$")
	public void user_clicks_Radio_Button() throws Throwable {

		getclick(am.getsh().getBtn());
	}

	@Then("^user Clicks Continue Button And It Navigates To Payment Page$")
	public void user_Clicks_Continue_Button_And_It_Navigates_To_Payment_Page() throws Throwable {

		getclick(am.getsh().getCont());
	}

	@When("^user Enter Firstname In The Firstname Field$")
	public void user_Enter_Firstname_In_The_Firstname_Field() throws Throwable {

		String fn = File_Manager.fm().getinscr().getfn();
		
		inputvalue(am.getbp().getFirstname(), fn);
	}

	@When("^user Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
		
		String ln = File_Manager.fm().getinscr().getln();

		inputvalue(am.getbp().getLastname(), ln);
	}

	@When("^user Enter The Address$")
	public void user_Enter_The_Address() throws Throwable {
		
		String add = File_Manager.fm().getinscr().getadd();

		inputvalue(am.getbp().getAdd(), add);
	}

	@When("^user Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		
		String cc = File_Manager.fm().getinscr().getcc();

		inputvalue(am.getbp().getCcno(), cc);
	}

	@When("^user Enter The Credit Card Type$")
	public void user_Enter_The_Credit_Card_Type() throws Throwable {

		selectindex(am.getbp().getCardtype(), "2");
	}

	@When("^user Enter The Expiry Year And Month$")
	public void user_Enter_The_Expiry_Year_And_Month() throws Throwable {
		
		selectindex(am.getbp().getMonth(), "7");
		
		String yr = File_Manager.fm().getinscr().getyr();

		selectvisibletext(am.getbp().getYear(), yr);
	}

	@When("^user Enter The Cvv Number$")
	public void user_Enter_The_Cvv_Number() throws Throwable {

		String cvv = File_Manager.fm().getinscr().getcvv();
	}

	@Then("^user Clicks On Booknow Button$")
	public void user_Clicks_On_Booknow_Button() throws Throwable {

		getclick(am.getbp().getBooknow());
	}



}
