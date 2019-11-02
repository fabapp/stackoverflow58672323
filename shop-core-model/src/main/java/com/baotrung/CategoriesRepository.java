package com.baotrung;

import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends CrudRepository<Category, Long>, CategoryRepositoryCustom {

 }