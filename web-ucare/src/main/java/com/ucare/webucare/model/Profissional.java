package com.ucare.webucare.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "profissional")
public class Profissional extends User{

	private String crp;
    
    private String horaInicio;
    private String horaFim;
   
	@ManyToMany
	@JoinTable(
			name= "profissional_dias",
			joinColumns = @JoinColumn(name = "profissional_id"),
			inverseJoinColumns = @JoinColumn(name="dias_id"))
    private List<Dias> dias;
    

    public List<Dias> getDias() {
		return dias;
	}

	public void setDias(List<Dias> dias) {
		this.dias = dias;
	}

    public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }

}
