package ru.kpfu.icmit.server4.service;

import ru.kpfu.icmit.server4.model.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface CrudService<T extends BaseEntity>{
    List<T> getAll();
    T add(T t);
    T update(T t);
    void delete(T t);
    Optional<T> getOneById(Long id);
}
