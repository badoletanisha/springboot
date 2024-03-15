package com.java.springboot.task_manager.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.java.springboot.task_manager.entity.Category;

import com.java.springboot.task_manager.utility.ResponseStructure;

public interface CategoriService {

	ResponseEntity<ResponseStructure<Category>> addCategory(Category category);

	Category getCategoryById(int categoryId);

	Category updateCategory(int categoryId, Category updateCategory);

	Category deleteCategory(int categoryId);

	ResponseEntity<ResponseStructure<List<Category>>> getAllCategories();
	   

	
}
