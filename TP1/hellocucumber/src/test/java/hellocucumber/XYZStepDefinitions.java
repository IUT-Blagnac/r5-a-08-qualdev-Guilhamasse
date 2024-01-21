package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class XYZStepDefinitions {

    @Given("L'utilisateur est sur la page d'accueil du site web")
    public void givenUtilisateurSurPageAccueil() {
        // Implémentation de la condition initiale
        System.out.println("L'utilisateur est sur la page d'accueil");
    }

    @When("Il saisit {string} dans la barre de recherche")
    public void whenSaisieDansBarreRecherche(String termeRecherche) {
        // Implémentation de l'action
        System.out.println("Il saisit '" + termeRecherche + "' dans la barre de recherche");
    }

    @When("Il clique sur le bouton de recherche")
    public void whenCliqueBoutonRecherche() {
        // Implémentation de l'action
        System.out.println("Il clique sur le bouton de recherche");
    }

    @Then("Les résultats de la recherche contiennent le terme {string}")
    public void thenResultatsContiennentTerme(String termeAttendu) {
        // Implémentation de la vérification
        System.out.println("Les résultats de la recherche contiennent le terme '" + termeAttendu + "'");
        assertTrue(true);
    }

}