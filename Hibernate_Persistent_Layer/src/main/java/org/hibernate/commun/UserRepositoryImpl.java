package org.hibernate.commun;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.config.HibernateUtil;
import org.hibernate.entities.User;

public class UserRepositoryImpl implements IUserRepositoryDao {

	private Session session;

	public UserRepositoryImpl() {

	}

	@Override
	public User create(User user) {

		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();

		return user;
	}

	@Override
	public User update(User user) {

		session.beginTransaction();
		session.saveOrUpdate(user);
		session.getTransaction().commit();

		return user;
	}

	@Override
	public List<User> findAllUser() {

		Query query = (Query) session.createQuery("from User");
		List<User> users = query.getResultList();

		return users;
	}

	@Override
	public void Delete(Long id) {

		session.beginTransaction();
		session.remove(session.find(User.class, id));
		session.getTransaction().commit();
	}

}
