package com.movienote.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface AbstractService<T, V, S> {

    List<T> getAll();

    T find(S string);

    void save(T model);

    T update(T model);

    void delete(V value);
}
