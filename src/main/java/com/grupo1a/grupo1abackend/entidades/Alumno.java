package com.grupo1a.grupo1abackend.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Alumno")
public class Alumno {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_alumno")
  private Long idAlumno;

  @Column(name = "nombre_alumno")
  private String nombreAlumno;

  @Column(name = "apellido_alumno")
  private String apellidoAlumno;

  @Column(name = "fecha_alumno")
  private Date fechaIngreso;

  @Column(name = "genero")
  private String genero;

  @Column(name = "correo_personal")
  private String correoPersonal;

  @Column(name = "celular_personal")
  private String celularPersonal;

  @Column(name = "activo")
  private boolean activo;

  @OneToMany(mappedBy = "objAlumno", cascade = CascadeType.ALL, orphanRemoval = true)
  Set<AlumnoCurso> listAlumnoCurso = new HashSet<AlumnoCurso>();

  @OneToMany(mappedBy = "objAlumno", cascade = CascadeType.ALL, orphanRemoval = true)
  Set<Asistencia> listAsistencia = new HashSet<Asistencia>();

  @OneToMany(mappedBy = "objAlumno", cascade = CascadeType.ALL, orphanRemoval = true)
  Set<NotaCabecera> listNotaCabecera = new HashSet<NotaCabecera>();
}
