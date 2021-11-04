package boot.practice.jpa.service;

import boot.practice.jpa.model.Product;
import boot.practice.jpa.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product>  fetchProductDetails(){

        List<Product> productList = productRepository.findAll();

        return productList;
    }
}
