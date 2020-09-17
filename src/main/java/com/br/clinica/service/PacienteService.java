package com.br.clinica.service;

import com.br.clinica.domain.Paciente;

import java.util.List;

public interface PacienteService  {

    Paciente createPaciente(Paciente paciente);
    Paciente updatePaciente(Paciente paciente);
    void deletePaciente(Long id);
    List<Paciente> allPaciente();

}
