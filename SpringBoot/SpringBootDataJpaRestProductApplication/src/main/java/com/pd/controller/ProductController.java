package com.pd.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pd.model.Product;
import com.pd.service.ProductService;

@RestController
@RequestMapping("/product") //class level url mapping
public class ProductController {
	@Autowired
	ProductService service;
	@PostMapping("/addProduct") //url: http://localhost:2929/product/addProduct
	public Product addProduct(@RequestBody Product pdd) {
		return service.addProduct(pdd);
	}
	@PutMapping("/updateProduct") //url: http://localhost:2929/product/updateProduct
	public Product updateProduct(@RequestBody Product pdd) {
		return service.updateProduct(pdd);
	}
	@GetMapping("/getProduct/{pid}") //url: http://localhost:2929/product/getProduct/pid
	public Optional<Product> getProduct(@PathVariable("pid") int prId) {
		return service.getProduct(prId);
	}
	@GetMapping("/getAllProduct")  //url: http://localhost:2929/product/getAllProduct
	public Iterable<Product> getAllProduct() {
		return service.getAllProduct();
	}
	@DeleteMapping("/deleteProduct/{pid}")
	public void deleteProduct(@PathVariable("pid") int prId) {
		service.deleteProduct(prId);
	}
}
