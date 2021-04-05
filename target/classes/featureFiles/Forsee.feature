Feature:  Test move to element
  @Foresee
  Scenario: how to do mouse movement
    Given I am on the Forsee home page
    When I click on Webinars
    Then I should see 6 Webinars

@Forseeeee
  Scenario: Confirming sections under Solutions -> Methodology sub menu
    Given I have logged into the Foresee Website
    When I navigate to "Solutions"
    And I click "Methodology"
    Then the "Prescriptive" methodology section is displayed
    And the "Predictive" methodology section is displayed
    And the "Benchmarkable" methodology section is displayed
    And the page header "The Verint Methodology" is displayed
#@F1
  Scenario: how to contact
    Given I am on the Forsee home page
    When I click on contact and click submit
    Then I should see "The Information Provided is Incomplete or Invalid."