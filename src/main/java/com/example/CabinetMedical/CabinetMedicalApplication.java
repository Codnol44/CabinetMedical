package com.example.CabinetMedical;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.CabinetMedical.bo.Medecin;
import com.example.CabinetMedical.bo.Patho;
import com.example.CabinetMedical.controller.RdvContextApplication;
import com.example.CabinetMedical.dal.MedecinRepository;
import com.example.CabinetMedical.dal.PathoRepository;
import com.example.CabinetMedical.service.RdvService;

@SpringBootApplication
public class CabinetMedicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabinetMedicalApplication.class, args);
	}
	
	@Bean
	public RdvContextApplication rdvContextApplication(RdvService rdvService) {
		return new RdvContextApplication(rdvService);
	}
	
	
	//Enregistrement choix pathos
	@Bean
	public CommandLineRunner initPatho(PathoRepository pathoRepo ) {
		return (args) -> {
			pathoRepo.save(new Patho("Covid19"));
			pathoRepo.save(new Patho("Rhume"));
			pathoRepo.save(new Patho("Gastro"));
			pathoRepo.save(new Patho("Angine"));
			pathoRepo.save(new Patho("Bronchiolite"));
			pathoRepo.save(new Patho("Entorse"));
			pathoRepo.save(new Patho("Divers"));
		};
	}
	
	//Enregistrement choix medecins
	@Bean
	public CommandLineRunner initMedecin(MedecinRepository medecinRepo ) {
		return (args) -> {
			medecinRepo.save(new Medecin("Jean Peuplus"));
			medecinRepo.save(new Medecin("Jacques Septeladouleur"));
			medecinRepo.save(new Medecin("Yves Menlaretraite"));
		};
	}

}
