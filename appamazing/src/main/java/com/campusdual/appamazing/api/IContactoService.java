package com.campusdual.appamazing.api;

import com.campusdual.appamazing.model.DTO.ContactoDTO;

import java.util.List;

public interface IContactoService {
    ContactoDTO queryContacto(ContactoDTO ContactoDTO);

    List<ContactoDTO> queryAllContacts();

    int insertContact(ContactoDTO ContactoDTO);
    int updateContact(ContactoDTO ContactoDTO);
    int deleteContact(ContactoDTO ContactoDTO);

}
