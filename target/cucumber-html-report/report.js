$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/AUC.feature");
formatter.feature({
  "name": "Verifying AUC tab of Persivia application is working fine",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user has logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_has_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that the AUC tab has search bar and text above the search bar is correct",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "name": "the user searched a patient",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchPatientSteps.the_user_searched_a_patient()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks \"tab\" of \"auc\"",
  "keyword": "When "
});
formatter.match({
  "location": "TabSelectionSteps.the_user_clicks_of(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "a search bar is shown on ui",
  "keyword": "Then "
});
formatter.match({
  "location": "AUCSteps.a_search_bar_is_shown_on_ui()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "search bar text is \"Please select an exam or indication\"",
  "keyword": "And "
});
formatter.match({
  "location": "AUCSteps.search_bar_text_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});