package com.grupo1a.grupo1abackend.repositorio;

import com.grupo1a.grupo1abackend.entidades.NotaCabecera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface INotaRepositorio extends JpaRepository<NotaCabecera, Long> {

}
