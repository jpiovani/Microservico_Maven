package com.microservico.lavanderia.domain;

import com.microservico.lavanderia.dto.LavanderiaDTO;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Lavanderia")
public class Lavanderia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String nome;
    @NotNull
    private String endereco;
    @NotNull
    private int numero;
    @NotNull
    private String bairro;
    @NotNull
    private String zona;

    public Lavanderia(){

    }

    public Lavanderia(LavanderiaDTO lavanderia) {
        setNome(lavanderia.getNome());
        setBairro(lavanderia.getBairro());
        setEndereco(lavanderia.getEndereco());
        setZona(lavanderia.getZona());
        setNumero(lavanderia.getNumeroEndereco());
    }

    public Lavanderia(final long id, final String nome, final String endereco, final int numero,
                      final String bairro, final String zona){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.zona = zona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lavanderia that = (Lavanderia) o;
        return numero == that.numero && Objects.equals(nome, that.nome) && Objects.equals(endereco, that.endereco) && Objects.equals(bairro, that.bairro) && Objects.equals(zona, that.zona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, endereco, numero, bairro, zona);
    }

    public String getNome() {
        return nome;
    }

    public Lavanderia setNome(final String nome) {
        this.nome = nome;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Lavanderia setEndereco(final String endereco) {
        this.endereco = endereco;
        return this;
    }

    public int getNumero() {
        return numero;
    }

    public Lavanderia setNumero(final int numeroEndereco) {
        this.numero = numeroEndereco;
        return this;
    }

    public String getBairro() {
        return bairro;
    }

    public Lavanderia setBairro(final String bairro) {
        this.bairro = bairro;
        return this;
    }

    public String getZona() {
        return zona;
    }

    public Lavanderia setZona(final String zona) {
        this.zona = zona;
        return this;
    }

    @Override
    public String toString() {
        return "Lavanderia{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                ", zona='" + zona + '\'' +
                '}';
    }
}
