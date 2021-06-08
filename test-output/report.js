$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Search_Customer.feature");
formatter.feature({
  "name": "search customer",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below steps are common for both scenarios",
  "description": "\tSuccessfull login with valid credentials ",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"https://demo.opencart.com/admin/index.php?route\u003dcommon/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"demo\" and password as \"demo\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "login.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_can_view_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_click_on_customers_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on customers menu item",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_on_customers_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view customers page",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_can_view_customers_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search customer by email id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user enter email",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_enter_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "login.click_on_filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should found email in search table",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_should_found_email_in_search_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "login.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Below steps are common for both scenarios",
  "description": "\tSuccessfull login with valid credentials ",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"https://demo.opencart.com/admin/index.php?route\u003dcommon/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"demo\" and password as \"demo\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "login.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_can_view_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_click_on_customers_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on customers menu item",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_on_customers_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view customers page",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_can_view_customers_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search customer by name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user enter name",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_enter_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "login.click_on_filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should found name in search table",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_should_found_name_in_search_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "login.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});