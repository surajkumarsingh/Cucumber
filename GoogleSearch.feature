Feature: Google search

  Scenario: user search on Google
    Given user on google HomePage search page
    When user enter in serach box
    Then google search result show
