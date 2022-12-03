package com.grupo1a.grupo1abackend.negocio.asistencia;

import com.grupo1a.grupo1abackend.entidades.Asistencia;


import java.util.List;

public interface IAsistenciaNegocio {
  public Asistencia registrarAsistencia(Asistencia asistencia);

  public List<Asistencia> listarAsistenciaPorFecha(String fecha);
}
