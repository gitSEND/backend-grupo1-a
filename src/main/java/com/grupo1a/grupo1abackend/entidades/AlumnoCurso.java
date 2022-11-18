package com.grupo1a.grupo1abackend.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AlumnoCurso")
public class AlumnoCurso {

  @EmbeddedId
  private AlumnoCursoKey idAlumnoCurso;

  @Column(name = "activo")
  private Boolean activo;

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
}
