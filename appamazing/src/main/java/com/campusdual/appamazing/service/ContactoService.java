package com.campusdual.appamazing.service;


import com.campusdual.appamazing.api.IContactoService;
import com.campusdual.appamazing.model.Contacto;
import com.campusdual.appamazing.model.DAO.ContactoDao;
import com.campusdual.appamazing.model.DTO.ContactoDTO;
import com.campusdual.appamazing.model.DTO.dtomapper.ContactoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ContactoService")
@Lazy
public class ContactoService implements IContactoService {

    @Autowired
    private ContactoDao contactoDao;



    @Override
    public ContactoDTO queryContacto(ContactoDTO ContactoDTO) {
        Contacto contacto = ContactoMapper.INSTANCE.toEntity(ContactoDTO);
        return ContactoMapper.INSTANCE.toDTO(contactoDao.getReferenceById(contacto.getID()));
    }

    @Override
    public List<ContactoDTO> queryAllContacts() {
         return ContactoMapper.INSTANCE.toDTOList(contactoDao.findAll());
    }

    @Override
    public int insertContact(ContactoDTO ContactoDTO) {
        Contacto contacto = ContactoMapper.INSTANCE.toEntity(ContactoDTO);
        contactoDao.saveAndFlush(contacto);
        return contacto.getID();
    }

    @Override
    public int updateContact(ContactoDTO ContactoDTO) {
        return this.insertContact(ContactoDTO);
    }

    @Override
    public int deleteContact(ContactoDTO ContactoDTO) {
        int id = ContactoDTO.getID();
        Contacto contacto = ContactoMapper.INSTANCE.toEntity(ContactoDTO);
        contactoDao.delete(contacto);
        return id;
    }
}
