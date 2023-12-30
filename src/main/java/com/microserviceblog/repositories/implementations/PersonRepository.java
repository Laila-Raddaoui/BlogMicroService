package com.microserviceblog.repositories.implementations;

import com.microserviceblog.models.implementations.Person;
import com.microserviceblog.repositories.GenericRepository;
import org.springframework.stereotype.Repository;


public interface PersonRepository  extends GenericRepository<Person> {
}
