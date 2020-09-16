package com.br.clinica.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UsuarioDTO {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nick")
    private String nick;

    @Column(name = "password")
    private String password;

    public UsuarioDTO(Long id, String nick, String password) {
        this.id = id;
        this.nick = nick;
        this.password = password;
    }

    public UsuarioDTO() {
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
