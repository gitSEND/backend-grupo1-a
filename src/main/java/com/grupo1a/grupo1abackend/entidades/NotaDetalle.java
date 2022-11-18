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

  @Column(name = "tipo_nota")
  private String tipoNota;

  @Column(name = "nota")
  private int nota;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
    @JoinColumn(name = "id_alumno", insertable = false, updatable = false),
    @JoinColumn(name = "id_profesor", insertable = false, updatable = false),
    @JoinColumn(name = "id_curso", insertable = false, updatable = false)
  })
  @JsonIgnore
  private NotaCabecera notaCabeceras;
}
