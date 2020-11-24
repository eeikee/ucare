package com.ucare.webucare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ucare.webucare.model.Paciente;

public interface Pacientes extends JpaRepository<Paciente, Long>{
	
}
