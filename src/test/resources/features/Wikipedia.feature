Feature: Wikipedia Search Feature
  @wip
  Scenario: Wikipedia Search title verification
    Given user is on the wikipedia main page
    When user searches for Steve Jobs
    And user clicks search button
    Then user should see Steve Jobs on the title
  @wip
  Scenario: Wikipedia Search header verification
    Given user is on the wikipedia main page
    When user searches for Steve Jobs
    And user clicks search button
    Then user should see Steve Jobs on the main header
  @wip
  Scenario: Wikipedia Search image verification
    Given user is on the wikipedia main page
    When user searches for Steve Jobs
    And user clicks search button
    Then user should see Steve Jobs on the image
