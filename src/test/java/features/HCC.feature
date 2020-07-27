Feature: Verifying HCC tab of Persivia application is working fine


Background:
Given the user has logged in

@sanityTest
Scenario: Verify that the HCC tab has all required columns in application against searched patient for active problem lists
Given the user searched a patient
When the user clicks "tab" of "hcc"
Then 4 columns are shown on hcc ui under active problem lists
And  "Source" is first column of active problem lists
And  "Active Problem List" is second column of active problem lists
And "Code" is third column of active problem lists
And  "Action" is fourth column of active problem lists

@sanityTest
Scenario: Verify that the HCC tab has all required columns in application against searched patient for Dropped Codes
Given the user searched a patient
When the user clicks "tab" of "hcc"
Then 4 columns are shown on hcc ui under active dropped codes
And  "Source" is first column of active dropped codes
And  "Potential Gaps" is second column of active dropped codes
And "Code" is third column of active dropped codes
And  "Action" is fourth column of active dropped codes
