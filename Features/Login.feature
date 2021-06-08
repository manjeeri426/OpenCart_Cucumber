Feature: Login 


Scenario: Successfull login with valid credentials 
	Given  user launch chrome browser 
	When  user opens URL "https://demo.opencart.com/admin/index.php?route=common/login" 
	And user enters username as "demo" and password as "demo" 
	And click on login 
	Then page tiltle should be "Dashboard" 
	When User click on Logout out link 
	Then page title should be "Administration" 
	And close browser 

@sanity	
Scenario Outline: Login Data driven 
	Given  user launch chrome browser 
	When  user opens URL "https://demo.opencart.com/admin/index.php?route=common/login" 
	And user enters username as "demo" and password as "demo" 
	And click on login 
	Then page tiltle should be "Dashboard" 
	When User click on Logout out link 
	Then page title should be "Administration" 
	And close browser 
	
	Examples: 
		|username|password|
		|demo|demo|
		|demo|demo12356| 
		
		
