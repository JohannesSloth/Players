package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class DemoController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "call_name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    List<String> players = new ArrayList<String>(Arrays.asList(
            "Lionel Messi",
            "Cristiano Ronaldo",
            "Xavi Midfielder",
            "Andres Iniesta",
            "Zlatan Ibrahimovic",
            "Radamel Falcao",
            "Robin van Persie",
            "Andrea Pirlo",
            "Yaya Toure",
            "Edinson Cavani",
            "Sergio Aguero",
            "Iker Casillas",
            "Neymar",
            "Sergio Busquets",
            "Xabi Alonso",
            "Thiago Silva",
            "Mesut Ozil",
            "David Silva",
            "Bastian Schweinsteiger",
            "Gianluigi Buffon"));

    @GetMapping("/players")
    public String allPlayers(Model model){
        model.addAttribute("all",players);
        return "all-players";
    }

}
