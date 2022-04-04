# Autor:  Juan David Garzon Ramirez

@stories
Feature: Sauce Lab
  As a user, I want to access and make purchases on the page souce lab

  @scenario1
  Scenario: search for backpack
    Given that Juan wants login in SauceLab
    When he click a Sauce Labs Backpack change the page
    Then he finds the backpack Sauce Labs Backpack


  @scenario2
  Scenario: make purchase
    Given that Juan wants login in SauceLab
    When click of button add to cart of backpack
    And click in the cart button
    And click in checkout
    And input name Juan last name Garzon and postal code 055411 and click in continue
    And click in finish
    Then must validate the text THANK YOU FOR YOUR ORDER

  @scenario3
  Scenario: Login with user locked
    Given that Juan wants login in SauceLab with credential locked
#    When verify element in the page and wait for it
    Then must report has been locked with the text Epic sadface: Sorry, this user has been locked out.


