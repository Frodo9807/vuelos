package com.example.vuelos.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.vuelos.Entidades.Asientos;

@Repository
public interface AsientoDao extends CrudRepository<Asientos, Integer> {

}
