package com.examples.ivmdiaz.repository;


import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface ReadOnlyRepository<T, I extends Serializable> extends Repository<T, I> {

    T findById(I id);

    List<T> findAll();
}
