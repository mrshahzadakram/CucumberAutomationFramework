Feature: Verifying Care Gaps tab of Persivia application is working fine

Background:
Given the user has logged in

@sanityTest
Scenario: Verify that the Care Gaps has all required columns in application against searched patient

Given the user searched a patient
When the user clicks "tab" of "care gaps"
Then 5 columns are shown on ui of care gaps
And  "Severity" is first column of care gaps
And  "Care Gap" is second column of care gaps
And "Program" is third column of care gaps
And  "Created On" is fourth column of care gaps
And "Status" is fifth column of care gaps

