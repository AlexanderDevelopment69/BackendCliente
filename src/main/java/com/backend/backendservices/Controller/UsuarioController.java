package com.backend.backendservices.Controller;


import com.backend.backendservices.Model.Usuario;
import com.backend.backendservices.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;


@RestController
@RequestMapping(path = "/users")

public class UsuarioController {
    @Autowired
    UsuarioService userService;

    @GetMapping("")
    public List<Usuario> list() {
        return userService.listAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> get(@PathVariable Integer id) {
        try {
            Usuario user = userService.getUser(id);
            return new ResponseEntity<Usuario>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Usuario user) {
        userService.saveUser(user);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Usuario user, @PathVariable Integer id) {
        try {
            Usuario existUser = userService.getUser(id);
            user.setId(id);

            userService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        userService.deleteUser(id);
    }


}
