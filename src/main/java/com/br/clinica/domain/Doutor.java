package com.br.clinica.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Doutor {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", columnDefinition = "VARCHAR(50)")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nome;

    @Column(name = "crm", columnDefinition = "VARCHAR(50)")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String crm;

    @Column(name = "especialidade", columnDefinition = "VARCHAR(50)")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String especialidade;

    public Doutor() {
    }

    public Doutor(Long id, String nome, String crm, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
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

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
