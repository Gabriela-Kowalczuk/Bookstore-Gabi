insert into ksiazka(id,autor,cena, kategoria,ksiazka_foto, opis,opis_short,tytul)  VALUES (1,'R.R.G.Martin', 44.94,
' Romans' ,'w.jpg', 'Pierwsza część sagi Pieńi Lodu i Ognia!','cos fajnego','Gra o Tron');
insert into ksiazka(id,autor,cena, kategoria,ksiazka_foto, opis,opis_short,tytul)  VALUES (2,'Luisa May Alcott', 30.83,
  'Kryminal' ,'c.jpg', 'Angielskie wydanie w wersji do nauki angielskiego, popularnej powieści, na której powstało kilka adaptacji filmowych.','hmmm','Little Women');
insert into ksiazka(id,autor,cena, kategoria,ksiazka_foto, opis,opis_short,tytul)  VALUES (3,'English4IT', 50.83,
   'Edukacyjny' ,'t.jpg', 'Angielskie wydanie w wersji do nauki angielskiego terminologii branżowej IT', 'coscik', 'English4IT');

insert into Zamowienia_klienta(id, address, stan, telefon) VALUES   (1, 'Trauguta 10/8 Wrocław','doRealizacji' ,'176456789' );

insert into ZAMOWIONE_KSIAZKI  (zamowienie_id, ksiazka_id) values (1, 1);

