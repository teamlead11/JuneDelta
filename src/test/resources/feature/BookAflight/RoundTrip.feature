#Author: gayatri
@US0007 @Regression @Sprint1 @Smoke @bookaflight
Feature: Title of your feature

  #AC1
  Scenario: Booking flight in Roundtrip
    Given The User is in Delta homepage
    And The User clicks the Roundtrip button
    When The User enters the input for origin,destination and journey date and Return date
      | ATL| MSP | 08/10/2018 |08/30/2018|
    And The user clicks find a flight button
    Then The user should be in search results page
