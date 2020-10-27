package com.ucare.webucare.model;

import br.com.caelum.stella.validation.CPFValidator;
import com.ucare.webucare.model.cep.ViaCEP;
import com.ucare.webucare.model.cep.ViaCEPException;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.json.JSONException;


@Entity
public class Paciente extends User{
	
}
 