package org.example.PrincipeSubstitutionLiskov;

public class Cercle extends Forme{
    @Override
    public void dessiner() {
        System.out.println("Dessiner un cercle.");
    }

    public void calculerSurface() {
        // Calcul de la surface spécifique au cercle
    }
}
