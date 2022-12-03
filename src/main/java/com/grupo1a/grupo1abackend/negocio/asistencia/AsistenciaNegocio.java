package com.grupo1a.grupo1abackend.negocio.asistencia;

import com.grupo1a.grupo1abackend.entidades.*;
import com.grupo1a.grupo1abackend.repositorio.IAlumnoRepositorio;
import com.grupo1a.grupo1abackend.repositorio.IAsistenciaRepositorio;
import com.grupo1a.grupo1abackend.repositorio.ICursoRepositorio;
import com.grupo1a.grupo1abackend.repositorio.IProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsistenciaNegocio implements IAsistenciaNegocio {
  @Autowired
  private IAsistenciaRepositorio asistenciaRepositorio;

  @Autowired
  private IAlumnoRepositorio alumnoRepositorio;

  @Autowired
  private IProfesorRepositorio profesorRepositorio;

  @Autowired
  private ICursoRepositorio cursoRepositorio;

  @Override
  public Asistencia registrarAsistencia(Asistencia asistencia) {
    for (AsistenciaDetalle asistenciaDetalle : asistencia.getListAsistenciaDetalle()) {
      Alumno alumno = new Alumno();
      alumno = alumnoRepositorio.findById(asistenciaDetalle.getIdAsistenciaDetalle().getIdAlumno()).orElse(null);

      Profesor profesor = new Profesor();
      profesor = profesorRepositorio.findById(asistenciaDetalle.getIdAsistenciaDetalle().getIdProfesor()).orElse(null);

      Curso curso = new Curso();
      curso = cursoRepositorio.findById(asistenciaDetalle.getIdAsistenciaDetalle().getIdCurso()).orElse(null);

      asistenciaDetalle.setObjAsistencia(asistencia);

      asistenciaDetalle.setObjCurso(curso);
      asistenciaDetalle.setObjAlumno(alumno);
      asistenciaDetalle.setObjProfesor(profesor);
    }
    return asistenciaRepositorio.save(asistencia);
  }

  @Override
  public List<Asistencia> listarAsistenciaPorFecha(String fecha) {
    return asistenciaRepositorio.findByFecha(fecha);
  }
}
