package com.example.buensaboruno.presentation.rest.impl;

import com.example.buensaboruno.business.facade.impl.BaseFacadeImpl;
import com.example.buensaboruno.business.services.Impl.BaseServiceImpl;
import com.example.buensaboruno.domain.dtos.BaseDto;
import com.example.buensaboruno.domain.entities.Base;
import com.example.buensaboruno.presentation.rest.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

public abstract class BaseControllerImpl<E extends Base, D extends BaseDto, ID extends Serializable, F extends BaseFacadeImpl<E,D,ID>> implements BaseController<D, ID> {

    private static final Logger logger = LoggerFactory.getLogger(BaseControllerImpl.class);
    protected F facade;

    public BaseControllerImpl(F facade) {
        this.facade = facade;
    }

    @GetMapping("")
    public ResponseEntity<List<D>> getAll(){
        logger.info("Inicio get all");
        return ResponseEntity.ok(facade.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<D> getOne(@PathVariable ID id){
        logger.info("Inicio getone", id);
        return ResponseEntity.ok(facade.getById(id));
    }

    @PostMapping("")
    public ResponseEntity<D> save(@RequestBody D entity){
        logger.info("Inicio save", entity.getClass());
        return ResponseEntity.ok(facade.createNew(entity));
    }
    @PutMapping("/{id}")
    public ResponseEntity<D> update(@PathVariable ID id,@RequestBody D entity){
        logger.info("Inicio update", entity.getClass());
        return ResponseEntity.ok(facade.update(entity, id));
    }
   @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable ID id){
        logger.info("Inicio delete");
        facade.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
