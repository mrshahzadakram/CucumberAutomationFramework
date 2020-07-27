Feature: Checking Search Functionality of Persivia application is working fine

Background:
Given the user has logged in

@sanityTest
Scenario: Verify that the search functionality of the application is fine

Given the user is on home page
When the user searched a patient
Then the data of selected patient is shown on ui
And there are 11 tabs including hcc and auc on ui


@sanityTest
Scenario: Verify that the Name of searched patient is matching with then Name showing on banner
Given the user is on home page
When the user searched a patient
Then selected patient name is matching with name shown on ui
