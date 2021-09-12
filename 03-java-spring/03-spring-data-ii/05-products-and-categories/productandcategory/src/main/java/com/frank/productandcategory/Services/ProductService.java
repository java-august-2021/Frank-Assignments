package com.frank.productandcategory.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frank.productandcategory.Models.Category;
import com.frank.productandcategory.Models.Product;
import com.frank.productandcategory.Repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo pRepo;
	
	
	// get all Product
    public List<Product> allProduct() {
        return pRepo.findAll();
    }
    
    // create a product
    public Product createProduct(Product p) {
        return pRepo.save(p);
    }
    
    // Get one Product by ID
    public Product findProductById(Long id) {
    	Optional<Product> prod = pRepo.findById(id);
    	
    	if(prod.isPresent()) {
            return prod.get();
    	} else {
    	    return null;
    	}
    }
    
    //Add category to product
    public void addcategory(Long id, Category category){
    	Product thisProd=this.findProductById(id);
    	List<Category> listCateg=thisProd.getCategories();
    	listCateg.add(category);
    	this.pRepo.save(thisProd);
    }
    
    public List<Product> findByCategoriesNotContains(Category category){
    	return pRepo. findByCategoriesNotContains(category);
    }
}
