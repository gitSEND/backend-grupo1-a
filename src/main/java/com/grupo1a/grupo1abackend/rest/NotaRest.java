package com.grupo1a.grupo1abackend.rest;

import com.grupo1a.grupo1abackend.entidades.NotaCabecera;
import com.grupo1a.grupo1abackend.negocio.Nota.NotaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nota")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class NotaRest {

  @Autowired
  private NotaNegocio service;

  @PostMapping
  public NotaCabecera registrarNota(@RequestBody NotaCabecera notaCabecera) {
    return service.registrarNotas(notaCabecera);
  }
}
