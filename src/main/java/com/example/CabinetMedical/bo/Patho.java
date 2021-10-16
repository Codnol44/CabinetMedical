package com.example.CabinetMedical.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patho implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long noB;
	private String libelle;
	
	public Patho(Long noB, String libelle) {
		super();
		this.noB = noB;
		this.libelle = libelle;
	}
	
	public Patho(String libelle) {
		super();
		this.libelle = libelle;
	}
	
	public Patho() {
		super();
	}

	public Long getNoB() {
		return noB;
	}

	public void setNoB(Long noB) {
		this.noB = noB;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
