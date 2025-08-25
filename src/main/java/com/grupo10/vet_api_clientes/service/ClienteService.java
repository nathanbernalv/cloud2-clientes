package com.grupo10.vet_api_clientes.service;

import java.util.List;

import com.grupo10.vet_api_clientes.model.Cliente;

public interface ClienteService {

    List<Cliente> findAll();
    Cliente save(Cliente cliente);

}
