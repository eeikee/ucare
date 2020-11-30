package com.ucare.webucare.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "paciente")
public class Paciente extends User{
	
	@OneToMany(mappedBy = "paciente")
	private List<Consulta> consulta;

	public List<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(List<Consulta> consulta) {
		this.consulta = consulta;
	}

}
