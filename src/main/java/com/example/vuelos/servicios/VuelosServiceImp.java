package com.example.vuelos.servicios;

import com.example.vuelos.Dao.VueloDao;
import com.example.vuelos.Entidades.Vuelos;
import com.example.vuelos.Entidades.VueloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VuelosServiceImp implements VueloService {
    @Autowired
    private VueloDao datos;
    @Override
    @Transactional
    public List<Vuelos> listar() {
        return (List<Vuelos>) datos.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Vuelos encontrarVuelos(Vuelos vuelos) {
        return datos.findById(vuelos.getId()).orElse(null);
    }

    @Override
    @Transactional
    public int save(Vuelos huevos) {
        int res = 0;
        Vuelos h = datos.save(huevos);
        if(!h.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    @Transactional
    public void delete(Vuelos huevos) {
        datos.delete(huevos);
    }
}
