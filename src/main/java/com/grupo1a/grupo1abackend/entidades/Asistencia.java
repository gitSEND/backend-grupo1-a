package com.grupo1a.grupo1abackend.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
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
  private String fecha;

  @OneToMany(mappedBy = "objAsistencia", cascade = CascadeType.ALL, orphanRemoval = true)
  Set<AsistenciaDetalle> listAsistenciaDetalle = new HashSet<AsistenciaDetalle>();
}
