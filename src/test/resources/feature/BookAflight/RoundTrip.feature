#Author: gayatri
@US0007 @Regression @Sprint1 @Smoke @bookaflight
Feature: Title of your feature

  #AC1
  Scenario: Booking flight in Roundtrip
    Given The Users is in Delta homepage
    And The Users clicks the Roundtrip button
    When The Users enters the input for origin,destination and journey date and Return date
      | ATL| MSP | 08/10/2018 |08/30/2018|
    And The users clicks find a flight button
    Then The users should be in search results page
