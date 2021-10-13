Feature: Etsy title verification

  Background: user is on the etsy main page
    Given user is on etsy main page


  Scenario: Title verification main page
    Then user verifies that title is Etsy

  @wip
    Scenario: Title verification when searching
      When user types wooden spoon in the search box
      Then user should verify that title contains the keyword