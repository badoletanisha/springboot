package com.java.springboot.task_manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.java.springboot.task_manager.entity.Category;
import com.java.springboot.task_manager.service.CategoriService;
import com.java.springboot.task_manager.utility.ResponseStructure;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CategoryController {
@Autowired
private CategoriService categoriService;


	@GetMapping("/category/getCategoryById")
	public Category getCategoryById(@RequestParam int categoryId)  {
		return categoriService.getCategoryById(categoryId);	
	}
	
	@PostMapping("/category/addCategory")
	public ResponseEntity<ResponseStructure<Category>> addCategory(@RequestBody Category category) {
		return categoriService.addCategory(category);
	}
	
	@PutMapping("/category/updateCategory")
	public Category updateCategory(@RequestParam int categoryId,@RequestBody Category category) {
		return categoriService.getCategoryById(categoryId);
		
	}
	@DeleteMapping("/category/deleteCategory")
	public Category deleteCategory(@RequestParam int categoryId)  {
		return categoriService.getCategoryById(categoryId);
		
	}
	
	@GetMapping("/category/getAllCategories")
	public ResponseEntity<ResponseStructure<List<Category>>> getAllCategories() {
		return categoriService.getAllCategories();
	}
	
}
