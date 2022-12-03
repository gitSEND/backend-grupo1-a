package com.grupo1a.grupo1abackend.negocio.Nota;

import com.grupo1a.grupo1abackend.entidades.*;
import com.grupo1a.grupo1abackend.repositorio.IAlumnoRepositorio;
import com.grupo1a.grupo1abackend.repositorio.ICursoRepositorio;
import com.grupo1a.grupo1abackend.repositorio.INotaRepositorio;
import com.grupo1a.grupo1abackend.repositorio.IProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotaNegocio implements INotaNegocio {
  @Autowired
  private INotaRepositorio notaRepositorio;

  @Autowired
  private IAlumnoRepositorio alumnoRepositorio;

  @Autowired
  private IProfesorRepositorio profesorRepositorio;

  @Autowired
  private ICursoRepositorio cursoRepositorio;

  @Override
  public NotaCabecera registrarNotas(NotaCabecera notaCabecera) {
    for (NotaDetalle notaDetalle : notaCabecera.getListNotaDetalle()) {
      Alumno alumno = new Alumno();
      alumno = alumnoRepositorio.findById(notaDetalle.getNotaDetalleId().getIdAlumno()).orElse(null);

      Profesor profesor = new Profesor();
      profesor = profesorRepositorio.findById(notaDetalle.getNotaDetalleId().getIdProfesor()).orElse(null);

      Curso curso = new Curso();
      curso = cursoRepositorio.findById(notaDetalle.getNotaDetalleId().getIdCurso()).orElse(null);

      notaDetalle.setObjNotaCabe(notaCabecera);

      notaDetalle.setObjCurso(curso);
      notaDetalle.setObjAlumno(alumno);
      notaDetalle.setObjProfesor(profesor);
    }

    return notaRepositorio.save(notaCabecera);
  }

  @Override
  public NotaCabecera consultarNotaPorAlumno(Long alumnoId) {
    return null;
  }
}
