package com.grupo1a.grupo1abackend.negocio.profesor;

import com.grupo1a.grupo1abackend.entidades.Profesor;
import com.grupo1a.grupo1abackend.repositorio.IProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorNegocio implements IProfesorNegocio {

  @Autowired
  private IProfesorRepositorio repositorio;

  @Override
  public Profesor registrar(Profesor profesor) {
    return repositorio.save(profesor);
  }

  @Override
  public Profesor buscar(Long profesorId) throws Exception {
    return repositorio.findById(profesorId).orElseThrow(() -> new Exception("No se encontró datos con ese ID"));
  }

  @Override
  public List<Profesor> listar() {
    return repositorio.findAll();
  }

  @Override
  public Profesor actualizar(Profesor profesor) {
    return repositorio.save(profesor);
  }

  @Override
  public boolean delete(Long profesorId) {
    repositorio.deleteById(profesorId);
    return true;
  }
}
