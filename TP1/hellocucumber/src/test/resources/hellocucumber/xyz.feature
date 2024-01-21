Feature: Recherche sur un site web

Scenario: Utilisateur effectue une recherche
  Given L'utilisateur est sur la page d'accueil du site web
  When Il saisit "Cucumber" dans la barre de recherche
  And Il clique sur le bouton de recherche
  Then Les résultats de la recherche contiennent le terme "BDD"
