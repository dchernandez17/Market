package com.Project.Market.persistence.crud;

import com.Project.Market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //@Query(value= "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery= true)
    //public List<Producto> getByCategoria(int idCategoria);

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);


    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);



}
