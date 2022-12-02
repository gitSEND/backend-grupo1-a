package com.grupo1a.grupo1abackend.negocio.profesor;

import com.grupo1a.grupo1abackend.entidades.Profesor;

import java.util.List;

public interface IProfesorNegocio {
  public Profesor registrar(Profesor profesor);
  public Profesor buscar(Long profesorId) throws Exception;
  public List<Profesor> listar();
  public Profesor actualizar(Profesor profesor);

  public boolean delete(Long profesorId);

}
