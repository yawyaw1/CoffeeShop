package org.hibernate.commun;

import java.util.List;

import org.hibernate.Session;

public class GenericDao<ID, T> implements IDAO<ID, T>{

	private Session session;
	private Class<T> entity;
	
	public GenericDao() {
		//this.session
	}
	
	
	@Override
	public T create(T t) {

		return null;
	}

	@Override
	public T update(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findById(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(ID id) {
		// TODO Auto-generated method stub
		
	}

}
