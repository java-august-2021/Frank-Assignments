package com.frank.productandcategory.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frank.productandcategory.Models.Category;
import com.frank.productandcategory.Models.Product;
import com.frank.productandcategory.Repository.CategoryRepo;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepo cRepo;
	
	
	// Retrieves a list of all categories for a particular product
    public List<Category> findAllByProducts(Product product){
        return cRepo.findAllByProducts(product);
    }
    
    // Retrieves a list of any categories a particular product
    // does not belong to.
    public List<Category> findByProductsNotContains(Product product){
    	return cRepo.findByProductsNotContains(product);
    }
    

    
    //create a Category
    public Category createCategory(Category c) {
        return cRepo.save(c);
    }
    
    //Get One Category
    public Category findCategoryById(Long id) {
    	Optional<Category> categ = cRepo.findById(id);
    	
    	if(categ.isPresent()) {
            return categ.get();
    	} else {
    	    return null;
    	}
    }
    //Add category to product
    public void addProduct(Long id, Product productId){
    	Category thisCategory=this.findCategoryById(id);
    	List<Product> listProd=thisCategory.getProducts();
    	listProd.add(productId);
    	this.cRepo.save(thisCategory);
    }
    
    
}
