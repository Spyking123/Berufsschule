/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 09.10.2018
 * @author 
 */

public class Raum {
  
  // Anfang Attribute
  private int RaumNummer;
  private int Anzahl_Sitzplaetze;
  private int Anzah_PC_Plaetze;
  private int Status;
  // Ende Attribute
  
  public Raum() {
    this.RaumNummer = 0;
    this.Anzahl_Sitzplaetze = 0;
    this.Anzah_PC_Plaetze = 0;
  }


  public Raum(int RaumNummer, int Anzahl_Sitzplaetze, int Anzah_PC_Plaetze) {
    this.RaumNummer = RaumNummer;
    this.Anzahl_Sitzplaetze = Anzahl_Sitzplaetze;
    this.Anzah_PC_Plaetze = Anzah_PC_Plaetze;
  }

  // Anfang Methoden
  public int getRaumNummer() {
    return RaumNummer;
  }

  public void setRaumNummer(int RaumNummerNeu) {
    RaumNummer = RaumNummerNeu;
  }

  public int getAnzahl_Sitzplaetze() {
    return Anzahl_Sitzplaetze;
  }

  public void setAnzahl_Sitzplaetze(int Anzahl_SitzplaetzeNeu) {
    Anzahl_Sitzplaetze = Anzahl_SitzplaetzeNeu;
  }

  public int getAnzah_PC_Plaetze() {
    return Anzah_PC_Plaetze;
  }

  public void setAnzah_PC_Plaetze(int Anzah_PC_PlaetzeNeu) {
    Anzah_PC_Plaetze = Anzah_PC_PlaetzeNeu;
  }

  public int getStatus() {
    return Status;
  }

  public void setStatus(int StatusNeu) {
    Status = StatusNeu;
  }

  // Ende Methoden
} // end of Raum

