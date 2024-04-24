package com.example.buensaboruno.presentation.rest;

import com.example.buensaboruno.domain.dtos.BaseDto;
import com.example.buensaboruno.domain.entities.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;

public interface BaseController<D extends BaseDto, ID extends Serializable> {
    ResponseEntity<List<D>> getAll();
    ResponseEntity<D> getOne(ID id);
    ResponseEntity<D> save(D entity);
    ResponseEntity<D> update(ID id, D entity);
    ResponseEntity<?> delete(ID id);
}