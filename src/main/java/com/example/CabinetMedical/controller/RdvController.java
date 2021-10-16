package com.example.CabinetMedical.controller;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.CabinetMedical.bo.Rdv;
import com.example.CabinetMedical.service.RdvService;

@Controller
@Scope("singleton")
public class RdvController {

	//Lien avec la couche service
	private RdvService rdvService;
	@Autowired
	public RdvController(RdvService rdvService) {
		this.rdvService = rdvService;
	}
	
	@GetMapping({"", "/accueil"})
	public String accueil() {
		return "accueil";
	}
	
	@GetMapping("/docs")
	public String docs() {
		return "docs";
	}
	
	@GetMapping("/liste")
	public String afficherListe(Model model) {
		model.addAttribute("liste", rdvService.getRdvs());
		return "liste";
	}
	
	@GetMapping("rdv")
	public String afficherForm(Model model) {
		model.addAttribute("rdv", new Rdv());
		return "rdv";
	}
	
	@PostMapping("/rdv")
	public String ajoutRdv(@ModelAttribute("rdv") Rdv rdv) {
		rdvService.ajouterRdv(rdv);
		return "redirect:/rdv";
	}
	
	@GetMapping("/del")
	public String suppRdv(Model model, @RequestParam Long noP) {
		rdvService.deleteRdv(noP);
		return "redirect:/liste";
	}
	
	@GetMapping("/up")
	public String modifierRdv(@RequestParam Long noP, Model model) {
		Rdv rdv = rdvService.findRdvById(noP).get();
		model.addAttribute("rdv", rdv);
		rdvService.deleteRdv(noP);
		return "rdv";
	}
	
}
