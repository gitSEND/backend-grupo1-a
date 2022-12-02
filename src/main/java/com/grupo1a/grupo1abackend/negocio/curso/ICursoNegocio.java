package com.grupo1a.grupo1abackend.negocio.curso;

import com.grupo1a.grupo1abackend.entidades.Curso;

import java.util.List;

public interface ICursoNegocio {
  public Curso registrar(Curso curso);
  public Curso buscar(Long cursoId) throws Exception;
  public List<Curso> listar();
  public Curso actualizar(Curso curso);
  public boolean delete(Long cursoId);
}
