package org.hibernate.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Skill implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6960816861832286046L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSkill;

	@Column
	private String description;

	@OneToOne
	@JoinColumn(name = "idSkill")
	private Ranking ranking;

	public Skill() {

	}

	public Long getIdSkill() {
		return idSkill;
	}

	public void setIdSkill(Long idSkill) {
		this.idSkill = idSkill;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Ranking getRanking() {
		return ranking;
	}

	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}

	
}
