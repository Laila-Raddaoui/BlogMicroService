package com.microserviceblog.controllers.implementations;

import com.microserviceblog.controllers.GenericController;
import com.microserviceblog.models.implementations.Category;
import com.microserviceblog.services.implementations.CategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController extends GenericController<Category> {

    public CategoryController(CategoryService categoryService){
        super(categoryService);
    }
}
