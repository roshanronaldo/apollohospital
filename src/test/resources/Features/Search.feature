Feature: To validate apollo hospital application

  Scenario: To validate the search functionalty
    Given Launch the apollo hospital application
    When Search the doctors or hospital  in search box
    And Click the search icon
    Then validate the result page
    When print the orthopredician name in consol
