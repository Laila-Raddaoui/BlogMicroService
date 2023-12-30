package com.microserviceblog.services.implementations;

import com.microserviceblog.models.implementations.Person;
import com.microserviceblog.repositories.implementations.PersonRepository;
import com.microserviceblog.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonService extends GenericService<Person> {
    public PersonService(PersonRepository personRepository) {
        super(personRepository);

    }
}
