Feature: Is it Friday yet?

  Scenario Outline: is it Friday ?
    Given today is "<day>"
    When I ask whether it's Friday yet
    # Then I should be told "<answer>"