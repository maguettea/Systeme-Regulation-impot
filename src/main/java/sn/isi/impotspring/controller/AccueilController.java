package sn.isi.impotspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AccueilController {
    @RequestMapping("/")
    public String accueil() {
        return "accueil"; // Nom du fichier HTML sans l'extension
    }
}
