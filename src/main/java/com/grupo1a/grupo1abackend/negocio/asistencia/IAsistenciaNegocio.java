package com.grupo1a.grupo1abackend.negocio.asistencia;

import com.grupo1a.grupo1abackend.entidades.Asistencia;

import java.util.Date;
import java.util.List;

public interface IAsistenciaNegocio {
  public Asistencia registrarAsistencia(Asistencia listAsistencia);
  public List<Asistencia> listarAsistenciaPorFecha(Date fecha);
}
