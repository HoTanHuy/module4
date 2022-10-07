package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer,Product> products ;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"Iphone",150,"Iphone 13 pro max","Apple"));
        products.put(2, new Product(2,"Samsung",250,"Samsung Z flit 3","Samsung"));
        products.put(3, new Product(3,"Xiaomi",130,"Xiaomi A9","Xiaomi"));
        products.put(4, new Product(4,"Redmi",120,"Redmi A15","Xiaomi"));
        products.put(5, new Product(5,"Iphone",230,"Iphone 14 pro max","Apple"));

    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findByID(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
