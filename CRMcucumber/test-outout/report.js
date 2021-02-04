$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Venkat/eclipse-workspace/CRMcucumber/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "CRMPRO Login Feature",
  "description": "",
  "id": "crmpro-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "CRMPRO Login Test Scenario",
  "description": "",
  "id": "crmpro-login-feature;crmpro-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is CRMPRO",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginstepdefintion.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 22710209525,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefintion.title_of_login_page_is_CRMPRO()"
});
formatter.result({
  "duration": 53485755,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefintion.user_enters_username_and_password()"
});
formatter.result({
  "duration": 328575623,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefintion.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 81353322,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefintion.user_is_on_home_page()"
});
formatter.result({
  "duration": 17851789,
  "status": "passed"
});
});