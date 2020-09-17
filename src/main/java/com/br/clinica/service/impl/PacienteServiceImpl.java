package com.br.clinica.service.impl;

import com.br.clinica.domain.Paciente;
import com.br.clinica.repository.PacienteRepository;
import com.br.clinica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("PacienteService")
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public Paciente createPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    @Override
    public Paciente updatePaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    @Override
    public void deletePaciente(Long id){
        pacienteRepository.deleteById(id);
    }

    @Override
    public List<Paciente> allPaciente(){
        return pacienteRepository.findAll();
    }

}
