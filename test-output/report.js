$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Sample Work Space/FreeCRMBDDPractise/src/main/java/Features/tagging.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM application testing",
  "description": "",
  "id": "free-crm-application-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Login with incorrect username and correct password",
  "description": "",
  "id": "free-crm-application-testing;login-with-incorrect-username-and-correct-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "This is a invalid login test",
  "keyword": "Given "
});
formatter.match({
  "location": "taggingstepdefinition.this_is_a_invalid_login_test()"
});
formatter.result({
  "duration": 200593102,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Create a tasks",
  "description": "",
  "id": "free-crm-application-testing;create-a-tasks",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "This is a tasks test case",
  "keyword": "Given "
});
formatter.match({
  "location": "taggingstepdefinition.this_is_a_tasks_test_case()"
});
formatter.result({
  "duration": 120308,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Search a deal",
  "description": "",
  "id": "free-crm-application-testing;search-a-deal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "This is a Search deal test case",
  "keyword": "Given "
});
formatter.match({
  "location": "taggingstepdefinition.this_is_a_Search_deal_test_case()"
});
formatter.result({
  "duration": 117458,
  "status": "passed"
});
});