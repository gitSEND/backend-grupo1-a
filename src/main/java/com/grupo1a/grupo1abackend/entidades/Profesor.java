package com.grupo1a.grupo1abackend.entidades;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Profesor")
public class Profesor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_profesor")
  private Long idProfesor;

  @Column(name = "nombre_profesor")
  private String nombreProfesor;

  @Column(name = "apellido_profesor")
  private String apellidoProfesor;

  @Column(name = "fecha_ingreso")
  private Date fechaIngreso;

  @Column(name = "genero")
  private String genero;

  @Column(name = "correo_personal")
  private String correoPersonal;

  @Column(name = "celular_personal")
  private String celularPersonal;

  @Column(name = "activo")
  private boolean activo;

  @OneToMany(mappedBy = "objProfesor", cascade = CascadeType.ALL, orphanRemoval = true)
  Set<Asistencia> listAsistencia = new HashSet<Asistencia>();

  @OneToMany(mappedBy = "objProfesor", cascade = CascadeType.ALL, orphanRemoval = true)
  Set<CursoProfesor> listCursoProfesor = new HashSet<CursoProfesor>();

  @OneToMany(mappedBy = "objProfesor", cascade = CascadeType.ALL, orphanRemoval = true)
  Set<NotaCabecera> listNotaCabecera = new HashSet<NotaCabecera>();
}
