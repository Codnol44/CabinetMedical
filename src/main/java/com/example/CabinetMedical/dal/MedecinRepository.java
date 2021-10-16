 package com.example.CabinetMedical.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CabinetMedical.bo.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {}

