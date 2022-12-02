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
@Table(name = "asistencia")
public class Asistencia {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_asistencia")
  private Long idAsistencia;

  @Column(name = "fecha")
  private Date fecha;

  @OneToMany(mappedBy = "objAsistencia", cascade = CascadeType.ALL, orphanRemoval = true)
  Set<AsistenciaDetalle> listAsistenciaDetalle = new HashSet<AsistenciaDetalle>();
}
