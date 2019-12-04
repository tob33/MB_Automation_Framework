Feature: Confirm Allocation
@wip
Scenario: User selects Cautious
#Given the user is on the Confirm Allocation screen
#When the user taps on the Cautious tab
Then the allocations are “85%”, “10%”, “5%”

Scenario: User selects Balanced
Given the user is on the Confirm Allocation screen
When the user taps on the Balanced tab
Then the allocations are “30%”, “45%”, “25%”

Scenario: User selects Adventurous
Given the user is on the Confirm Allocation screen
When the user taps on the Adventurous tab
Then the allocations are “5%”, “60%”, “35%”
