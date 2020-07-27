Feature: Verifying AUC tab of Persivia application is working fine

Background:
Given the user has logged in

@sanityTest
Scenario: Verify that the AUC tab has search bar and text above the search bar is correct
Given the user searched a patient
When the user clicks "tab" of "auc"
Then a search bar is shown on ui
And search bar text is "Please select an exam or indication"