package com.grupo10.vet_api_clientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo10.vet_api_clientes.model.Cliente;
import com.grupo10.vet_api_clientes.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clientesRepository;

    @Override
    public List<Cliente> findAll() {
        return clientesRepository.findAll();
    }    

    @Override
    public Cliente save(Cliente cliente) {
        return clientesRepository.save(cliente);
    }

}
