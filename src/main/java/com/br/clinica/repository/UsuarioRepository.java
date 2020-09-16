package com.br.clinica.repository;

import com.br.clinica.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

}
