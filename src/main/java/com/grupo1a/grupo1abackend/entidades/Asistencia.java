package com.grupo1a.grupo1abackend.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Asistencia")
public class Asistencia {
  @EmbeddedId
  private AsistenciaKey idAsistencia;

  @Column(name = "fecha")
  private Date fecha;

  @Column(name = "presente")
  private boolean presente;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("idAlumno")
  @JoinColumn(name = "id_alumno")
  @JsonIgnore
  private Alumno objAlumno;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("idCurso")
  @JoinColumn(name = "id_curso")
  @JsonIgnore
  private Curso objCurso;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("idProfesor")
  @JoinColumn(name = "id_profesor")
  @JsonIgnore
  private Profesor objProfesor;
}
