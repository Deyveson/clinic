package com.br.clinica.service;

import com.br.clinica.domain.Doutor;

import java.util.List;

public interface DoutorService {

    Doutor createDoctor(Doutor doutor);
    Doutor updateDoctor(Doutor doutor);
    void deleteDoctor(Long codigo);
    List<Doutor> allDoutor();

}
