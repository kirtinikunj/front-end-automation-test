Feature: Search Feature

  @author_Kirti
  Scenario: User should able to navigate to searched page
    Given I am on homepage
    When I click on search icon
    And I select Gold Rush Express game
    Then I should navigate to that page
