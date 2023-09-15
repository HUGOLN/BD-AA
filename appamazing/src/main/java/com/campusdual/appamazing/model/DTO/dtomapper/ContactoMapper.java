package com.campusdual.appamazing.model.DTO.dtomapper;


import com.campusdual.appamazing.model.DTO.ContactoDTO;
import com.campusdual.appamazing.model.Contacto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ContactoMapper {

    ContactoMapper INSTANCE = Mappers.getMapper(ContactoMapper.class);
    ContactoDTO toDTO(Contacto contacto);

    Contacto toEntity(ContactoDTO ContactoDTO);

    List<ContactoDTO> toDTOList(List<Contacto> contactos);
}
