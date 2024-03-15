package com.java.springboot.productprojectserviceimpl;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.springboot.productproject.dto.ProductRequest;
import com.java.springboot.productproject.entity.Product;
import com.java.springboot.productproject.exception.ProductNotFoundException;
import com.java.springboot.productproject.repository.ProductRepository;
import com.java.springboot.productproject.service.ProductService;
import com.java.springboot.productproject.utility.ResponseStructure;

@Service
public class ProductServiceImpl implements ProductService {

//	@Autowired
	private ProductRepository productRepository;
     
	private ResponseStructure<Product> responseStructure;

	@Override
	public ResponseEntity<ResponseStructure<Product>> findProduct(int productId) {
		
		return productRepository.findById(productId).map(product -> ResponseEntity.ok(
				responseStructure.setStatuscode(HttpStatus.OK.value())
				.setMessage("Found")
				.setData(product)))
				.orElseThrow(() -> new ProductNotFoundException("Product Not Found"));
		}

	@Override
	public ResponseEntity<ResponseStructure<Product>> updateProduct(int productId, Product product) {
		return null;
//		return productRepository.findById(productId).map(exproduct -> {
//			product.setProductId(exproduct.getProductId());
//			exproduct  = productRepository.save(product);
//			return ResponseEntity.ok(responseStructure.setStatuscode(productId))
//		});
	}

	@Override
	public ResponseEntity<ResponseStructure<Product>> saveProduct(ProductRequest productRequest) {
	Product product = productRepository.save(mapToProduct(productRequest,new Product()));
	return ResponseEntity.ok(responseStructure.setStatuscode(HttpStatus.OK.value()).setMessage("Product Saved Successfully").setData(product));
	}

	private Product mapToProduct(ProductRequest productRequest, Product product) {
		product.setProductName(productRequest.getProductName());
		return product;
	}
	

	
	
	
//	@Override
//	public ResponseEntity<ResponseStructure<Product>> saveProduct(Product product) {
//		Product saveProduct = productRepository.save(product);
//		if(saveProduct==null) {
//			throw new ProductNotFoundException("Failed to add category");
//		}
//		else {
//			ResponseStructure<Product> responseStructure =new ResponseStructure<>();
//			responseStructure.setStatuscode(HttpStatus.CREATED.value());
//			responseStructure.setMessage("category add successfully");
//			responseStructure.setData(saveProduct);		
//			return new ResponseEntity<ResponseStructure<Product>>(responseStructure,HttpStatus.CREATED);
//		}
//	}
//	@Override
//	public ResponseEntity<ResponseStructure<Product>> updateProduct(int productId,int productCost) {
//		Optional<Product> optional = productRepository.findById(productId);
//		if(optional.isPresent()) {
//			Product exitProduct = optional.get();
//			exitProduct.setProductId(exitProduct.getProductId());
//			exitProduct.setProductCost(exitProduct.getProductCost());
//			ResponseStructure<Product> responseStructure =new ResponseStructure<>();
//			responseStructure.setStatuscode(HttpStatus.CREATED.value());
//			responseStructure.setMessage("category add successfully");
//			responseStructure.setData(exitProduct);		
//			return new ResponseEntity<ResponseStructure<Product>>(responseStructure,HttpStatus.CREATED);
//		}else {
//			throw new ProductNotFoundException("Product not found");
//		}
//
//
//	}
//
//	@Override
//	public ResponseEntity<ResponseStructure<Product>> deleteProduct(int productId) {
//		Optional<Product> optional = productRepository.findById(productId);
//		if(optional.isPresent()) {
//			Product product = optional.get();
//			productRepository.delete(product);
//			ResponseStructure<Product> responseStructure =new ResponseStructure<>();
//			responseStructure.setStatuscode(HttpStatus.CREATED.value());
//			responseStructure.setMessage("category add successfully");
//			responseStructure.setData(product);		
//			return new ResponseEntity<ResponseStructure<Product>>(responseStructure,HttpStatus.CREATED);
//		}
//		throw new ProductNotFoundException("Product not found");
//
//	}
//
////	@Override
////	public ResponseEntity<ResponseStructure<Product>> getByIdProduct(int productId) {
////		Optional<Product> optional = productRepository.findById(productId);
////		if(optional.isPresent()) {
////				Product product = optional.get();
////			ResponseStructure<Product> responseStructure =new ResponseStructure<>();
////			responseStructure.setStatuscode(HttpStatus.CREATED.value());
////			responseStructure.setMessage("category add successfully");
////			responseStructure.setData(product);		
////			return new ResponseEntity<ResponseStructure<Product>>(responseStructure,HttpStatus.CREATED);
////		}
////		throw new ProductNotFoundException("Product not found");
////	}
//
//	@Override
//	public ResponseEntity<ResponseStructure<List<Product>>> findAllProduct() {
//		List<Product> all = productRepository.findAll();
//		if(all.isEmpty()) {
//			throw new ProductNotFoundException("Product not found");
//		}
//		else {
//			
//			ResponseStructure<List<Product>> responseStructure =new ResponseStructure<>();
//			responseStructure.setStatuscode(HttpStatus.CREATED.value());
//			responseStructure.setMessage("category add successfully");
//			responseStructure.setData(all);		
//			return new ResponseEntity<ResponseStructure<List<Product>>>(responseStructure,HttpStatus.CREATED);
//		}
//	}
//


}
