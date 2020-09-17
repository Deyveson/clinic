package com.br.clinica.service.impl;

import com.br.clinica.domain.Doutor;
import com.br.clinica.repository.DoutorRespository;
import com.br.clinica.service.DoutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DoutorService")
public class DoutorServiceImpl implements DoutorService {

    @Autowired
    DoutorRespository doutorRespository;

    @Override
    public Doutor createDoctor(Doutor doutor){
        return doutorRespository.save(doutor);
    }

    @Override
    public Doutor updateDoctor(Doutor doutor){
        return doutorRespository.save(doutor);
    }

    @Override
    public void deleteDoctor(Long id){
        doutorRespository.deleteById(id);
    }

    @Override
    public List<Doutor> allDoutor(){
        return doutorRespository.findAll();
    }

}
