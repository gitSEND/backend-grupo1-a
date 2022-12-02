package com.grupo1a.grupo1abackend.repositorio;

import com.grupo1a.grupo1abackend.entidades.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepositorio extends JpaRepository<Curso, Long> {
}
