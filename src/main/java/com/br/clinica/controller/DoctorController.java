package com.br.clinica.controller;

import com.br.clinica.domain.Doutor;
import com.br.clinica.domain.Paciente;
import com.br.clinica.service.DoutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/doutores")
public class DoctorController {


    @Autowired
    DoutorService doutorService;

    @RequestMapping(value = "/create", method = RequestMethod.PUT)
    public Doutor registerDoutor(@RequestBody Doutor doutor){
        return doutorService.createDoctor(doutor);
    }

    @RequestMapping(value = "/updtade", method = RequestMethod.POST)
    public Doutor updateDouctor(@RequestBody Doutor doutor){

        return doutorService.updateDoctor(doutor);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deletePaciente(@RequestParam(value = "id", required = true) Long codigo){
        doutorService.deleteDoctor(codigo);
    }

    @RequestMapping(value = "/findall", method = RequestMethod.GET)
    public List<Doutor> findAll(){
        return doutorService.allDoutor();
    }

}
