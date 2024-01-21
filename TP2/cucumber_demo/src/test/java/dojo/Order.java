package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails = new ArrayList<>();

    public void declareOwner(String owner) {
        this.owner = owner;
    }

    public void declareTarget(String target) {
        this.target = target;
    }

    public void addCocktail(String cocktail) {
        cocktails.add(cocktail);
    }

    public List<String> getCocktails() {
        return cocktails;
    }

    public boolean isEmpty() {
        return cocktails.isEmpty();
    }
}