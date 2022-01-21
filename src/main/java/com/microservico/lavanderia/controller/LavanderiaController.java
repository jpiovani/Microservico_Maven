package com.microservico.lavanderia.controller;

import com.microservico.lavanderia.dto.LavanderiaDTO;
import com.microservico.lavanderia.service.LavanderiaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@ComponentScan("com.modulo4")
@RequestMapping("lavanderias/v1")
public class LavanderiaController {


    private LavanderiaService service;

    @Autowired
    public LavanderiaController(LavanderiaService service){
        this.service = service;
    }

    @CrossOrigin
    @GetMapping
    public List<LavanderiaDTO> getLavanderia(){

        return service.buscar();

    }

    @CrossOrigin
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public LavanderiaDTO add (@RequestBody LavanderiaDTO nova){

        return service.criarLavanderia(nova);
    }

}
