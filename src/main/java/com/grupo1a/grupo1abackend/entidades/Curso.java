package com.grupo1a.grupo1abackend.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Curso")
public class Curso {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_curso")
  private Long idCurso;

  @Column(name = "nombre_curso")
  private String nombreCurso;

  @Column(name = "activo")
  private boolean activo;

  @OneToMany(mappedBy = "objCurso", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonIgnore
  Set<AlumnoCurso> listAlumnoCurso = new HashSet<AlumnoCurso>();

  @OneToMany(mappedBy = "objCurso", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonIgnore
  Set<AsistenciaDetalle> listAsistenciaDetalle = new HashSet<AsistenciaDetalle>();

  @OneToMany(mappedBy = "objCurso", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonIgnore
  Set<CursoProfesor> listCursoProfesor = new HashSet<CursoProfesor>();

  @OneToMany(mappedBy = "objCurso", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonIgnore
  Set<NotaDetalle> listNotaDetalle = new HashSet<NotaDetalle>();
}
