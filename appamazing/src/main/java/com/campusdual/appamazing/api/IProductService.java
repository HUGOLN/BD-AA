package com.campusdual.appamazing.api;

import com.campusdual.appamazing.model.DTO.ProductDTO;

import java.util.List;

public interface IProductService {
    ProductDTO queryProduct(ProductDTO ProductDTO);
    List<ProductDTO> queryAllProducts();

    //Esto se va a configuerar de modo que devuelva el ID de los productos que se han modificado
    int insertProduct(ProductDTO ProductDTO);
    int updateProduct(ProductDTO ProductDTO);
    int deleteProduct(ProductDTO ProductDTO);

}
