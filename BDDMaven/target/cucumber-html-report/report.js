$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ActitimeLogin.feature");
formatter.feature({
  "name": "Acitime Login functinality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate actitime login functionality using valid username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is already in actitime login page",
  "keyword": "Given "
});
formatter.match({
  "location": "ActitimeLogin.user_is_already_in_actitime_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username",
  "keyword": "When "
});
formatter.match({
  "location": "ActitimeLogin.user_enters_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify actitime home page opened or not",
  "keyword": "Then "
});
formatter.match({
  "location": "ActitimeLogin.verify_actitime_home_page_opened_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate actitime login functionality using valid credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is already having valid url for actitime login page \u0027https://demo.actitime.com/login.do\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "ActitimeLogin.user_is_already_having_valid_url_for_actitime_login_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "ActitimeLogin.user_enters_username_as_admin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as \u0027manager\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.enter_password_as_manager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that actitime page opened with title \u0027actiTIME - Enter Time-Track\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ActitimeLogin.verify_that_actitime_page_opened_with_title_actiTIME_Enter_Time_Track(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate actitime login functionality using invalid credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is already having valid url for actitime login page \u0027https://demo.actitime.com/login.do\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "ActitimeLogin.user_is_already_having_valid_url_for_actitime_login_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "ActitimeLogin.user_enters_username_as_admin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as \u0027manager123\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.enter_password_as_manager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that actitime page opened with title \u0027actiTIME - Login\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ActitimeLogin.verify_that_actitime_page_opened_with_title_actiTIME_Enter_Time_Track(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate login functionality using \u003ctype\u003e credential for actitime application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already having valid url for actitime login page \u003curl\u003e for actitime application",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters username as \u003cusername\u003e in actitime application",
  "keyword": "When "
});
formatter.step({
  "name": "enter password as \u003cpassword\u003e in actitime application",
  "keyword": "And "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "verify that actitime page opened with title \u003cpagetitle\u003e in actitime application",
  "keyword": "Then "
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "type",
        "url",
        "username",
        "password",
        "pagetitle"
      ]
    },
    {
      "cells": [
        "valid",
        "https://demo.actitime.com/login.do",
        "admin",
        "manager",
        "actiTIME - Enter Time-Track"
      ]
    },
    {
      "cells": [
        "invalid",
        "https://demo.actitime.com/login.do",
        "admin",
        "manager123",
        "actiTIME - Login"
      ]
    },
    {
      "cells": [
        "invalid",
        "https://demo.actitime.com/login.do",
        "\"\"",
        "manager123",
        "actiTIME - Login"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate login functionality using valid credential for actitime application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already having valid url for actitime login page https://demo.actitime.com/login.do for actitime application",
  "keyword": "Given "
});
formatter.match({
  "location": "ActitimeLogin.user_is_already_having_valid_url_for_actitime_login_page_for_actitime_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as admin in actitime application",
  "keyword": "When "
});
formatter.match({
  "location": "ActitimeLogin.user_enters_username_as_in_actitime_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as manager in actitime application",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.enter_password_as_in_actitime_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that actitime page opened with title actiTIME - Enter Time-Track in actitime application",
  "keyword": "Then "
});
formatter.match({
  "location": "ActitimeLogin.verify_that_actitime_page_opened_with_title_in_actitime_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate login functionality using invalid credential for actitime application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already having valid url for actitime login page https://demo.actitime.com/login.do for actitime application",
  "keyword": "Given "
});
formatter.match({
  "location": "ActitimeLogin.user_is_already_having_valid_url_for_actitime_login_page_for_actitime_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as admin in actitime application",
  "keyword": "When "
});
formatter.match({
  "location": "ActitimeLogin.user_enters_username_as_in_actitime_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as manager123 in actitime application",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.enter_password_as_in_actitime_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that actitime page opened with title actiTIME - Login in actitime application",
  "keyword": "Then "
});
formatter.match({
  "location": "ActitimeLogin.verify_that_actitime_page_opened_with_title_in_actitime_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate login functionality using invalid credential for actitime application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already having valid url for actitime login page https://demo.actitime.com/login.do for actitime application",
  "keyword": "Given "
});
formatter.match({
  "location": "ActitimeLogin.user_is_already_having_valid_url_for_actitime_login_page_for_actitime_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"\" in actitime application",
  "keyword": "When "
});
formatter.match({
  "location": "ActitimeLogin.user_enters_username_as_in_actitime_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as manager123 in actitime application",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.enter_password_as_in_actitime_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that actitime page opened with title actiTIME - Login in actitime application",
  "keyword": "Then "
});
formatter.match({
  "location": "ActitimeLogin.verify_that_actitime_page_opened_with_title_in_actitime_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLogin.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});