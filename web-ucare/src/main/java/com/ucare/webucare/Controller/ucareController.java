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

        ModelAndView modelAndView = new ModelAndView("index");
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
       ModelAndView modelAndView = new ModelAndView("dicas");
        return modelAndView;
    }

    @RequestMapping("/dicas/respiracao")
    public ModelAndView dicasRespiracao(){
        final ModelAndView modelAndView = new ModelAndView("dicas-respiracao");
        return modelAndView;
    }

    @RequestMapping("/dicas/meditacao")
    public ModelAndView dicasMeditacao(){
        final ModelAndView modelAndView = new ModelAndView("dicas-meditacao");
        return modelAndView;
    }

    @RequestMapping("/dicas/relaxar")
    public ModelAndView dicasRelaxar(){
        final ModelAndView modelAndView = new ModelAndView("dicas-relaxar");
        return modelAndView;
    }

    @RequestMapping("/agendamentos")
    public ModelAndView agendamentos(){

        ModelAndView modelAndView = new ModelAndView("agendamentos");
        return modelAndView;
    }

    @RequestMapping("/ajuda")
    public ModelAndView ajuda(){
        ModelAndView modelAndView = new ModelAndView("ajuda");
        return modelAndView;
    }

    @RequestMapping("/ajuda/cadastro")
    public ModelAndView ajudaCadastro(){
        final ModelAndView modelAndView = new ModelAndView("ajuda-cadastro");
        return modelAndView;
    }

    @RequestMapping("/ajuda/agendar")
    public ModelAndView ajudaAgendar(){
        final ModelAndView modelAndView = new ModelAndView("ajuda-agendar");
        return modelAndView;
    }


    @RequestMapping("/sobre")
    public ModelAndView sobre(){

        ModelAndView modelAndView = new ModelAndView("sobre");
        return modelAndView;
    }

    @RequestMapping("/fale-conosco")
    public ModelAndView faleconosco(){

        ModelAndView modelAndView = new ModelAndView("faleconosco");
        return modelAndView;
    }
   
    
    @GetMapping("/error")
    public ModelAndView error(){
        final ModelAndView modelAndView = new ModelAndView("error");
        return modelAndView;
    }
    
    @RequestMapping(value = "/cadastro/paciente", method = RequestMethod.POST)
    public ModelAndView salvarPaciente(Paciente paciente) {
    	ModelAndView mView = new ModelAndView("cadastro");
    	pacientes.save(paciente);
    	mView.addObject("mensagem", "Cadastro efetuado com sucesso!");
    	return mView;
    }
    
    @RequestMapping(value = "/cadastro/profissional", method = RequestMethod.POST)
    public ModelAndView salvarPaciente(Profissional profissional) {
    	ModelAndView mView = new ModelAndView("cadastro");
    	profissionais.save(profissional);
    	mView.addObject("mensagem", "Cadastro efetuado com sucesso!");
    	return mView;
    }
    
}
