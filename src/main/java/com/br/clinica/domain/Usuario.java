package com.br.clinica.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Usuario {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nick", columnDefinition = "VARCHAR(50)")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nick;

    @Column(name = "password", columnDefinition = "VARCHAR(50)")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;

    public Usuario(Long id, String nick, String password) {
        this.id = id;
        this.nick = nick;
        this.password = password;
    }

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
