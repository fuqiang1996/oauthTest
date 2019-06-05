package com.ktz.oauthdemo.dao;

import com.ktz.oauthdemo.entity.Client;

import java.util.List;

/**
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface ClientDao {

    Client createClient(Client client);
    Client updateClient(Client client);
    void deleteClient(Long clientId);

    Client findOne(Long clientId);

    List<Client> findAll();

    Client findByClientId(String clientId);
    Client findByClientSecret(String clientSecret);

}
