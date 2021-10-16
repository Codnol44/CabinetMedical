package com.example.CabinetMedical.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medecin implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long noS;
	private String nom;
	
	public Medecin(Long noS, String nom) {
		super();
		this.noS = noS;
		this.nom = nom;
	}
	
	public Medecin(String nom) {
		super();
		this.nom = nom;
	}
	
	public Medecin() {
		super();
	}

	public Long getNoS() {
		return noS;
	}

	public void setNoS(Long noS) {
		this.noS = noS;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
