package com.campusdual.appamazing.controller;


import com.campusdual.appamazing.api.IProductService;
import com.campusdual.appamazing.model.DTO.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping
    public String testController(@RequestBody String name){
        return "Products controller Works, hi " + name + " !!!";
    }

    @PostMapping("/get")
    public ProductDTO queryProduct(@RequestBody ProductDTO ProductDTO){
        return this.productService.queryProduct(ProductDTO);
    }

    @GetMapping("/get/{id}")
    public ProductDTO queryProduct(@PathVariable int id){
        ProductDTO ProductDTO = new ProductDTO();
        return this.productService.queryProduct(ProductDTO);
    }

    @GetMapping("/getAll")
    public List<ProductDTO> queryAllProducts(){
        return this.productService.queryAllProducts();
    }

    @PostMapping("/add")
    public int addProduct(@RequestBody ProductDTO ProductDTO){
        return this.productService.insertProduct(ProductDTO);

    }

    @PutMapping("/update")
        public int updateProduct(@RequestBody ProductDTO ProductDTO){
            return this.productService.updateProduct(ProductDTO);
    }

    @DeleteMapping("/delete")
    public int deleteProduct(@RequestBody ProductDTO ProductDTO){
        return this.productService.deleteProduct(ProductDTO);
    }
}
