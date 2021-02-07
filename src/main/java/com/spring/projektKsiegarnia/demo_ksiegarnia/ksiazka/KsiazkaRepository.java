package com.spring.projektKsiegarnia.demo_ksiegarnia.ksiazka;

import org.springframework.data.jpa.repository.JpaRepository;

 import java.util.Optional;

public interface KsiazkaRepository extends JpaRepository<Ksiazka, Long> {

    Optional<Ksiazka> findByTytulIgnoreCase(String tytul);
}
