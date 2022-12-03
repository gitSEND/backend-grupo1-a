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

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_nota")
  private Long idNota;

  @Column(name = "promedio_obtenido")
  private Integer promedioObtenido;


  @OneToMany(mappedBy = "objNotaCabe", cascade = CascadeType.ALL, orphanRemoval = true)
  Set<NotaDetalle> listNotaDetalle = new HashSet<NotaDetalle>();


}
