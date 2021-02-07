package com.spring.projektKsiegarnia.demo_ksiegarnia.zamowienie;

import com.spring.projektKsiegarnia.demo_ksiegarnia.zamowienie.Zamowienie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ZamowienieRepository extends JpaRepository<Zamowienie, Long> {
    List<Zamowienie> findAllByStan(WysylkaKsiazek stan);
    List<Zamowienie>findAll();
}

