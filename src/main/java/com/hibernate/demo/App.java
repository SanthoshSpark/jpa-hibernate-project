package com.hibernate.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UserPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        User user = new User("Santhosh","abcd001@gmail.com");
        
        em.persist(user);
        
        em.getTransaction().commit();
        
        em.close();
        em.close();
    }
}
