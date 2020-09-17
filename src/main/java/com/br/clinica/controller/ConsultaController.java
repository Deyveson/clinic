package com.br.clinica.controller;

import com.br.clinica.domain.Consulta;
import com.br.clinica.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/consulta")
public class ConsultaController {

    @Autowired
    ConsultaService consultaService;

    @RequestMapping(value = "/create", method = RequestMethod.PUT)
    public Consulta registerConsulta(@RequestBody Consulta consulta){
        return consultaService.createConsulta(consulta);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public Consulta findConsulta (@RequestParam(value = "id", required = true) Long codigo){
        return consultaService.findConsulta(codigo);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Consulta updateConsulta (@RequestBody Consulta consulta) {
        return consultaService.updateConsulta(consulta);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Consulta> findAll(){
        return consultaService.findAll();
    }

}
