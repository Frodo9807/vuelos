package com.example.vuelos.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.vuelos.Entidades.Vuelos;

@Repository
public interface VueloDao extends CrudRepository<Vuelos, Integer> {
	
}
