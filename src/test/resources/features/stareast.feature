@all
Feature: [stareast] stareast example

  Scenario: [SED-01 [stareast]
    Given the start page is loaded
    When navigating to the speakers page
    Then "Boris Wrubel" should be listed
