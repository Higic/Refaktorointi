# Refaktorointi
Tehtävänä on refaktoroida "sunnuntaikoodaajan" kivi-paperi-sakset peli.  
## 1. Mitkä asiat tökkäsivät ensimmäisenä silmään?
Heti alusta `Refaktorointi.Peli.java`-tiedosto näyttää tosi sekavalta. Kommentointia ei ole ollenkaan. Vaikka muuttujat ovat helppoja selvittää, niissä ei ole minkäänlaista toteamista siitä, mitä ne oikeasti tarkoittavat.  
Myös `Refaktorointi.Pelaaja.java` luokassa oli paljon turhaa koodia sekä liikaa monimutkaisuutta. Switch-case rakennetta pystyi yksinkertaistamaan.  
Pidin kuitenkin kiinni satunnaisuudesta, koska oletuksena on, että tämä oli tarkoitus. Oletuksena on, että kyseessä on eräänlainen simulaattori.

### Refaktorointi.Pelaaja.java
`Refaktorointi.Pelaaja.java`-luokasta poistin voitotYhteensä muuttujan kokonaan ja yksinkertaistin switch-case rakennetta. 
Korjasin setterin ja getterin.

### Refaktorointi.Peli.java
`Refaktorointi.Peli.java`-luokassa vaihdoin if-lausuntohirviön switch caseihin, jotka laskivat rivien määrää huomattavasti ja paransi luettavuutta.
Siirsin main metodin omaan Java-luokkaansa ja sen jälkeen taklasin suuren sekamelskan. Loin "alusta" metodin, joka alustaa uuden pelin käyntiin
## 2. Koodin refaktorointi
Refaktorointia oli paljon, sillä kyseessä oli hyvin alkeellinen ja näytti todella pahalta. 
### Pelaaja.java
Refaktoroin todella paljon switch casea mutta muuten pidin pelaajan suurinpiirtein samana.
### Peli.java
Kuten aiemmin mainitsin, vaihdoin koko if else-sekamelskan switch case lauseisiin, joka yksinkertaisti jo todella paljon. Tämän jälkeen kapseloin suuren osan omiin muuttujiin.
## 3. Testattavuus
### PelaajaTest.java
Tein itselleni pelaajan testaamisesta helppoa pitämällä luokan yksinkertaisena. Testasin molemmat metodit. Satunnaismuuttujan testasin ajamalla testin 100 kertaa.
Kattavuus PelaajaTest.javassa on 100%
### PeliTest.java
PeliTest testaa 100 kertaa pelata, 100 kertaa alustaa ja sen jälkeen testaa kaikki lopputulokset eri KPS yhdistelmistä.

## 4. Javadoc-kommentointi
Javadoc-kommentointi onnistui kaikkialle muualle paitsi Package description. En saanut netistä selville miten se tehdään järkevästi.
Javadoc-sivu on nähtävissä [täällä](https://users.metropolia.fi/~onnial/Ohjelmiston-laatu-javadoc/).
## 5. Kattavuusanalyysi
Kattavuusanalyysi on nähtävissä [täällä](https://users.metropolia.fi/~onnial/Ohjelmiston-laatu-refaktorReport/). En keksinyt miksi, mutta se näyttää että `Main.java`-luokka olisi vain 50% kattavuutta vaikka se näkyy IDE:ssä 100%. Muuten testit kattavat koko projektin
