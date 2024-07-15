package ProjetAlten.ProjetAlten;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired private final ProductRepository repository;

	public ProductController(ProductRepository repository) {
		super();
		this.repository = repository;
	}
	
	 @GetMapping("/products")
	  List<Product> getProducts() {
	    return repository.findAll();
	  }
	 
	 @GetMapping("/products/{id}")
	  Product getProductDetail(@PathVariable Integer id) {
	    
	    return repository.findById(id)
	      .orElseThrow(() -> new ProductNotFoundException(id));
	  }
	 
	 @DeleteMapping("/products/{id}")
	  void deleteEmployee(@PathVariable Integer id) {
	    repository.deleteById(id);
	  }
	 
	 @PostMapping("/products")
	  Product newProduct(@RequestBody Product newProduct) {
	    return repository.save(newProduct);
	  }
	 
	 @PatchMapping("/products/{id}")
	  Product updateProduct(@RequestBody Product newProduct, @PathVariable Integer id) {
		 
		 return repository.findById(id)
		      .map(product -> {
		          product.setCode(newProduct.getCode());
		          product.setName(newProduct.getName());
		          product.setDescription(newProduct.getDescription());
		          product.setImage(newProduct.getImage());
		          product.setCategory(newProduct.getCategory());
		          product.setInventoryStatus(newProduct.getInventoryStatus());
		          product.setPrice(newProduct.getPrice());
		          product.setQuantity(newProduct.getQuantity());
		          product.setRating(newProduct.getRating());
		          return repository.save(product);
		        })
		        .orElseThrow(() -> new ProductNotFoundException(id));
		    }
	

}
