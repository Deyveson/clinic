package com.br.clinica.controller;

import com.br.clinica.domain.Paciente;
import com.br.clinica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @RequestMapping(value = "/create", method = RequestMethod.PUT)
    public Paciente registerPaciente(@RequestBody Paciente paciente){
        return pacienteService.createPaciente(paciente);
    }

    @RequestMapping(value = "/updtade", method = RequestMethod.POST)
    public Paciente updatePaciente(@RequestBody Paciente paciente){
        return pacienteService.updatePaciente(paciente);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deletePaciente(@RequestParam(value = "id", required = true) Long codigo){
        pacienteService.deletePaciente(codigo);
    }

    @RequestMapping(value = "/findall", method = RequestMethod.GET)
    public List<Paciente> findAll(){
        return pacienteService.allPaciente();
    }


}
