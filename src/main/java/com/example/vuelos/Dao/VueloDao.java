package com.example.vuelos.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.vuelos.Entidades.Vuelos;

//@Repository
public interface VueloDao extends CrudRepository<Vuelos, Integer> {
}
