package com.backend.backendservices.Services;

import com.backend.backendservices.Model.Usuario;
import com.backend.backendservices.Repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepo userRepository;



    public List<Usuario> listAllUser() {
        return userRepository.findAll();
    }

    public void saveUser(Usuario user) {
        userRepository.save(user);
    }

    public Usuario getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
