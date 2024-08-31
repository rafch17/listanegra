package com.espe.chanchay.listanegra.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.espe.chanchay.listanegra.service.ListaService;

@RestController
public class ListaController {

    private final ListaService listaNegraService;

    public ListaController(ListaService listaNegraService) {
        this.listaNegraService = listaNegraService;
    }

    @GetMapping("/api/v1/listaNegra")
    public Integer verificarListaNegra(@RequestParam String cedula,
                                       @RequestParam String apellido,
                                       @RequestParam String nombre) {
        return listaNegraService.verificarListaNegra(cedula, apellido, nombre);
    }
}
