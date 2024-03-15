package com.java.springboot.productproject.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springboot.productproject.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	 

}
