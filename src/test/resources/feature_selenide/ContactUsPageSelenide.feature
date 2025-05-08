Feature: Testing Contact Us Page Selenide
  Background:
    Given Set up driver Selenide

  Scenario Outline: Testing of positive filling contact us page Selenide
    When Opening Contact Us Page Selenide
    And set email Selenide "<text1>"
    And select subject heading Selenide
    And set order id Selenide
    And insert message Selenide
    And click on send button Selenide
    Then check success message Selenide
    Then quit driver Selenide
    Examples:
    |text1|
    |mail@mail.mail|

    @need_to_run
  Scenario Outline: Testing of positive filling contact us page Selenide
      When Opening Contact Us Page Selenide
      And set email Selenide "<text1>"
      And select subject heading Selenide
      And set order id Selenide
      And insert message Selenide
      And click on send button Selenide
      Then check success message Selenide
      Then quit driver Selenide
      Examples:
        |text1|
        |mail@mail.mail|