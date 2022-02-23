package com.example.vuelos.Entidades;

import java.util.List;

public interface AsientoService {
	public List<Asientos>listar();
    public Vuelos encontrarVuelos(Asientos asiento);
    public int save(Asientos asiento);
    public void delete(Asientos asiento);
}
