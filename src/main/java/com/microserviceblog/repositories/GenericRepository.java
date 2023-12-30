package com.microserviceblog.repositories;

import com.microserviceblog.interfaces.IGeneric;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;



@NoRepositoryBean
public interface GenericRepository<T extends IGeneric> extends MongoRepository<T, String> {

}
