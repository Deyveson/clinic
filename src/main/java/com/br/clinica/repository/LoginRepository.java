package com.br.clinica.repository;

import com.br.clinica.dto.UsuarioDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoginRepository extends JpaRepository <UsuarioDTO, Long>{

    @Query(value = "SELECT ID, NICK, PASSWORD FROM USUARIO U WHERE NICK = ?1 AND PASSWORD = ?2", nativeQuery = true)
    UsuarioDTO findUsuario(@Param("nick") String nick, @Param("password") String password);

}
