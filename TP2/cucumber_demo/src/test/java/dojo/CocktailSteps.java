package dojo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import io.cucumber.cucumberexpressions.ParameterType;


public class CocktailSteps {
    
    private Order order;


    @Given("(.*) who wants to buy a drink")
    public void someoneWantsToBuyADrink(String person1) {
        order = new Order();
        order.declareOwner(person1);
    }

    @When("an order is declared for {person2}")
    public void anOrderIsDeclaredForSomeone(String person2) {
        order.declareTarget(person2);
    }

    @When("an order is declared for {string} with {int} cocktails")
    public void anOrderIsDeclaredForWithCocktails(String person2, int count) {
        order.declareTarget(person2);
        // Ajoutez la logique pour ajouter le nombre spécifié de cocktails à l'ordre
        for (int i = 0; i < count; i++) {
            order.addCocktail("Cocktail" + (i + 1));
        }
    }

    @Then("there are (\\d+) cocktails in the order")
    public void thereAreCocktailsInTheOrder(int count) {
        List<String> cocktails = order.getCocktails();
        assertEquals(count, cocktails.size());
    }

}