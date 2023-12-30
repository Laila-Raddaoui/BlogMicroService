package com.microserviceblog.services;

import com.microserviceblog.interfaces.IGeneric;
import com.microserviceblog.metier.IMetier;
import com.microserviceblog.repositories.GenericRepository;
import lombok.AllArgsConstructor;


import java.util.List;
import java.util.Objects;


@AllArgsConstructor
public class GenericService<T extends IGeneric> implements IMetier<T> {
    public GenericRepository<T> genericRepository;


    @Override
    public T save(T entity) {
        return (!Objects.isNull(entity)) ? genericRepository.save(entity) : null;
    }

    @Override
    public T update(T entity) {
        return null;
    }

    @Override
    public T delete(String id) {
        T existEntity = genericRepository.findById(id).orElse(null);
        genericRepository.delete(existEntity);
        return existEntity;
    }

    @Override
    public List<T> findAll() {
        return genericRepository.findAll();
    }

    @Override
    public T findById(String id) {
        return genericRepository.findById(id).orElse(null);
    }
}
