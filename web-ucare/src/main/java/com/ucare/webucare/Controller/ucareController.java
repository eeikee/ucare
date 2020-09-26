package com.ucare.webucare.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ucareController {
    @GetMapping("/")
    public String initialize(){
        return "Wellcome to UCARE - V1.0";
    }
}
