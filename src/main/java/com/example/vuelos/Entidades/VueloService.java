package com.example.vuelos.Entidades;

import java.util.List;

public interface VueloService {
    public List<Vuelos>listar();
    public Vuelos encontrarVuelos(Vuelos huevos);
    public int save(Vuelos huevos);
    public void delete(Vuelos huevos);
}
