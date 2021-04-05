Feature: As a User, I want to be able to Register an account on the Mercury tours site

#  @F1
#Scenario: 1 Register by  entering contact information and User information
  Scenario Outline: Register by  entering contact information and User information
    Given I am on the Newtours Landing page
    When i Click on "REGISTER" link
    And I enter all the contact information as "<FirstName>", "<LastName>", "<PhoneNUmber>" and "<Email>"
    And I enter User information as "<Username>" and "<Password>"
    Then I should be able to create a new User and verify with "<FirstName>", "<LastName>" and "<Username>"
    Examples:
      | FirstName | LastName | PhoneNUmber | Email           | Username      | Password |
      | kent      | Abdul    | 078836656   | boggy@gmail.com | myNewUsername | 12345    |
