package com.Project.Market.persistence.crud;

import com.Project.Market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra,Integer> {
    //Trae las compras de un solo Cliente
    Optional<List<Compra>> findByIdCliente(String idCliente);



}
