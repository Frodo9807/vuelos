package com.example.vuelos.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.vuelos.Entidades.VueloService;
import com.example.vuelos.Entidades.Vuelos;

@Controller
public class Controlador {

    @Autowired
    private VueloService service;



    @GetMapping("/listar")
    public String listar(Model model){
        List<Vuelos> vuelos = service.listar();
        model.addAttribute("vuelos", vuelos);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model modelo){
        modelo.addAttribute ("vuelos", new Vuelos());
        return "formulario";
    }

    @PostMapping("/save")
    public String save (@Validated Vuelos vuelos, Model model){
        service.save(vuelos);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(Vuelos vuelos,Model model){
    	vuelos= service.encontrarVuelos(vuelos);
        model.addAttribute("huevo", vuelos);
        return "formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(Vuelos vuelos){
        service.delete(vuelos);
        return "redirect:/listar";
    }
}
