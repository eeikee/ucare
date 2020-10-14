package com.ucare.webucare.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ucareController {

    @GetMapping("/home")
    public ModelAndView home(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/perfil")
    public ModelAndView perfil(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("perfil");
        return modelAndView;
    }

    @GetMapping("/cadastro")
    public ModelAndView cadastro(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cadastro");
        return modelAndView;
    }

    @GetMapping("/dicas")
    public ModelAndView dicas(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("dicas");
        return modelAndView;
    }

    @GetMapping("/agendamentos")
    public ModelAndView agendamentos(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("agendamentos");
        return modelAndView;
    }

    @GetMapping("/ajuda")
    public ModelAndView ajuda(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("ajuda");
        return modelAndView;
    }

    @GetMapping("/sobre")
    public ModelAndView sobre(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sobre");
        return modelAndView;
    }

    @GetMapping("/fale-conosco")
    public ModelAndView faleconosco(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("faleconosco");
        return modelAndView;
    }

    @GetMapping("/error")
    public ModelAndView error(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
