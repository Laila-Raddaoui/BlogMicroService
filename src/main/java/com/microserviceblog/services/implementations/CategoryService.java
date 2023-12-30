package com.microserviceblog.services.implementations;

import com.microserviceblog.models.implementations.Category;
import com.microserviceblog.repositories.implementations.CategoryRepository;
import com.microserviceblog.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryService extends GenericService<Category> {

    public CategoryService(CategoryRepository categoryRepository){
        super(categoryRepository);
    }
}
