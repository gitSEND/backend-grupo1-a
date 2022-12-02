package com.grupo1a.grupo1abackend.negocio.curso;

import com.grupo1a.grupo1abackend.entidades.Curso;
import com.grupo1a.grupo1abackend.repositorio.ICursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoNegocio implements ICursoNegocio{
  @Autowired
  private ICursoRepositorio  repositorio;

  @Override
  public Curso registrar(Curso curso) {
    return repositorio.save(curso);
  }

  @Override
  public Curso buscar(Long cursoId) throws Exception {
    return repositorio.findById(cursoId).orElseThrow(() -> new Exception("No se encontró datos con ese ID"));
  }

  @Override
  public List<Curso> listar() {
    return repositorio.findAll();
  }

  @Override
  public Curso actualizar(Curso curso) {
    return repositorio.save(curso);
  }

  @Override
  public boolean delete(Long cursoId) {
    repositorio.deleteById(cursoId);
    return true;
  }
}
