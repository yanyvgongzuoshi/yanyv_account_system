package com.yanyv.account.repository;

import java.io.Serializable;
import java.util.List;

public interface DomainRepository<T,PK extends Serializable> {
    T load(PK id);

    T get(PK id);

    List<T> findAll();

    void persist(T entity);

    PK save(T entity);

    void saveOrUpdate(T entity);

    void delete(T t);

    void flush();

}

