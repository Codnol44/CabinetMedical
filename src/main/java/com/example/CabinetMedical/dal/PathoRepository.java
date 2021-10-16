package com.example.CabinetMedical.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CabinetMedical.bo.Patho;

public interface PathoRepository extends JpaRepository<Patho, Long> {}

