package dojo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class CocktailSteps {
    
    private Order order;


    @Given("Romeo who wants to buy a drink")
    public void romeoWantsToBuyADrink() {
        order = new Order();
        order.declareOwner("Romeo");
    }

    @When("an order is declared for Juliette")
    public void anOrderIsDeclaredForJuliette() {
        order.declareTarget("Juliette");

    }

    @Then("there is no cocktail in the order")
    public void thereIsNoCocktailInTheOrder() {
        List<String> cocktails =  order.getCocktails();
        assertEquals(0, cocktails.size());
    }
}