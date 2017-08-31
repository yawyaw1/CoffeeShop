package org.hibernate.commun;

import java.util.List;

public interface IDAO<ID, T> {

	public T create(T t);

	public T update(T t);

	public List<T> findAll();

	public T findById(ID id);
	
	public void delete(ID id);
	
	

}
