package org.hibernate.entities.tests;

import org.hibernate.commun.IUserRepositoryDao;
import org.hibernate.commun.UserRepositoryImpl;
import org.hibernate.entities.Skill;
import org.hibernate.entities.User;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class UserTests {

	
	private IUserRepositoryDao dao;
	
	@Before
	public void init(){
		
		dao=new UserRepositoryImpl();
		
		
	}
	
	@Test
	public void addUserTest(){
		
		Skill skill=new Skill();
		skill.setDescription("Spring");
		
		User user=new User();
		user.setFirstname("Youssef");
		user.setLastname("smimaa");
		user.setAge(30);
		user.setLogin("yousafe");
		user.setSkill(skill);
		
		dao.create(user);
		
		Assert.assertNotNull(user);
		
		
	}
	
	
	
	

	}
