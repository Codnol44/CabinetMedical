package com.example.CabinetMedical.bo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Rdv implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long noP;
	private String prenom;
	private String nom;
	private boolean connu;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate creneau;
	
	private LocalTime timing;
	
	@ManyToOne
	private Patho patho;
	
	@ManyToOne
	private Medecin medecin;

	public Rdv(Long noP, String prenom, String nom, boolean connu, LocalDate creneau, LocalTime timing, String patho, String medecin) {
		super();
		this.noP = noP;
		this.prenom = prenom;
		this.nom = nom;
		this.connu = connu;
		this.creneau = creneau;
		this.timing = timing;
	}
	
	public Rdv(String prenom, String nom, boolean connu, LocalDate creneau, LocalTime timing, String patho, String medecin) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.connu = connu;
		this.creneau = creneau;
		this.timing = timing;
	}
	
	public Rdv() {
		super();
	}

	public Long getNoP() {
		return noP;
	}

	public void setNoP(Long noP) {
		this.noP = noP;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isConnu() {
		return connu;
	}

	public void setConnu(boolean connu) {
		this.connu = connu;
	}

	public LocalDate getCreneau() {
		return creneau;
	}

	public void setCreneau(LocalDate creneau) {
		this.creneau = creneau;
	}

	public LocalTime getTiming() {
		return timing;
	}

	public void setTiming(LocalTime timing) {
		this.timing = timing;
	}

	public Patho getPatho() {
		return patho;
	}

	public void setPatho(Patho patho) {
		this.patho = patho;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
}
