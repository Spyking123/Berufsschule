/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 09.10.2018
 * @author 
 */

public class Inventar {
  
  // Anfang Attribute
  private int Inventar_Nr;
  private String Seriennummer;
  // Ende Attribute
  
  public Inventar() {
    this.Inventar_Nr = 0;
    this.Seriennummer = "";
  }


  public Inventar(int Inventar_Nr, String Seriennummer) {
    this.Inventar_Nr = Inventar_Nr;
    this.Seriennummer = Seriennummer;
  }

  // Anfang Methoden
  public int getInventar_Nr() {
    return Inventar_Nr;
  }

  public void setInventar_Nr(int Inventar_NrNeu) {
    Inventar_Nr = Inventar_NrNeu;
  }

  public String getSeriennummer() {
    return Seriennummer;
  }

  public void setSeriennummer(String SeriennummerNeu) {
    Seriennummer = SeriennummerNeu;
  }

  // Ende Methoden
} // end of Inventar

