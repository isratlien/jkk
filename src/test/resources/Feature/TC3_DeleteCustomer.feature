Feature: Delete Customer menu

  @smoke
  Scenario Outline: Manager can delete customer
    Given manager clicks on customer tab
    When Manager identify the customer by name '<firstname>'
    And Delete customer
    Then customer deleted
    Examples:
    |firstname|
    |Lien    |