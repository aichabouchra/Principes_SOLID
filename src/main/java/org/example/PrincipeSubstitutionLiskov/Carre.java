package org.example.PrincipeSubstitutionLiskov;

public class Carre extends Forme{
    @Override
    public void dessiner() {
        System.out.println("Dessiner un carré.");
    }

    public void calculerSurface() {
        // Calcul de la surface spécifique au carré
    }
}
