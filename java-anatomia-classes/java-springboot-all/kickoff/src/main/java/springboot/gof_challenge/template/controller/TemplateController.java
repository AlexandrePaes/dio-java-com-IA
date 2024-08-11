package springboot.gof_challenge.template.controller;

import springboot.gof_challenge.template.template.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@RestController
@RequestMapping("/template")
public class TemplateController {

    @Autowired
    @Qualifier("cricket")
    Game gameCricket;

    @Autowired
    @Qualifier("football")
    Game gameFootball;

    @GetMapping
    public ResponseEntity getTemplate() {

        System.out.println("============cricket==============");
        gameCricket.play();
        System.out.println("============football=============");
        gameFootball.play();

        return ((TemplateController) ResponseEntity.noContent()).getTemplate();
    }
}
