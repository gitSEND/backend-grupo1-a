package com.grupo1a.grupo1abackend.rest;

import com.grupo1a.grupo1abackend.entidades.Alumno;
import com.grupo1a.grupo1abackend.entidades.Profesor;
import com.grupo1a.grupo1abackend.negocio.alumno.AlumnoNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/alumno")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AlumnoRest {
  @Autowired
  private AlumnoNegocio service;

  @GetMapping
  public List<Alumno> listarAlumnos() {
    return service.listar();
  }

  @GetMapping("/{id}")
  public Alumno buscarAlumno(@PathVariable Long id) {
    try {
      return service.buscar(id);
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El ID buscado no existe", e);
    }
  }

  @PostMapping
  public Alumno registrarAlumno(@RequestBody Alumno alumno) {
    return service.registrar(alumno);
  }

  @PutMapping
  public Alumno actualizarAlumno(@RequestBody Alumno alumno) {
    return service.actualizar(alumno);
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
