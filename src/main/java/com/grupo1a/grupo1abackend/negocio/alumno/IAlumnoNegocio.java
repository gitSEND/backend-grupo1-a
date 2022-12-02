package com.grupo1a.grupo1abackend.negocio.alumno;

import com.grupo1a.grupo1abackend.entidades.Alumno;

import java.util.List;

public interface IAlumnoNegocio {
  public Alumno registrar(Alumno alumno);
  public Alumno buscar(Long alumnoId) throws Exception;
  public List<Alumno> listar();
  public Alumno actualizar(Alumno alumno);
  public boolean delete(Long alumnoId);
}
