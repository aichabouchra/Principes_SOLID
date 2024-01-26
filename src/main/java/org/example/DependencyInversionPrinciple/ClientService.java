package org.example.DependencyInversionPrinciple;

public class ClientService {
    private ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }


    /*
        Maintenant, "ServiceClient" dépend d'une abstraction ("ClientRepository") plutôt
        que d'une implémentation concrète. Cela permet d'inverser les dépendances et de
        rendre "ServiceClient" indépendant des détails concrets de la façon dont
        "ClientRepository" est implémenté. C'est un exemple simple d'application du
        principe d'inversion des dépendances.
    */
    public void enregistrerNouveauClient(String nom, String email) {
        Client nouveauClient = new Client(nom, email);
        repository.enregistrerClient(nouveauClient);
        // Autres opérations liées au service client
    }
}
