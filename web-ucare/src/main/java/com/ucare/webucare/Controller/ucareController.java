package com.ucare.webucare.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ucare.webucare.model.Estados;
import com.ucare.webucare.model.LogUser;
import com.ucare.webucare.model.Paciente;
import com.ucare.webucare.model.Profissional;
import com.ucare.webucare.repository.LogUserRepository;
import com.ucare.webucare.repository.Pacientes;
import com.ucare.webucare.repository.Profissionais;

@Controller
public class ucareController {

	@Autowired
	private Pacientes pacientes;

	@Autowired
	private Profissionais profissionais;

	@Autowired
	private LogUserRepository logUser;

	@ModelAttribute("LoggedPaciente")
	public Paciente pacienteLogado() {
		for (Paciente p : pacientes.findAll()) {
			if (p.isLogado()) {
				return p;
			}
		}
		return null;
	}

	@ModelAttribute("LoggedProfissional")
	public Profissional profissionalLogado() {
		for (Profissional p : profissionais.findAll()) {
			if (p.isLogado()) {
				return p;
			}
		}
		return null;
	}

	@GetMapping("/logout")
	public String Logout() {
		for (Paciente paciente : listarPacientes()) {
			if (paciente.isLogado()) {
				paciente.setLogado(false);
				pacientes.save(paciente);
				return "index";
			}
		}
		for (Profissional profissional : listarProfissionais()) {
			if (profissional.isLogado()) {
				profissional.setLogado(false);
				profissionais.save(profissional);
				return "index";
			}
		}
		return "index";
	}

	@RequestMapping("/home")
	public ModelAndView home() {

		ModelAndView modelAndView = new ModelAndView("index");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/perfil")
	public ModelAndView perfil() {
		ModelAndView modelAndView = new ModelAndView("perfil");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/minhasconsultas")
	public ModelAndView minhasconsultas() {
		ModelAndView modelAndView = new ModelAndView("minhasconsultas");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/avaliacao")
	public ModelAndView avaliacao() {

		ModelAndView modelAndView = new ModelAndView("Avaliacao");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/cadastro")
	public ModelAndView cadastro() {
		ModelAndView modelAndView = new ModelAndView("cadastro");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/dicas")
	public ModelAndView dicas() {
		ModelAndView modelAndView = new ModelAndView("dicas");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/dicas/respiracao")
	public ModelAndView dicasRespiracao() {
		final ModelAndView modelAndView = new ModelAndView("dicas-respiracao");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/dicas/meditacao")
	public ModelAndView dicasMeditacao() {
		final ModelAndView modelAndView = new ModelAndView("dicas-meditacao");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/dicas/relaxar")
	public ModelAndView dicasRelaxar() {
		final ModelAndView modelAndView = new ModelAndView("dicas-relaxar");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/agendamentos")
	public ModelAndView agendamentos() {

		ModelAndView modelAndView = new ModelAndView("agendamentos");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/ajuda")
	public ModelAndView ajuda() {
		ModelAndView modelAndView = new ModelAndView("ajuda");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/ajuda/cadastro")
	public ModelAndView ajudaCadastro() {
		final ModelAndView modelAndView = new ModelAndView("ajuda-cadastro");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/ajuda/agendar")
	public ModelAndView ajudaAgendar() {
		final ModelAndView modelAndView = new ModelAndView("ajuda-agendar");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/sobre")
	public ModelAndView sobre() {

		ModelAndView modelAndView = new ModelAndView("sobre");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@RequestMapping("/fale-conosco")
	public ModelAndView faleconosco() {

		ModelAndView modelAndView = new ModelAndView("faleconosco");
		if (pacienteLogado() != null) {
			modelAndView.addObject("UsuarioLogado", pacienteLogado());
		} else if (profissionalLogado() != null) {
			modelAndView.addObject("UsuarioLogado", profissionalLogado());
		}
		return modelAndView;
	}

	@GetMapping("/error")
	public ModelAndView error() {
		final ModelAndView modelAndView = new ModelAndView("error");
		return modelAndView;
	}

	@RequestMapping(value = "/cadastro/paciente", method = RequestMethod.POST)
	public ModelAndView salvarPaciente(Paciente paciente) {
		ModelAndView mView = new ModelAndView("cadastro");
		pacientes.save(paciente);
		mView.addObject("mensagem", "Paciente cadastrado com sucesso!");
		return mView;
	}

	@RequestMapping(value = "/cadastro/profissional", method = RequestMethod.POST)
	public String salvarPaciente(@Validated Profissional profissional, Errors error, RedirectAttributes ra) {
		if (error.hasErrors()) {
			return "redirect:/cadastro";
		}
		profissionais.save(profissional);
		ra.addFlashAttribute("mensagem", "Profissional cadastrado com sucesso!");
		return "redirect:/cadastro";
	}

	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView logarUsuario(LogUser lg, RedirectAttributes ra) {
		for (Paciente paciente : listarPacientes()) {
			if (lg.getEmail().equals(paciente.getEmail())) {
				if (lg.getPassword().equals(paciente.getSenha())) {
					ModelAndView mv = new ModelAndView("perfil");
					mv.addObject("UsuarioLogado", paciente);
					paciente.setLogado(true);
					lg.setUser_id(paciente.getId());
					logUser.save(lg);
					pacientes.save(paciente);
					return mv;
				}
			}
		}
		for (Profissional profissional : listarProfissionais()) {
			if (lg.getEmail().equals(profissional.getEmail())) {
				if (lg.getPassword().equals(profissional.getSenha())) {
					ModelAndView mv = new ModelAndView("perfil");
					mv.addObject("UsuarioLogado", profissional);
					profissional.setLogado(true);
					lg.setUser_id(profissional.getId());
					logUser.save(lg);
					profissionais.save(profissional);
					return mv;
				}
			}
		}
		return new ModelAndView("index");
	}

	@ModelAttribute("estados")
	public List<Estados> listarEstados() {
		return Arrays.asList(Estados.values());
	}

	@ModelAttribute("todosPsicologo")
	public List<Profissional> listarProfissionais() {
		return profissionais.findAll();
	}

	@ModelAttribute("todosPaciente")
	public List<Paciente> listarPacientes() {
		return pacientes.findAll();
	}

	@ModelAttribute("usuarioLogado")
	public boolean logado() {
		for (Paciente p : pacientes.findAll()) {
			if (p.isLogado()) {
				return true;
			}
		}
		for (Profissional p : profissionais.findAll()) {
			if (p.isLogado()) {
				return true;
			}
		}
		return false;
	}

}
