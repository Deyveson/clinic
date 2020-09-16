package com.br.clinica.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Paciente {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", columnDefinition = "VARCHAR(50)")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nome;

    @Column(name = "idade", columnDefinition = "VARCHAR(50)")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer idade;

    @Column(name = "cpf", columnDefinition = "VARCHAR(50)")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cpf;

    public Paciente(Long id, String nome, Integer idade, String cpf) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Paciente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
