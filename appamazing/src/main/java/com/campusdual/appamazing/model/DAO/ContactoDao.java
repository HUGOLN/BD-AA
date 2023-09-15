package com.campusdual.appamazing.model.DAO;

import com.campusdual.appamazing.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;


//JpaRepository (entidad sobre la que se van a hacer las consultas, tipo de clave primaria)
public interface ContactoDao extends JpaRepository<Contacto, Integer> {
}