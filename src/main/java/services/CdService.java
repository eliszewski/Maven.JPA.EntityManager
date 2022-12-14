package services;

import entities.Artist;
import entities.Cd;
import jakarta.persistence.*;

import java.util.List;

public class CdService {
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaEntity");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();
    private EntityTransaction entityTransaction = entityManager.getTransaction();

    public Cd findById(int id){
        return entityManager.find(Cd.class, id);
    }
    public List<Cd> findAll(){
        Query query = entityManager.createQuery("SELECT * FROM Artist", Cd.class);
        return query.getResultList();
    }
}
