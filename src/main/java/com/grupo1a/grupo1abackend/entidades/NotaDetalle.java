package com.grupo1a.grupo1abackend.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "NotaDetalle")
public class NotaDetalle {

  @EmbeddedId
  private NotaKey notaDetalleId;

  @Column(name = "nota_partipacion")
  private int notaParticipacion;

  @Column(name = "nota_tarea_1")
  private int notaTareaOne;

  @Column(name = "nota_tarea_2")
  private int notaTareatwo;

  @Column(name = "nota_parcial_1")
  private int notaParcialOne;

  @Column(name = "nota_parcial_2")
  private int notaParcialTwo;

  @Column(name = "nota_examen_final")
  private int notaExamenFinal;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("idNota")
  @JoinColumn(name = "id_nota")
  @JsonIgnore
  private NotaCabecera objNotaCabe;

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
