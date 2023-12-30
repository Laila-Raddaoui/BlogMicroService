package com.microserviceblog.metier;

import com.microserviceblog.interfaces.IGeneric;

import java.util.List;

public interface IMetier<T extends IGeneric> {

    T save(T entity);

    T update(T entity);

    T delete(String id);

    List<T> findAll();

    T findById(String id);
}
