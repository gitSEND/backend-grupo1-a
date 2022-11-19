package com.grupo1a.grupo1abackend.rest;

import com.grupo1a.grupo1abackend.entidades.Profesor;
import com.grupo1a.grupo1abackend.negocio.ProfesorNegocio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/profesor")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ProfesorRest {

  @Autowired
  private ProfesorNegocio service;

  Logger logger = LoggerFactory.getLogger(ProfesorRest.class);

  @GetMapping
  public List<Profesor> listarProfesores() {
    logger.info("Se llamó a listar todos los profesores");
    return service.listar();
  }

  @GetMapping("/{id}")
  public Profesor buscarProfesor(@PathVariable Long id) {
    try {
      return service.buscar(id);
    } catch (Exception e) {
      logger.warn("El ID buscado no existe");
      throw new ResponseStatusException(HttpStatus.NOT_FOUND,"El ID buscado no existe",e);
    }
  }

  @PostMapping
  public Profesor registrarProfesor(@RequestBody Profesor profesor) {
    logger.info("Se llamó al método de registrar profesor");
    return service.registrar(profesor);
  }

  @PutMapping
  public Profesor actualizarProfesor(@RequestBody Profesor profesor) {
    return service.actualizar(profesor);
  }

}
