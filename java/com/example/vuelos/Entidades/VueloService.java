package com.example.vuelos.Entidades;

import java.util.List;

public interface VueloService {
    public List<Vuelos>listar();
    public Vuelos encontrarVuelos(Vuelos vuelo);
    public int save(Vuelos vuelo);
    public void delete(Vuelos vuelo);
}
