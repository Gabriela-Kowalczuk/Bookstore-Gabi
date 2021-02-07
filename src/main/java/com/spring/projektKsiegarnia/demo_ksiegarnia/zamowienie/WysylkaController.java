package com.spring.projektKsiegarnia.demo_ksiegarnia.zamowienie;
import com.spring.projektKsiegarnia.demo_ksiegarnia.zamowienie.WysylkaKsiazek;
import com.spring.projektKsiegarnia.demo_ksiegarnia.zamowienie.Zamowienie;
import com.spring.projektKsiegarnia.demo_ksiegarnia.zamowienie.ZamowienieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import  com.spring.projektKsiegarnia.demo_ksiegarnia.ksiazka.Ksiazka;
import  com.spring.projektKsiegarnia.demo_ksiegarnia.zamowienie.WysylkaKsiazek;



@Controller
public class WysylkaController {
    private ZamowienieRepository zamowienieRepository;

    @Autowired
    public WysylkaController(ZamowienieRepository zamowienieRepository) {
        this.zamowienieRepository = zamowienieRepository;
    }

    @GetMapping("/wysylka")
    public String getZamowienie(@RequestParam(required = false) WysylkaKsiazek stan,
                            Model model) {


        List<Zamowienie> zamowienie;
        if(stan == null)
            zamowienie = zamowienieRepository.findAll();
        else
            zamowienie = zamowienieRepository.findAllByStan(stan);
        model.addAttribute("zamowienie", zamowienie);

        return "wysylka";
    }
}