#@Pre
Feature: Confirm whether a visa is required to visit the UK
#  @Pre

  Background:
    Given I am on the UKBA website

  Scenario: Japan nationalities coming to UK to study for more than 6 months require Visa
    When I provide nationality of "Japan"
    And I click on the Continue button
    And I select the reason "Study"
    And I click on the Continue button
    And I state I am intending to stay for more than 6 months
    And I submit the form
    Then I will be informed "You’ll need a visa to study in the UK"
  @Pre
  Scenario Outline: Japan nationalities coming to UK to study for more than 6 months require Visa
    When I provide nationality of "<CountryName>"
    And I click on the Continue button
    And I select the reason "Study"
    And I click on the Continue button
    And I state I am intending to stay for more than 6 months
    And I submit the form
    Then I will be informed "You’ll need a visa to study in the UK"
    Examples:
    |CountryName|
    |Japan|
    |Ukraine|
    |Morocco|
    |Canada|
#    @Ang
    Examples:
  |CountryName|
    |Hong Kong|

  @Pre11
  Scenario: Japan nationalities coming to UK for Tourism do not require Visa
    When I provide nationality of "Japan"
    And I click on the Continue button
    And I select the reason as Tourism
    And I submit the form
    Then I will be informed "You will not need a visa to come to the UK"

#  @Ang
  Scenario Outline: Confirm Japan Nationalities require a visa is to Study if here for more than 6 months
    When I select <countryName> as a nationality from the Country drop down
    And I click on the Continue button
    And I select Study option
    And I click on the Continue button
    And I select longer than <int1> months
    And I submit the form
    Then the message <message> will be displayed
    Examples:
      | countryName | int1 | message                                 |
      | "Japan"     | 6    | "You’ll need a visa to study in the UK" |
      | "USA"       | 6    | "You’ll need a visa to study in the UK" |


      | "Malaysia"  | 6    | "You’ll need a visa to study in the UK" |
      | "Canada"    | 6    | "You’ll need a visa to study in the UK" |
    @Test
    Examples:
      | countryName | int1 | message                                 |
      | "Australia" | 6    | "You’ll need a visa to study in the UK" |

    @Pre
    Examples:
      | countryName | int1 | message                                 |
      | "Australia" | 6    | "You’ll need a visa to study in the UK" |
#      | "Hong Kong" | 6    | "You’ll need a visa to study in the UK" |




#  @Pre
  Scenario: Russia nationalities coming to UK for Tourism and not visiting Family will require Visa
    When I provide nationality of "Russia"
    And I click on the Continue button
    And I select the reason as Tourism
    And I click on the Continue button
    And I state that I am not visiting a partner of family
    And I submit the form
    Then I will be informed "You’ll need a visa to come to the UK"