$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Clicks Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Launch_The_Application()"
});
formatter.result({
  "duration": 4347698700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_The_Username_In_Username_Field()"
});
formatter.result({
  "duration": 228674400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 118835600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1692387100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user Select Location",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Select hotel",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Select Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Select Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Select Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Select Adult Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select Child Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Clicks Search Button And Navigates To Confirm Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Select_Location()"
});
formatter.result({
  "duration": 248236000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_hotel()"
});
formatter.result({
  "duration": 250379600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_Room_Type()"
});
formatter.result({
  "duration": 326437500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_Number_Of_Rooms()"
});
formatter.result({
  "duration": 264422300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_Check_In_Date()"
});
formatter.result({
  "duration": 180145000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_Check_Out_Date()"
});
formatter.result({
  "duration": 125542400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_Adult_Per_Room()"
});
formatter.result({
  "duration": 349915300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_Child_Per_Room()"
});
formatter.result({
  "duration": 344856400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_Search_Button_And_Navigates_To_Confirm_Hotel_Page()"
});
formatter.result({
  "duration": 1188993900,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User Confirmation",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-confirmation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "user clicks Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user Clicks Continue Button And It Navigates To Payment Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_clicks_Radio_Button()"
});
formatter.result({
  "duration": 114139800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_Continue_Button_And_It_Navigates_To_Payment_Page()"
});
formatter.result({
  "duration": 1189461000,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Payment",
  "description": "",
  "id": "hotel-booking-in-adactin-application;payment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user Enter Firstname In The Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user Enter The Lastname In Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Enter The Address",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Enter The Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Enter The Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Enter The Expiry Year And Month",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Enter The Cvv Number",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Clicks On Booknow Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Enter_Firstname_In_The_Firstname_Field()"
});
formatter.result({
  "duration": 174531000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_The_Lastname_In_Lastname_Field()"
});
formatter.result({
  "duration": 156502300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_The_Address()"
});
formatter.result({
  "duration": 167644400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_The_Credit_Card_Number()"
});
formatter.result({
  "duration": 169468500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_The_Credit_Card_Type()"
});
formatter.result({
  "duration": 315913500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_The_Expiry_Year_And_Month()"
});
formatter.result({
  "duration": 776670000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_The_Cvv_Number()"
});
formatter.result({
  "duration": 565400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_On_Booknow_Button()"
});
formatter.result({
  "duration": 160546800,
  "status": "passed"
});
});