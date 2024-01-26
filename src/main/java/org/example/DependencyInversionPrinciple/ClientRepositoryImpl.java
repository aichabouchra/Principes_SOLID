package org.example.DependencyInversionPrinciple;

public class ClientRepositoryImpl implements ClientRepository{
    @Override
    public void enregistrerClient(Client client) {
        // Logique de sauvegarde dans la base de données
    }
}
