package com.grupo1a.grupo1abackend.rest;

import com.grupo1a.grupo1abackend.entidades.Alumno;
import com.grupo1a.grupo1abackend.entidades.Curso;
import com.grupo1a.grupo1abackend.negocio.curso.CursoNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/curso")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CursoRest {
  @Autowired
  private CursoNegocio service;

  @GetMapping
  public List<Curso> listarCursos() {
    return service.listar();
  }

  @GetMapping("/{id}")
  public Curso buscarCurso(@PathVariable Long id) {
    try {
      return service.buscar(id);
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El ID buscado no existe", e);
    }
  }

  @PostMapping
  public Curso registrarCurso(@RequestBody Curso curso) {
    return service.registrar(curso);
  }

  @PutMapping
  public Curso actualizarAlumno(@RequestBody Curso curso) {
    return service.actualizar(curso);
  }

  @DeleteMapping("/{id}")
  public boolean eliminarAlumno(@PathVariable Long id) {
    try {
      return service.delete(id);
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El ID no existe", e);
    }
  }
}
