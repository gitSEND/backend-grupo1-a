package com.grupo1a.grupo1abackend.rest;

import com.grupo1a.grupo1abackend.entidades.Asistencia;
import com.grupo1a.grupo1abackend.negocio.asistencia.AsistenciaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/asistencia")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class AsistenciaRest {

  @Autowired
  private AsistenciaNegocio servicio;

  @GetMapping("/{fecha}")
  public List<Asistencia> listarAsistenciaPorFecha(@PathVariable String fecha) throws ParseException {
    return servicio.listarAsistenciaPorFecha(fecha);
  }

  @PostMapping
  public Asistencia registrarAsistencia(@RequestBody Asistencia asistencia) {
    return servicio.registrarAsistencia(asistencia);
  }
}
