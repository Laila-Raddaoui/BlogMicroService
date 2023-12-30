package com.microserviceblog.controllers.implementations;

import com.microserviceblog.controllers.GenericController;
import com.microserviceblog.models.implementations.Person;
import com.microserviceblog.services.implementations.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/persons")
public class PersonController extends GenericController<Person> {
    public PersonController(PersonService personService){
        super(personService);
    }
}
