package com.br.clinica.service.impl;

import com.br.clinica.domain.Usuario;
import com.br.clinica.dto.UsuarioDTO;
import com.br.clinica.repository.LoginRepository;
import com.br.clinica.repository.UsuarioRepository;
import com.br.clinica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository userRepository;

    @Autowired
    LoginRepository loginRepository;

    @Override
    public Usuario createUser(Usuario usuario){
        userRepository.save(usuario);
        return usuario;
    };

    @Override
    public UsuarioDTO getUser(String nick, String password){
        return loginRepository.findUsuario(nick, password);
    };

    @Override
    public Usuario updateUsuario(Usuario usuario){
        return userRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Long codigo){
        userRepository.deleteById(codigo);
    }

    @Override
    public List<Usuario> findAll(){
        return userRepository.findAll();
    }

}
