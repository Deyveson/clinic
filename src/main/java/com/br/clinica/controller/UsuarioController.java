package com.br.clinica.controller;

import com.br.clinica.domain.Usuario;
import com.br.clinica.dto.UsuarioDTO;
import com.br.clinica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UsuarioController {

    @Autowired
    UsuarioService userService;

    @RequestMapping(value = "/create", method = RequestMethod.PUT)
    public Usuario registerUsuario(@RequestBody Usuario usuario) {
        return userService.createUser(usuario);
    }

    @RequestMapping(value = "/updtade", method = RequestMethod.POST)
    public Usuario updateUsuario(@RequestBody Usuario usuario) { return userService.updateUsuario(usuario); }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteUsuario(@RequestParam(value = "id", required = true) Long codigo) {
        userService.deleteUsuario(codigo);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Usuario> findAll(){
        return userService.findAll();
    }

}
