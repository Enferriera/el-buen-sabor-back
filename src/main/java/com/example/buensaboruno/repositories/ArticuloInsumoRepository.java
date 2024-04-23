package com.example.buensaboruno.repositories;

import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloInsumoRepository extends ArticuloRepository<ArticuloInsumo,Long> {
}
