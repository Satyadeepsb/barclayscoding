package com.barclays.services;

import java.util.List;

public interface BaseService<T> {
	T get(Long id);
    
    void saveOrUpdate(T obj);
    
    List<T> getAll();
    
    void delete(Long id);
}
