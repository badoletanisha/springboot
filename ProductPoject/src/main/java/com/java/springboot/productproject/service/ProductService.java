package com.java.springboot.productproject.service;


import org.springframework.http.ResponseEntity;

import com.java.springboot.productproject.dto.ProductRequest;
import com.java.springboot.productproject.entity.Product;
import com.java.springboot.productproject.utility.ResponseStructure;

public interface ProductService {
//	public ResponseEntity<ResponseStructure<Product>> saveProduct(Product product);
//	public ResponseEntity<ResponseStructure<Product>> getByIdProduct(int productId);
//	public ResponseEntity<ResponseStructure<List<Product>>> findAllProduct();
//	
//	public ResponseEntity<ResponseStructure<Product>> updateProduct(int productId, int productCost);
//	public ResponseEntity<ResponseStructure<Product>> deleteProduct(int productId);
	public ResponseEntity<ResponseStructure<Product>> findProduct(int productId);
	public ResponseEntity<ResponseStructure<Product>> updateProduct(int productId ,Product product);
	public ResponseEntity<ResponseStructure<Product>> saveProduct(ProductRequest productRequest);
}
