package org.hibernate.commun;

import java.util.List;

import org.hibernate.entities.User;

public interface IUserRepositoryDao {

	User create(User user);

	User update(User user);

	List<User> findAllUser();

	void Delete(Long id);

}
