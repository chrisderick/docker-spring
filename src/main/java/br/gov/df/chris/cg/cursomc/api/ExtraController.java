package br.gov.df.chris.cg.cursomc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExtraController {
    @RequestMapping("/")
    public String home(){
        return "Hello Docker World";
    }
}
