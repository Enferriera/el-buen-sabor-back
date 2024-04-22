package com.example.buensaboruno.business.services.Impl;

import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.domain.entities.Base;
import com.example.buensaboruno.repositories.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements IBaseService<E, ID> {
    @Autowired
    protected BaseRepository<E, ID> baseRepository;


//    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
//        this.baseRepository = baseRepository;
//    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        List<E> entities = baseRepository.findAll();
        return entities;
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        Optional<E> entityOptional = baseRepository.findById(id);
        return entityOptional.get();
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        entity = baseRepository.save(entity);
        return entity;
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        Optional<E> entityOptional = baseRepository.findById(id);
        E ent = entityOptional.get();
        ent = baseRepository.save(entity);
        return ent;
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        if (baseRepository.existsById(id)) {
            Optional<E> entityOptional = baseRepository.findById(id);

            E ent = entityOptional.get();
            ent.setActive(false);

            ent = baseRepository.save(ent);

            return true;
        } else {
            throw new RuntimeException();
        }
    }
}
