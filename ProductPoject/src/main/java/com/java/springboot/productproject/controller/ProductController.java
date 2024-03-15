package com.java.springboot.productproject.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.productproject.dto.ProductRequest;
import com.java.springboot.productproject.entity.Product;
import com.java.springboot.productproject.service.ProductService;
import com.java.springboot.productproject.utility.ResponseStructure;

@RestController
public class ProductController {

//		@Autowired
	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@PostMapping("/products")
	public ResponseEntity<ResponseStructure<Product>> saveProduct(@RequestBody ProductRequest productRequest)
	{
		return productService.saveProduct(productRequest);
	}

	@GetMapping("/product/findProduct")
	public ResponseEntity<ResponseStructure<Product>> findProduct(@PathVariable int productId){
		return productService.findProduct(productId);
	}
@PutMapping("/product/updateProduct")
	public ResponseEntity<ResponseStructure<Product>> updateProduct(int productId ,Product product){
		return updateProduct(productId, product);
		
	}

	//	@GetMapping("products/saveProduct")
	//	public ResponseEntity<ResponseStructure<Product>> saveProduct(@RequestBody Product product){
	//		return productService.saveProduct(product);
	//	}
	//
	//	@PutMapping("/products/updateProduct")
	//	public ResponseEntity<ResponseStructure<Product>> updateProduct(@RequestParam  int productId,@RequestParam int productCost){
	//		return productService.updateProduct(productId, productCost);
	//	}
	//	@DeleteMapping("/products/updateProduct")
	//	public ResponseEntity<ResponseStructure<Product>> deleteProduct(@RequestParam int productId){
	//		return productService.deleteProduct(productId);
	//	}
	//	@GetMapping("/products/getByIdProduct")
	//	public ResponseEntity<ResponseStructure<Product>> getByIdProduct(@RequestParam int productId){
	//		return productService.getByIdProduct(productId);
	//	}
	//	@GetMapping("/products/findAllProduct")
	//	public ResponseEntity<ResponseStructure<List<Product>>> findAllProduct(){
	//		return productService.findAllProduct();
	//	}

}
