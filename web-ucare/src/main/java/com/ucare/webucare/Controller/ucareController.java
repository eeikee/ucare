package com.ucare.webucare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;

import com.ucare.webucare.model.Paciente;
import com.ucare.webucare.model.Profissional;
import com.ucare.webucare.repository.Pacientes;
import com.ucare.webucare.repository.Profissionais;

@Controller
public class ucareController {

	@Autowired
	private Pacientes pacientes;
	
	@Autowired
	private Profissionais profissionais;
	
    @RequestMapping("/home")
    public ModelAndView home(){

        final ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @RequestMapping("/perfil")
    public ModelAndView perfil(){

        ModelAndView modelAndView = new ModelAndView("perfil");
        return modelAndView;
    }

    @RequestMapping("/cadastro")
    public ModelAndView cadastro(){
        ModelAndView modelAndView = new ModelAndView("cadastro");
        return modelAndView;
    }

    @RequestMapping("/dicas")
    public ModelAndView dicas(){

        final ModelAndView modelAndView = new ModelAndView("dicas");
        return modelAndView;
    }

    @RequestMapping("/agendamentos")
    public ModelAndView agendamentos(){

        final ModelAndView modelAndView = new ModelAndView("agendamentos");
        return modelAndView;
    }

    @RequestMapping("/ajuda")
    public ModelAndView ajuda(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("ajuda");
        return modelAndView;
    }

    @RequestMapping("/sobre")
    public ModelAndView sobre(){

        final ModelAndView modelAndView = new ModelAndView("sobre");
        return modelAndView;
    }

    @RequestMapping("/fale-conosco")
    public ModelAndView faleconosco(){

        final ModelAndView modelAndView = new ModelAndView("faleconosco");
        return modelAndView;
    }

    @GetMapping("/error")
    public ModelAndView error(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        return modelAndView;
        
    }
    
    @RequestMapping(value = "/cadastro/paciente", method = RequestMethod.POST)
    public ModelAndView salvarPaciente(Paciente paciente) {
    	ModelAndView mView = new ModelAndView("cadastro");
    	mView.addObject("mensagem", "Cadastro efetuado com sucesso!");
    	System.out.println(">>>" + paciente.getNomeCompleto());
    	return mView;
    }
    
    @RequestMapping(value = "/cadastro/profissional", method = RequestMethod.POST)
    public ModelAndView salvarPaciente(Profissional profissional) {
    	ModelAndView mView = new ModelAndView("cadastro");
    	mView.addObject("mensagem", "Cadastro efetuado com sucesso!");
    	System.out.println(">>>" + profissional.getNomeCompleto());
    	return mView;
    }
    
}
