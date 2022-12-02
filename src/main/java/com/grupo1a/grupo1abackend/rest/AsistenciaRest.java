package com.grupo1a.grupo1abackend.rest;

import com.grupo1a.grupo1abackend.entidades.Asistencia;
import com.grupo1a.grupo1abackend.negocio.asistencia.AsistenciaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/asistencia")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class AsistenciaRest {

  @Autowired
  private AsistenciaNegocio servicio;

  @GetMapping("/{fecha}")
  public List<Asistencia> listarAsistenciaPorFecha(@PathVariable Date fecha) {
    return servicio.listarAsistenciaPorFecha(fecha);
  }

  @PostMapping
  public List<Asistencia> registrarAsistencia(@RequestBody List<Asistencia> listaAsistencia) {
    return servicio.registrarAsistencia(listaAsistencia);
  }
}
