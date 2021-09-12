package com.frank.productandcategory.Controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.frank.productandcategory.Models.Category;
import com.frank.productandcategory.Models.Product;
import com.frank.productandcategory.Services.CategoryService;
import com.frank.productandcategory.Services.ProductService;

@Controller
public class HomeController {
	@Autowired
	private CategoryService catService;
	
	@Autowired
	private ProductService prodService;
	
	@GetMapping("/product/new")
	public String index(@ModelAttribute("newProd") Product prod) {
		return "product.jsp";
	}
	
	@PostMapping("/create/product")
    public String createProduct(@ModelAttribute("newProd") Product prod, BindingResult result, HttpSession session) {
		prodService.createProduct(prod);
		return "redirect:/product/new";
	}
	
	@GetMapping("/product/{id}")
	public String productCateg(@PathVariable("id") Long id,Model viewmodel) {
		Product idprod=prodService.findProductById(id);
		List<Category> categForProd=catService.findAllByProducts(idprod);
		List<Category> categOutProd=catService.findByProductsNotContains(idprod);
		viewmodel.addAttribute("allCategory",categForProd);
		viewmodel.addAttribute("outOfProd",categOutProd);
		viewmodel.addAttribute("thisProduct",idprod);
		return "oneprod.jsp";
	}
	
	@PostMapping("/addcategory/{id}")
    public String addCategoyr(@RequestParam("categories") Long categId, @PathVariable("id") Long productId) {
		Category catId=catService.findCategoryById(categId);
		prodService.addcategory(productId, catId);
		return "redirect:/product/{id}";
	}
	
	@GetMapping("/category/new")
	public String index(@ModelAttribute("newcategory") Category Categ) {
		return "category.jsp";
	}
	
	@PostMapping("/create/category")
    public String createCategoyr(@ModelAttribute("newcategory") Category categ, BindingResult result, HttpSession session) {
		catService.createCategory(categ);
		return "redirect:/category/new";
	}
	

	
	@GetMapping("/category/{id}")
	public String categoryProd(@PathVariable("id") Long id,Model viewmodel) {
		Category categoryId=catService.findCategoryById(id);
		
		List<Product> nonContains=prodService.findByCategoriesNotContains(categoryId);
		List<Product> allProduct=categoryId.getProducts();
		viewmodel.addAttribute("prodNonContains",nonContains);
		viewmodel.addAttribute("allproducts", allProduct);
		viewmodel.addAttribute("thisCategory",categoryId);
		return "onecategory.jsp";
	}
	@PostMapping("/addproduct/{id}")
    public String addProduct(@RequestParam("products") Long prodId, @PathVariable("id") Long categoryId) {
		Product product=prodService.findProductById(prodId);
		catService.addProduct(categoryId, product);
		return "redirect:/category/{id}";
	}
	
}
