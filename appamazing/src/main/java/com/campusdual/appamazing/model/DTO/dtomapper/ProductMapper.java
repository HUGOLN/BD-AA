package com.campusdual.appamazing.model.DTO.dtomapper;

import com.campusdual.appamazing.model.DTO.ProductDTO;
import com.campusdual.appamazing.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    ProductDTO toDTO(Product product);

    Product toEntity(ProductDTO ProductDTO);

    List<ProductDTO> toDTOList(List<Product> products);
}
