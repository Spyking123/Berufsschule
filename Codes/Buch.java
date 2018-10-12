/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 09.10.2018
 * @author 
 */

public class Buch {
  
  // Anfang Attribute
  private String Fachrichtung;
  private String Autor;
  private int ISBN;
  private int Inventar_NR;
  // Ende Attribute
  
  public Buch() {
    this.Fachrichtung = "";
    this.Autor = "";
    this.ISBN = 0;
  }


  public Buch(String Fachrichtung, String Autor, int ISBN) {
    this.Fachrichtung = Fachrichtung;
    this.Autor = Autor;
    this.ISBN = ISBN;
  }

  // Anfang Methoden
  public String getFachrichtung() {
    return Fachrichtung;
  }

  public void setFachrichtung(String FachrichtungNeu) {
    Fachrichtung = FachrichtungNeu;
  }

  public String getAutor() {
    return Autor;
  }

  public void setAutor(String AutorNeu) {
    Autor = AutorNeu;
  }

  public int getISBN() {
    return ISBN;
  }

  public void setISBN(int ISBNNeu) {
    ISBN = ISBNNeu;
  }

  public int getInventar_NR() {
    return Inventar_NR;
  }

  public void setInventar_NR(int Inventar_NRNeu) {
    Inventar_NR = Inventar_NRNeu;
  }

  // Ende Methoden
} // end of Buch

