package com.example.CabinetMedical.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CabinetMedical.bo.Rdv;

public interface RdvRepository extends JpaRepository<Rdv, Long> {}
