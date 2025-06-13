package com.djalves424.cadastro_usuario.infrastructure.repository;

import com.djalves424.cadastro_usuario.infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    void deleteByEmail(String email);
}
