package com.grupo1a.grupo1abackend.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

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

  @Column(name = "fecha_ingreso")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date fechaIngreso;

  @Column(name = "genero")
  private String genero;

  @Column(name = "correo_personal")
  private String correoPersonal;

  @Column(name = "celular_personal")
  private String celularPersonal;

  @Column(name = "activo")
  private boolean activo;

  @Column(name = "dni_alumno")
  private String dniAlumno;

  @Column(name = "clave_alumno")
  private String claveAlumno = "miclave";

  @OneToMany(mappedBy = "objAlumno", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonIgnore
  Set<AlumnoCurso> listAlumnoCurso = new HashSet<AlumnoCurso>();

  @OneToMany(mappedBy = "objAlumno", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonIgnore
  Set<Asistencia> listAsistencia = new HashSet<Asistencia>();

  @OneToMany(mappedBy = "objAlumno", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonIgnore
  Set<NotaCabecera> listNotaCabecera = new HashSet<NotaCabecera>();
}
