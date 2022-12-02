package com.grupo1a.grupo1abackend.negocio.alumno;

import com.grupo1a.grupo1abackend.entidades.Alumno;
import com.grupo1a.grupo1abackend.repositorio.IAlumnoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoNegocio implements IAlumnoNegocio{

  @Autowired
  private IAlumnoRepositorio repositorio;


  @Override
  public Alumno registrar(Alumno alumno) {
    return repositorio.save(alumno);
  }

  @Override
  public Alumno buscar(Long alumnoId) throws Exception {
    return repositorio.findById(alumnoId).orElseThrow(() -> new Exception("No se encontró datos con ese ID"));
  }

  @Override
  public List<Alumno> listar() {
    return repositorio.findAll();
  }

  @Override
  public Alumno actualizar(Alumno alumno) {
    return repositorio.save(alumno);
  }

  @Override
  public boolean delete(Long alumnoId) {
    repositorio.deleteById(alumnoId);
    return true;
  }
}
