Feature: Hotel Booking In Adactin Application

Scenario: user Login
Given user Launch The Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Clicks Login Button And It Navigates To Search Hotel Page

Scenario: Search Hotel
When user Select Location
And user Select hotel
And user Select Room Type
And user Select Number Of Rooms
And user Select Check In Date
And user Select Check Out Date
And user Select Adult Per Room
And user Select Child Per Room
Then user Clicks Search Button And Navigates To Confirm Hotel Page

Scenario: User Confirmation
When user clicks Radio Button
Then user Clicks Continue Button And It Navigates To Payment Page

Scenario: Payment
When user Enter Firstname In The Firstname Field
And user Enter The Lastname In Lastname Field
And user Enter The Address
And user Enter The Credit Card Number
And user Enter The Credit Card Type
And user Enter The Expiry Year And Month
And user Enter The Cvv Number
Then user Clicks On Booknow Button



