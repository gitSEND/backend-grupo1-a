package com.grupo1a.grupo1abackend.negocio.Nota;

import com.grupo1a.grupo1abackend.entidades.NotaCabecera;

public interface INotaNegocio {
  public NotaCabecera registrarNotas(NotaCabecera notaCabecera);

  public NotaCabecera consultarNotaPorAlumno(Long alumnoId);
}
