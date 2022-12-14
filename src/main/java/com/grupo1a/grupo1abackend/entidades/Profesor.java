package com.grupo1a.grupo1abackend.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
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

  @Column(name = "dni_profesor")
  private String dniProfesor;

  @Column(name = "clave_profesor")
  private String clave_profesor = "miclave";

  @OneToMany(mappedBy = "objProfesor", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonIgnore
  Set<AsistenciaDetalle> listAsistenciaDetalle = new HashSet<AsistenciaDetalle>();

  @OneToMany(mappedBy = "objProfesor", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonIgnore
  Set<CursoProfesor> listCursoProfesor = new HashSet<CursoProfesor>();

  @OneToMany(mappedBy = "objProfesor", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonIgnore
  Set<NotaDetalle> listNotaDetalle = new HashSet<NotaDetalle>();
}
