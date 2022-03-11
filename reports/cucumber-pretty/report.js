$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/social_network.feature");
formatter.feature({
  "name": "Connect with the elearning users",
  "description": "  Covered Login, search user, send invitation and send message module",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search users by its type and send the invitation and message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@social"
    }
  ]
});
formatter.step({
  "name": "User is in the application",
  "keyword": "Given "
});
formatter.step({
  "name": "login as a registered user \"\u003cusername\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Navigate to the social network page search the \"\u003cuser\u003e\" and its type and assert it",
  "keyword": "And "
});
formatter.step({
  "name": "click on send invitation and send the invitation request with \"\u003ctext\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Request sent successfully",
  "keyword": "Then "
});
formatter.step({
  "name": "click on send message button and send the \"\u003csubject\u003e\" and \"\u003cmessage\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Message sent successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "user",
        "text",
        "message"
      ]
    },
    {
      "cells": [
        "suman",
        "suman",
        "Divya",
        "Please accept my invitation",
        "Good morning Divya!"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search users by its type and send the invitation and message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@social"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Social_network.user_is_in_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login as a registered user \"suman\" \"suman\"",
  "keyword": "When "
});
formatter.match({
  "location": "Social_network.login_as_a_registered_user(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to the social network page search the \"Divya\" and its type and assert it",
  "keyword": "And "
});
formatter.match({
  "location": "Social_network.navigate_to_the_social_network_page_search_the_and_its_type_and_assert_it(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on send invitation and send the invitation request with \"Please accept my invitation\"",
  "keyword": "And "
});
formatter.match({
  "location": "Social_network.click_on_send_invitation_and_send_the_invitation_request_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Request sent successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Social_network.request_sent_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on send message button and send the \"\u003csubject\u003e\" and \"Good morning Divya!\"",
  "keyword": "When "
});
formatter.match({
  "location": "Social_network.click_on_send_message_button_and_send_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message sent successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Social_network.message_sent_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});