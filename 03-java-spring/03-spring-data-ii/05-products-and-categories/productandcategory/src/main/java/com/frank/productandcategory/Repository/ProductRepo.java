package com.frank.productandcategory.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frank.productandcategory.Models.Category;
import com.frank.productandcategory.Models.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product,Long> {
	List<Product> findAll();
	
    List<Product> findByCategoriesNotContains(Category category);
}
