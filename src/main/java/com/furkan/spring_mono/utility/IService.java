package com.furkan.spring_mono.utility;

import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IService<T,ID> {
    T save(T t);
    Iterable<T> saveAll(Iterable<T> t);
    T update(T t);
    void delete(T t);
    void deleteById(ID id);
    List<T> findAll();
    Optional<T> findById(ID id);
}
