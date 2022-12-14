package com.grupo1a.grupo1abackend.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Embeddable
public class NotaKey implements Serializable {
  @Column(name = "id_alumno")
  private Long idAlumno;

  @Column(name = "id_profesor")
  private Long idProfesor;

  @Column(name = "id_curso")
  private Long idCurso;

  @Column(name = "id_nota")
  private Long idNota;
}
