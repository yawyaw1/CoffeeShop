package org.hibernate.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User implements Serializable {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = -6007140713452132513L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;

	@Column
	private String firstname;

	@Column
	private String lastname;

	@Column
	private int age;

	@Column
	private String[] sexe;

	@Column
	private String login;

	@Column
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idSkill")
	private Skill skill;

	public User() {

	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getSexe() {
		return sexe;
	}

	public void setSexe(String[] sexe) {
		this.sexe = sexe;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	
}
