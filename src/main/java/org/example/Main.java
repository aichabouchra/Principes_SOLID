package org.example;

import org.example.PrincipeSubstitutionLiskov.Carre;
import org.example.PrincipeSubstitutionLiskov.Cercle;
import org.example.PrincipeSubstitutionLiskov.Forme;
import org.example.PrincipeSubstitutionLiskov.UtilisateurDeForme;

public class Main {
    public static void main(String[] args) {
        UtilisateurDeForme utilisateur = new UtilisateurDeForme();

        // Utilisation d'un cercle
        utilisateur.afficherDessin(new Cercle());

        // Utilisation d'un carré
        utilisateur.afficherDessin(new Carre());

        // Utilisation de la classe de base
        utilisateur.afficherDessin(new Forme());
    }
}