package ourbusinessproject;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class EnterpriseProjectService {
    @PersistenceContext
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    public void save(Object object) {
        entityManager.persist(object);
        entityManager.flush();
    }

    public Project findProjectById(Long anId) {
        return this.entityManager.find(Project.class, anId);
    }

    public Enterprise findEnterpriseById(Long anId) {
        return this.entityManager.find(Enterprise.class, anId);
    }

}
