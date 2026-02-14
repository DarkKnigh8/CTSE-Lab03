package com.sliit.product_service.controller;

import com.sliit.product_service.model.Product;
import com.sliit.product_service.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    // POST
    @PostMapping
    public Product create(@RequestBody Product product) {
        return repo.save(product);
    }

    // GET all
    @GetMapping
    public List<Product> getAll() {
        return repo.findAll();
    }

    // GET by ID
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
