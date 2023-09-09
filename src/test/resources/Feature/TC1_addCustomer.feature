Feature: Add New Customer

  @smoke
  Scenario Outline: Manager adds a customer
    Given Manager lands on XYZ bank home page
    When manager clicks on bank manager login option
    And clicks on add customer tab
    And sends customer '<firstName>' and '<LastName>' and '<PostCode>'
    And clicks on add customer button
    Then go to the next page

    Examples:
    |firstName|LastName|PostCode|
    |Lien     |Israt   |1200    |