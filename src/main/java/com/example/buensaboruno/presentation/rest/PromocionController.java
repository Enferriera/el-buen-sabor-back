package com.example.buensaboruno.presentation.rest;

import com.example.buensaboruno.business.facade.impl.PromocionFacadeImpl;
import com.example.buensaboruno.domain.dtos.PromocionDto;
import com.example.buensaboruno.domain.entities.Promocion;
import com.example.buensaboruno.presentation.rest.impl.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promociones")
public class PromocionController extends BaseControllerImpl<Promocion, PromocionDto, Long, PromocionFacadeImpl> {

    private static final Logger logger = LoggerFactory.getLogger(PromocionController.class);
    public PromocionController(PromocionFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarImagenes/{id}")
    public ResponseEntity<PromocionDto> asignarImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        logger.info("INICIO ASIGNAR IMAGENES A PROMOCION");
        return ResponseEntity.ok(facade.asignarImagenes(id,imagenesIds));
    }

    @PutMapping("/removerImagenes/{id}")
    public ResponseEntity<PromocionDto> removerImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        logger.info("INICIO REMOVER IMAGENES A PROMOCION");
        return ResponseEntity.ok(facade.removerImagenes(id,imagenesIds));
    }
}
