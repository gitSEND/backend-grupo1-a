package com.grupo1a.grupo1abackend.negocio.asistencia;

import com.grupo1a.grupo1abackend.entidades.Asistencia;
import com.grupo1a.grupo1abackend.repositorio.IAsistenciaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AsistenciaNegocio implements IAsistenciaNegocio {
  @Autowired
  private IAsistenciaRepositorio repositorio;

  @Override
  public Asistencia registrarAsistencia(Asistencia listAsistencia) {

    return repositorio.saveAll(listAsistencia);
  }

  @Override
  public List<Asistencia> listarAsistenciaPorFecha(Date fecha) {
    return repositorio.findByFecha(fecha);
  }
}
