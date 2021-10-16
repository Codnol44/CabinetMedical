package com.example.CabinetMedical.service;

import java.util.List;
import java.util.Optional;

import com.example.CabinetMedical.bo.Medecin;
import com.example.CabinetMedical.bo.Patho;
import com.example.CabinetMedical.bo.Rdv;

public interface RdvService {
	
	void ajouterRdv(Rdv rdv);
	
	public List<Rdv> getRdvs();
	
	List<Patho> getPathos();
	
	List<Medecin> getMedecins();
	
	Optional<Rdv> findRdvById(Long noP);

	void deleteRdv(Long noP);

}
