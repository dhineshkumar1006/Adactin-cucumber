package com.Addactin_Cucumber;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class Run_Amazon extends Base_Amazon {

	public static WebDriver driver = getbrowser("chrome"); // null

	public static Login_Page lp = new Login_Page(driver);

	public static Home_Page hp = new Home_Page(driver);

	public static Select_hotel sh = new Select_hotel(driver);

	public static Booking_Page bp = new Booking_Page(driver);

	public static Addact_Manager am = new Addact_Manager(driver);

	public static Logger log = Logger.getLogger(Run_Amazon.class);

	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");
		
		String url = File_Manager.fm().getinscr().geturl();

		url(url);
		
		String usn = File_Manager.fm().getinscr().getusn();

		inputvalue(am.getinstancelp().getUsn(), usn);
		
		String pswd = File_Manager.fm().getinscr().getpswd();

		inputvalue(am.getinstancelp().getPswd(), pswd);

		getclick(am.getinstancelp().getLogin());

		getsleep(2000);

		log.info("account logged in");

		selectindex(am.gethp().getLocation(), "2");

		log.info("location selected");

		selectindex(am.gethp().getHotel(), "2");

		log.info("hotel ok");

		selectindex(am.gethp().getRoomtype(), "2");

		log.info("type of room");

		selectindex(am.gethp().getNoofroom(), "1");

		log.info("no of room");

		inputvalue(am.gethp().getIndate(), "20/12/2021");

		log.info("in date");

		inputvalue(am.gethp().getOutdate(), "21/12/2021");

		log.info("out date");

		selectindex(am.gethp().getAdperroom(), "2");

		log.info("adult per room");

		selectindex(am.gethp().getChildperroom(), "2");

		log.info("child per room");

		getclick(am.gethp().getSearch());

		log.info("hotel search ok");

		getclick(am.getsh().getBtn());

		log.info("radio btn clicked");

		getclick(am.getsh().getCont());

		log.info("continued");
		
		String fn = File_Manager.fm().getinscr().getfn();
		
		inputvalue(am.getbp().getFirstname(), fn);
		
		String ln = File_Manager.fm().getinscr().getln();

		inputvalue(am.getbp().getLastname(), ln);
		
		String add = File_Manager.fm().getinscr().getadd();

		inputvalue(am.getbp().getAdd(), add);
		
		String cc = File_Manager.fm().getinscr().getcc();

		inputvalue(am.getbp().getCcno(), cc);

		log.info("personal details");

		selectindex(am.getbp().getCardtype(), "2");

		selectindex(am.getbp().getMonth(), "7");
		
		String yr = File_Manager.fm().getinscr().getyr();

		selectvisibletext(am.getbp().getYear(), yr);
		
		String cvv = File_Manager.fm().getinscr().getcvv();

		inputvalue(am.getbp().getCvv(), cvv);

		log.info("card details");

		getclick(am.getbp().getBooknow());

		log.info("hotel booked");

	}
}
