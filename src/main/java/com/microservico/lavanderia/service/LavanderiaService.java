package com.microservico.lavanderia.service;

import com.microservico.lavanderia.domain.Lavanderia;
import com.microservico.lavanderia.dto.LavanderiaDTO;
import com.microservico.lavanderia.repository.LavanderiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LavanderiaService {

    private LavanderiaRepository repository;

    @Autowired
    public LavanderiaService(LavanderiaRepository repository){
        this.repository =  repository;
    }

    public Lavanderia addLavanderia
            (String nome, String endereco, int numeroEndereco, String bairro,
             String zona) {
        return repository.save(new Lavanderia()
                .setNome(nome)
                .setEndereco(endereco)
                .setNumero(numeroEndereco)
                .setBairro(bairro)
                .setZona(zona));
    }

    public LavanderiaDTO criarLavanderia(LavanderiaDTO nova) {
        Lavanderia lavanderia = new Lavanderia(nova);
        Lavanderia savedLavanderia = repository.save(lavanderia);
        return new LavanderiaDTO(savedLavanderia);
    }

    public List<LavanderiaDTO> buscar() {
        List<Lavanderia> lista;

        lista = (List<Lavanderia>) repository.findAll();


        return lista.stream().map(lavanderia -> new LavanderiaDTO(lavanderia)).collect(Collectors.toList());
    }
}
