package dojo;

import io.cucumber.cucumberexpressions.ParameterType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CucumberConfig {

    @Given("{person1} who wants to buy a drink")
    public void romeoWantsToBuyADrink(String person1) {
        // Votre implémentation actuelle
    }

    @When("an order is declared for {person2}")
    public void anOrderIsDeclaredForPerson2(String person2) {
        // Votre implémentation actuelle
    }

    @When("an order is declared for {person2} with {count} cocktails")
    public void anOrderIsDeclaredForPerson2WithCocktails(String person2, int count) {
        // Votre implémentation actuelle
    }

    @When("there are {count} cocktails in the order")
    public void thereAreCocktailsInTheOrder(int count) {
        // Votre implémentation actuelle
    }

}
