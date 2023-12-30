package com.microserviceblog.controllers;

import com.microserviceblog.interfaces.IGeneric;
import com.microserviceblog.services.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
public class GenericController <T extends IGeneric> {
    public GenericService<T> genericService;

    @PostMapping(value = "/save")
    public T save(@RequestBody T entity) {
        return genericService.save(entity);
    }

    @GetMapping(value = "/")
    public List<T> findAll() {
        return genericService.findAll();
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable String id) {
        genericService.delete(id);
    }

    @GetMapping(value = "/{id}")
    public T findById(@PathVariable String id) {
        return genericService.findById(id);
    }

    @PutMapping(value = "/update")
    public T update(@RequestBody T entity) {
        return genericService.update(entity);
    }

}
