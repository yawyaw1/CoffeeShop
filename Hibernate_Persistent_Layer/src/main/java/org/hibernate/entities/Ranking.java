package org.hibernate.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ranking implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8831070821201064517L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idRanking;
	
	@Column
	private User subject;
	
	@Column
	private User observer;
	
	private Integer rating;
	
	public Ranking() {
		
	}
	
	public Long getIdRanking() {
		return idRanking;
	}
	public void setIdRanking(Long idRanking) {
		this.idRanking = idRanking;
	}
	public User getSubject() {
		return subject;
	}
	public void setSubject(User subject) {
		this.subject = subject;
	}
	public User getObserver() {
		return observer;
	}
	public void setObserver(User observer) {
		this.observer = observer;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	

	

}
