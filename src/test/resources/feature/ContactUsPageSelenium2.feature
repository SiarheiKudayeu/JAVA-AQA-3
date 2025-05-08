Feature: Testing Contact Us Page
  Background:
    Given Set up driver

  Scenario Outline: Testing of positive filling contact us page
    When Opening Contact Us Page
    And set email "<text1>"
    And select subject heading
    And set order id
    And upload file
    And insert message
    And click on send button
    Then check success message
    Then quit driver
    Examples:
    |text1|
    |mail@mail.mail|

  Scenario Outline: Testing of positive filling contact us page
    When Opening Contact Us Page
    And set email "<text1>"
    And select subject heading
    And set order id
    And upload file
    And insert message
    And click on send button
    Then check success message
    Then quit driver
    Examples:
      |text1|
      |mail2@mail.mail|