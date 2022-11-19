package com.grupo1a.grupo1abackend.repositorio;

import com.grupo1a.grupo1abackend.entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorRepositorio extends JpaRepository<Profesor, Long> {
}
