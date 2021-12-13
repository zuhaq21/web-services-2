/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webservices.demo;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zorays
 */
@Service
@Transactional
        
class ProductService {
    
    @Autowired
    private ProductRepository repository;
     
    public List<Product> listAll() {
        return repository.findAll();
    }
     
    public void save(Product product) {
        repository.save(product);
    }
     
    public Product get(Integer id) {
        return repository.findById(id).get();
    }
     
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
