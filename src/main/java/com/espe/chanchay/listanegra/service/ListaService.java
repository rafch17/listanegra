package com.espe.chanchay.listanegra.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ListaService {

    public Integer verificarListaNegra(String cedula, String apellido, String nombre) {
        Random random = new Random();
        log.info("Consulta de lista negra de "+cedula+" es: "+random);
        return random.nextInt(101); 
    }
}