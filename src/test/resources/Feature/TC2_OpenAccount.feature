Feature: Open Account tab

    @smoke
    Scenario: Manager open account
        Given manager clicks on customer name tab
        When clicks on add customer choose the name of the customer
        And Currency tab to choose the currency
        And clicks on process button
        Then go to the next



