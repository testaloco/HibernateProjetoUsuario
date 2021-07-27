package dao;

import entities.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UsuarioDAO {
    public static Usuario cadastro(Usuario usuario){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        em.persist(usuario);
        entityTransaction.commit();
        em.close();
        return usuario;
    }
    public static Usuario pesquisa(Long id){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        Usuario us = em.find(Usuario.class, id);
        em.close();
        return us;
    }
    public static Usuario uptade(Long id){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        Usuario us = em.find(Usuario.class, id);
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        em.merge(id);
        entityTransaction.commit();
        em.close();
        return us;
    }
}
