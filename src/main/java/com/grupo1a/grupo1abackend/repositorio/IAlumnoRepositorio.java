package com.grupo1a.grupo1abackend.repositorio;

import com.grupo1a.grupo1abackend.entidades.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlumnoRepositorio extends JpaRepository<Alumno, Long> {
}
