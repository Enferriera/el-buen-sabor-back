package com.example.buensaboruno.repositories;

import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloManufacturadoRepository extends ArticuloRepository<ArticuloManufacturado,Long> {
}
