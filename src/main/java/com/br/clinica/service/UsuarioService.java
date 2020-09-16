package com.br.clinica.service;
import com.br.clinica.domain.Usuario;
import com.br.clinica.dto.UsuarioDTO;

import java.util.List;

public interface UsuarioService {

    Usuario createUser(Usuario usuario);
    UsuarioDTO getUser(String nick, String password);
    Usuario updateUsuario(Usuario usuario);
    void deleteUsuario(Long codigo);
    List<Usuario> findAll();

}
