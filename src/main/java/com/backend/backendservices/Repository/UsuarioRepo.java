package com.backend.backendservices.Repository;


import com.backend.backendservices.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepo extends JpaRepository<Usuario, Integer>{
}