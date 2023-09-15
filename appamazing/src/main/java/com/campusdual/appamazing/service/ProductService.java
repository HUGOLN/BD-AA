package com.campusdual.appamazing.service;

import com.campusdual.appamazing.api.IProductService;
import com.campusdual.appamazing.model.DAO.ProductDao;
import com.campusdual.appamazing.model.DTO.ProductDTO;
import com.campusdual.appamazing.model.DTO.dtomapper.ProductMapper;
import com.campusdual.appamazing.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;

@Service ("ProductService")
@Lazy

public class ProductService implements IProductService {
@Autowired
    private ProductDao productDao;

//TamoEnEllo
    @Override
    public ProductDTO queryProduct(ProductDTO ProductDTO) {
        Product product = ProductMapper.INSTANCE.toEntity(ProductDTO);
        return ProductMapper.INSTANCE.toDTO(productDao.getReferenceById(product.getID()));
    }

    @Override
    public List<ProductDTO> queryAllProducts() {
        return ProductMapper.INSTANCE.toDTOList(productDao.findAll());
    }

    @Override
    public int insertProduct(ProductDTO ProductDTO) {
        Product product = ProductMapper.INSTANCE.toEntity(ProductDTO);
        productDao.saveAndFlush(product);
        return product.getID();
    }

    @Override
    public int updateProduct(ProductDTO ProductDTO) {
        return this.insertProduct(ProductDTO);
    }

    @Override
    public int deleteProduct(ProductDTO ProductDTO) {
        int id = ProductDTO.getID();
        Product product = ProductMapper.INSTANCE.toEntity(ProductDTO);
        productDao.delete(product);
        return id;
    }
}
