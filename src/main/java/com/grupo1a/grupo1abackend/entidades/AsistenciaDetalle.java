package com.grupo1a.grupo1abackend.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AsistenciaDetalle")
public class AsistenciaDetalle {
  @EmbeddedId
  private AsistenciaKey idAsistenciaDetalle;

  @Column(name = "presente")
  private boolean presente;


  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("idAsistencia")
  @JoinColumn(name = "id_asistencia")
  @JsonIgnore
  private Asistencia objAsistencia;

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
