package com.br.clinica.service;

import com.br.clinica.domain.Consulta;

import java.util.List;

public interface ConsultaService {

    Consulta createConsulta(Consulta consulta);
    Consulta findConsulta(Long codigo);
    Consulta updateConsulta(Consulta consulta);
    List<Consulta> findAll();

}
