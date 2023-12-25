Feature: Cocktail Ordering

  As someone, I want to offer a drink to someone else so that we can discuss together (and maybe more).

  Scenario: Creating an empty order
    Given {person1} who wants to buy a drink
    When an order is declared for {person2}
    Then there is no cocktail in the order

  Scenario: Ordering multiple cocktails
    Given {person1} who wants to buy a drink
    When an order is declared for {person2} with {count} cocktails
    Then there are {count} cocktails in the order


    