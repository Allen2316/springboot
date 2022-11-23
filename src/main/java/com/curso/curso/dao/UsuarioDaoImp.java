package com.curso.curso.dao;

import com.curso.curso.models.Usuario;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    // TODO: 23/11/2022 Realizar el metodo eliminar
    @Override
    public void eliminar(long id) {
        Usuario usuario = entityManager.find(Usuario.class, id);

    }
}
