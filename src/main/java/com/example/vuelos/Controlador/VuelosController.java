package com.example.vuelos.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.vuelos.Entidades.Vuelos;
import com.example.vuelos.Entidades.VueloService;

@RestController
@RequestMapping(value="/vuelos")
public class VuelosController {
	
	@Autowired
	private VueloService vuelosservice;

	
	@GetMapping("/listado")
	public ResponseEntity<List<Vuelos>>listVuelos(){
			List<Vuelos> vuelos=vuelosservice.listar();
			if(vuelos.isEmpty()) {
				return ResponseEntity.noContent().build();
			}
		return ResponseEntity.ok(vuelos);
		
	}
	
}
