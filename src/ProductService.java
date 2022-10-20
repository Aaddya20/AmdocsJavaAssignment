package com.training.SprintBootTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.SprintBootTest.model.Product;
import com.training.SprintBootTest.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;
	
	public boolean isValid(String productName)
	{
		List<Product> prodList=repo.findAll();
		boolean valid=false;
		for(Product prod: prodList)
		{
			if(prod.getProductName().equalsIgnoreCase(productName))
				{valid=true;}
		}
		return valid;
	}
	
	public void save(Product prod) {
		repo.save(prod);
	}
	
	public List<Product> prodLists(){
		return repo.findAll();
	}
	
	public Product getProd(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteProd(int id) {
		repo.deleteById(id);
	}
	

}