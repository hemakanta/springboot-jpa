package boot.practice.jpa.controller;

import boot.practice.jpa.model.Product;
import boot.practice.jpa.model.ProductDTO;
import boot.practice.jpa.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<ProductDTO> getProductDetails(){
        try {
            List<Product> products = productService.fetchProductDetails();
            return new ResponseEntity<>(new ProductDTO(products), HttpStatus.OK);
        } catch (Exception e){
            log.error("ERROR - ProductController | getProductDetails ", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
