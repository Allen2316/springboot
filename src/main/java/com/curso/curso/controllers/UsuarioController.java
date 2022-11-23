package com.curso.curso.controllers;

import com.curso.curso.dao.UsuarioDao;
import com.curso.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public List<Usuario> getUsuario(@PathVariable long id) {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setApellido("Sarmiento");
        usuario.setNombre("Luis");
        usuario.setEmail("luis@gamil.com");
        usuario.setPassword("123");
        usuario.setTelefono("123123");
        return usuarios;
    }

    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuario2")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setApellido("Sarmiento");
        usuario.setNombre("Luis");
        usuario.setEmail("luis@gamil.com");
        usuario.setPassword("123");
        usuario.setTelefono("123123");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eleminiar(long id) {
        usuarioDao.eliminar(id);

    }

    @RequestMapping(value = "api/usuario4")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setApellido("Sarmiento");
        usuario.setNombre("Luis");
        usuario.setEmail("luis@gamil.com");
        usuario.setPassword("123");
        usuario.setTelefono("123123");
        return usuario;
    }
}
