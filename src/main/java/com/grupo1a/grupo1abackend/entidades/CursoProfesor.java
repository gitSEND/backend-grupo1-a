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
@Table(name = "CursoProfesor")
public class CursoProfesor {
  @EmbeddedId
  private CursoProfesorKey idCursoProfesor;

  @Column(name = "activo")
  private Boolean activo;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("idProfesor")
  @JoinColumn(name = "id_profesor")
  @JsonIgnore
  private Profesor objProfesor;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("idCurso")
  @JoinColumn(name = "id_curso")
  @JsonIgnore
  private Curso objCurso;

}
