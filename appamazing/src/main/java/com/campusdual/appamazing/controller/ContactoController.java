package com.campusdual.appamazing.controller;


import com.campusdual.appamazing.api.IContactoService;
import com.campusdual.appamazing.model.DTO.ContactoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/contactos")
public class ContactoController {

    @Autowired
    private IContactoService contactoService;

    @PostMapping
    public String testController(@RequestBody String name){
        return "Contacto controller Works, hi " + name + " !!!";
    }

    @PostMapping("/get")
    public ContactoDTO queryContacto(@RequestBody ContactoDTO ContactoDTO){
        return this.contactoService.queryContacto(ContactoDTO);
    }

    @GetMapping("/get/{id}")
    public ContactoDTO queryContacto(@PathVariable int id){
        ContactoDTO ContactoDTO = new ContactoDTO();
        return this.contactoService.queryContacto(ContactoDTO);
    }

    @GetMapping("/getAll")
    public List<ContactoDTO> queryContacto(){
        return this.contactoService.queryAllContacts();
    }

    @PostMapping("/add")
    public int addContacto(@RequestBody ContactoDTO ContactoDTO){
        return this.contactoService.insertContact(ContactoDTO);

    }

    @PutMapping("/update")
    public int updateContact(@RequestBody ContactoDTO ContactoDTO){
        return this.contactoService.updateContact(ContactoDTO);
    }

    @DeleteMapping("/delete")
    public int deleteContact(@RequestBody ContactoDTO ContactoDTO){
        return this.contactoService.deleteContact(ContactoDTO);
    }
}
