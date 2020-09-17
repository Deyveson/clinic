package com.br.clinica.repository;

import com.br.clinica.domain.Doutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoutorRespository extends JpaRepository <Doutor, Long> {

}
