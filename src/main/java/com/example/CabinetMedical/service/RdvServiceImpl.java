package com.example.CabinetMedical.service;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import com.example.CabinetMedical.bo.Medecin;
import com.example.CabinetMedical.bo.Patho;
import com.example.CabinetMedical.bo.Rdv;
import com.example.CabinetMedical.dal.MedecinRepository;
import com.example.CabinetMedical.dal.PathoRepository;
import com.example.CabinetMedical.dal.RdvRepository;

@Service
@Scope("singleton")
public class RdvServiceImpl implements RdvService {

	//Lien avec couche DAL
	private RdvRepository rdvRepo;
	private PathoRepository pathoRepo;
	private MedecinRepository medecinRepo;
	
	public RdvServiceImpl(RdvRepository rdvRepo, PathoRepository pathoRepo, MedecinRepository medecinRepo) {
		super();
		this.rdvRepo = rdvRepo;
		this.pathoRepo = pathoRepo;
		this.medecinRepo = medecinRepo;
	}
	
	//Methode C du CRUD
	@Override
	public void ajouterRdv(Rdv rdv) {
		rdvRepo.save(rdv);
	}

	//Methode R du CRUD
	@Override
	public List<Rdv> getRdvs() {
		return rdvRepo.findAll();
	}

	//Ajout de la pathologie
	@Override
	public List<Patho> getPathos() {
		return pathoRepo.findAll();
	}

	//Ajout du medecin
	@Override
	public List<Medecin> getMedecins() {
		return medecinRepo.findAll();
	}

	//Methode U du CRUD
	@Override
	public Optional<Rdv> findRdvById(Long noP) {
		return rdvRepo.findById(noP);
	}

	//Methode D du CRUD
	@Override
	public void deleteRdv(Long noP) {
	rdvRepo.deleteById(noP);
		
	}
	
}
