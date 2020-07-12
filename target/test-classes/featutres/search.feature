Feature: search and place order
@search
Scenario: search for item and validate result
Given user is on amazon website
When user search for "onions"
Then "onions" are displayed
@prime
Scenario: include prime 
Given user is on amazon website
When user checks the prime checkbox 
Then checkbox should be selected