package com.example.buensaboruno.repositories;

import com.example.buensaboruno.domain.entities.Base;
import com.example.buensaboruno.domain.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface PersonaRepository <E extends Persona, ID extends Serializable> extends JpaRepository<E, ID> {
}
