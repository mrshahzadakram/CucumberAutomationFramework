Feature: Verify that the icons links given at the footer of PE app are working fine.

Background:
Given the user has logged in
@sanityTest
Scenario: Verify that the all links are available in the given footer section
Given the user is on home page
Then 6 sections are shown on footer section
And  "View patient's care plans" is first icon of footer
And  "View all care views" is second icon of footer
And "You have 104 new care gaps" is third icon of footer
And  "201 new assessments" is fourth icon of footer
And  "See your Schedules" is fifth icon of footer
And  "Analytics" is sixth icon of footer

@sanityTest
Scenario: Verify that the global schedules toggle is working fine and schedules page is not empty.						
Given the user is on home page
When the user clicks footer "section" of "See your Schedules"
Then the screen is toggled to calendar
And today button is available on calendar screen
And date field has date of today

@sanityTest
Scenario: Verify that the user is able to toggle back from global schedules to home page
Given the user is on home page
And the user clicks footer "section" of "See your Schedules"
When the user clicks footer "section" of "See your Schedules"
Then the user is on home page

@sanityTest
Scenario: Verify that if user clicks on analytics link then a new browser web page is opening successfully.						
Given the user is on home page
When the user clicks footer "section" of "Analytics"
Then the user lands on auc dashboard web page
