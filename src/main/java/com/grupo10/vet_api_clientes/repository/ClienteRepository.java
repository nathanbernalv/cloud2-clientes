package com.grupo10.vet_api_clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo10.vet_api_clientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
