package com.example.CabinetMedical.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.CabinetMedical.bo.Medecin;
import com.example.CabinetMedical.bo.Patho;
import com.example.CabinetMedical.service.RdvService;

public class RdvContextApplication {
		
	//Lien avec couche service
	private RdvService rdvService;
		
	//Création des listes
	private List<Patho> pathos;
	private List<Medecin> medecins;
		
	@Autowired
	public RdvContextApplication(RdvService rdvService) {
		this.rdvService = rdvService;
	}
		
	public List<Patho> getPathos() {
		if(this.pathos==null ) {
			pathos = rdvService.getPathos();
		}
		return pathos;
	}
	
	public List<Medecin> getMedecins() {
		if(this.medecins==null) {
			medecins = rdvService.getMedecins();
		}
		return medecins;
	}
}


