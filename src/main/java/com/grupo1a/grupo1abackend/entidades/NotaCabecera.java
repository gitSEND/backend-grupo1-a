package com.grupo1a.grupo1abackend.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "NotaCabecera")
public class NotaCabecera {

  @EmbeddedId
  private NotaKey idNotaCabecera;

  @Column(name = "nota_final")
  private Integer notaFinal;

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

//  @OneToMany(mappedBy = "notaCabeceras", cascade = CascadeType.ALL, orphanRemoval = true)
//  Set<NotaCabecera> listNotaCabecera = new HashSet<NotaCabecera>();


}
