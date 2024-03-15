package com.java.springboot.task_manager.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.springboot.task_manager.entity.Category;

import com.java.springboot.task_manager.exception.AddCategoryNotCreatedException;
import com.java.springboot.task_manager.exception.CategoryByIdNotFoundException;
import com.java.springboot.task_manager.exception.CategoryNotFoundException;
import com.java.springboot.task_manager.exception.ListOfCategoryNotFoundException;
import com.java.springboot.task_manager.exception.UpdateCategoryByIdNotFoundException;
import com.java.springboot.task_manager.repository.CategoryRepository;
import com.java.springboot.task_manager.service.CategoriService;
import com.java.springboot.task_manager.utility.ResponseStructure;
@Service
public class CategoryServiceImpl implements CategoriService{


	private CategoryRepository categoryRepository;


	@Override
	public ResponseEntity<ResponseStructure<Category>> addCategory(Category category) {
		Category saveCategory = categoryRepository.save(category);
		if(saveCategory==null) {
			throw new AddCategoryNotCreatedException("Failed to add category");
		}
		else {
			ResponseStructure<Category> responseStructure =new ResponseStructure<>();
			responseStructure.setStatuscode(HttpStatus.CREATED.value());
			responseStructure.setMessage("category add successfully");
			responseStructure.setData(saveCategory);		
			return new ResponseEntity<ResponseStructure<Category>>(responseStructure,HttpStatus.CREATED);
		}
	}

	@Override
	public Category getCategoryById(int categoryId)  {
		Optional<Category> optionalCategory =categoryRepository.findById(categoryId);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();
		}
		else {
			throw new CategoryByIdNotFoundException("category by id not found");
		}
	}



	@Override
	public Category updateCategory(int categoryId, Category updateCategory) {
		Optional<Category> optionalCategory = categoryRepository.findById(categoryId);
		if (optionalCategory.isPresent()) {
			Category existingCategory = optionalCategory.get();
			existingCategory.setCategoryId(updateCategory.getCategoryId());

			return categoryRepository.save(existingCategory);
		} else {
			throw new UpdateCategoryByIdNotFoundException("Category not found by ID: " + categoryId);
		}
	}


	@Override
	public Category deleteCategory(int categoryId)  {
		Optional<Category> optionalCategory = categoryRepository.findById(categoryId);
		if (optionalCategory.isPresent()) {
			Category deletedCategory = optionalCategory.get();
			categoryRepository.delete(deletedCategory);
			return deletedCategory;
		} 
		else {
			throw new CategoryNotFoundException("Category not found by ID: ");

		}

	}


	@Override
	public ResponseEntity<ResponseStructure<List<Category>>> getAllCategories() {
		List<Category> categoryList =categoryRepository.findAll();
		if(categoryList.isEmpty()) {
			throw new ListOfCategoryNotFoundException(" List of category");
		}
		else {
			ResponseStructure<List<Category>> responseStructure =new ResponseStructure<>();
			responseStructure.setStatuscode(HttpStatus.FOUND.value());
			responseStructure.setMessage("get all the task ");
			responseStructure.setData(categoryList);
			return new ResponseEntity<ResponseStructure<List<Category>>>(responseStructure,HttpStatus.FOUND);
		}
	}



}