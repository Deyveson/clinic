package com.br.clinica.service.impl;

import com.br.clinica.domain.Consulta;
import com.br.clinica.repository.ConsultaRepository;
import com.br.clinica.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ConsultaService")
public class ConsultaServiceImpl implements ConsultaService {

    @Autowired
    ConsultaRepository consultaRepository;


    @Override
    public Consulta createConsulta(Consulta consulta){
        return consultaRepository.save(consulta);
    }

    @Override
    public Consulta findConsulta(Long condigo){
        return consultaRepository.getOne(condigo);
    }

    @Override
    public Consulta updateConsulta(Consulta consulta){
        return consultaRepository.save(consulta);
    }

    @Override
    public List<Consulta> findAll(){
        return consultaRepository.findAll();
    }


}
