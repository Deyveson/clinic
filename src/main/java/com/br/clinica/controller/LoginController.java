package com.br.clinica.controller;

import com.br.clinica.dto.UsuarioDTO;
import com.br.clinica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    UsuarioService userService;

    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
    public UsuarioDTO searchUsuario(@RequestParam(value = "nick", required = true) String nick,
                                    @RequestParam(value = "password", required = true) String password){
        return userService.getUser(nick, password);
    }

}
