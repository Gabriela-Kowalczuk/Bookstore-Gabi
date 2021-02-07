package com.spring.projektKsiegarnia.demo_ksiegarnia;

import com.spring.projektKsiegarnia.demo_ksiegarnia.ksiazka.Ksiazka;
import com.spring.projektKsiegarnia.demo_ksiegarnia.ksiazka.KsiazkaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class StartowaController {

    private KsiazkaRepository ksiazkaRepository;

    public StartowaController(KsiazkaRepository ksiazkaRepository) {
        this.ksiazkaRepository = ksiazkaRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Ksiazka> ksiazki = ksiazkaRepository.findAll();
        model.addAttribute("ksiazki", ksiazki);
        return "index";
    }

}