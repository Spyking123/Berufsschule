/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 09.10.2018
 * @author 
 */

public class Computer {
  
  // Anfang Attribute
  private String Modell;
  private String Seriennummer;
  private String Gerätetyp;
  private int Inventar_Nr;
  // Ende Attribute
  
  public Computer() {
    this.Modell = "";
    this.Seriennummer = "";
    this.Gerätetyp = "";
    this.Inventar_Nr = 0;
  }


  public Computer(String Modell, String Seriennummer, String Gerätetyp, int Inventar_Nr) {
    this.Modell = Modell;
    this.Seriennummer = Seriennummer;
    this.Gerätetyp = Gerätetyp;
    this.Inventar_Nr = Inventar_Nr;
  }

  // Anfang Methoden
  public String getModell() {
    return Modell;
  }

  public void setModell(String ModellNeu) {
    Modell = ModellNeu;
  }

  public String getSeriennummer() {
    return Seriennummer;
  }

  public void setSeriennummer(String SeriennummerNeu) {
    Seriennummer = SeriennummerNeu;
  }

  public String getGerätetyp() {
    return Gerätetyp;
  }

  public void setGerätetyp(String GerätetypNeu) {
    Gerätetyp = GerätetypNeu;
  }

  public int getInventar_Nr() {
    return Inventar_Nr;
  }

  public void setInventar_Nr(int Inventar_NrNeu) {
    Inventar_Nr = Inventar_NrNeu;
  }

  // Ende Methoden
} // end of Computer

