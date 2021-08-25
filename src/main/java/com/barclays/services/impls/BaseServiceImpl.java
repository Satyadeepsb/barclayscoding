package com.barclays.services.impls;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.barclays.services.BaseService;


public abstract class BaseServiceImpl<T> implements BaseService<T>{
	
	// protected abstract JpaRepository<T, Long> getRepository();
	
	@Override
	public T get(Long id) {
		Optional<T> op = Optional.ofNullable(null); // getRepository().findById(id);
		return op.orElse(null);
    }

	@Override
	public void saveOrUpdate(T obj) {
	//	getRepository().save(obj);
	}

	@Override
	public List<T> getAll() {
//		Iterable<T> iterable = getRepository().findAll();
//        List<T> list = new ArrayList<T>();
//        if (iterable != null) {
//            iterable.forEach(list::add);
//        }
//        return list;
	    return Collections.emptyList();
	}

	@Override
	public void delete(Long id) {
	//	getRepository().deleteById(id);
	}

}
