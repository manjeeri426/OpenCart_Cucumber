Feature: search customer 

Background: Below steps are common for both scenarios 
	Successfull login with valid credentials 
	Given  user launch chrome browser 
	When  user opens URL "https://demo.opencart.com/admin/index.php?route=common/login" 
	And user enters username as "demo" and password as "demo" 
	And click on login 
	Then User can view dashboard 
	When user click on customers menu 
	And user click on customers menu item 
	Then user can view customers page 
	
	
	
	
@sanity
Scenario: Search customer by email id 
	When user enter email 
	And click on filter button 
	Then user should found email in search table 
	And close browser 
	
@regression 
Scenario: Search customer by name 
    When user enter name
	And click on filter button 
	Then user should found name in search table 
	And close browser 
	
	
	
