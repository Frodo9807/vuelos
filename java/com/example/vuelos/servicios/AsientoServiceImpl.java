package com.example.vuelos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.vuelos.Dao.AsientoDao;
import com.example.vuelos.Entidades.AsientoService;
import com.example.vuelos.Entidades.Asientos;
import com.example.vuelos.Entidades.Vuelos;

@Service
public class AsientoServiceImpl implements AsientoService {

	@Autowired
	private AsientoDao datos;
	@Override
	 @Transactional
	public List<Asientos> listar() {
		// TODO Auto-generated method stub
		return  (List<Asientos>) datos.findAll();
	}

	@Override
	 @Transactional
	public Vuelos encontrarVuelos(Asientos asiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	 @Transactional
	public int save(Asientos asiento) {
		int res=0;
		Asientos a=datos.save(asiento);
		if(!a.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	 @Transactional
	public void delete(Asientos asiento) {
		// TODO Auto-generated method stub
		
	}

}
