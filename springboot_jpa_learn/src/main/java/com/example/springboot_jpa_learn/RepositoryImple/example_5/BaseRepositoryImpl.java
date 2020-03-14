package com.example.springboot_jpa_learn.RepositoryImple.example_5;

import com.example.springboot_jpa_learn.Repository.example_5.BaseRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public class BaseRepositoryImpl<T,ID> extends SimpleJpaRepository<T,ID> implements BaseRepository<T,ID>{
    private EntityManager manager;
    public BaseRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.manager=entityManager;
    }

    @Override
    public void refresh(T t) {
        manager.refresh(t);

    }
}
