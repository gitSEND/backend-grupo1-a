package com.grupo1a.grupo1abackend.repositorio;

import com.grupo1a.grupo1abackend.entidades.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface IAsistenciaRepositorio extends JpaRepository<Asistencia, Long> {

  List<Asistencia>findByFecha(Date fecha);
}
