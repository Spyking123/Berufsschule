/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 09.10.2018
 * @author 
 */

public class Nutzer {
  
  // Anfang Attribute
  private String Vorname;
  private String Name;
  private int BenutzerID;
  private int Berechtigungen;
  // Ende Attribute
  
  public Nutzer() {
    this.Name = "";
  }


  public Nutzer(String Vorname, String Name, int BenutzerID, int Berechtigungen) {
    this.Vorname = Vorname;
    this.Name = Name;
    this.BenutzerID = BenutzerID;
    this.Berechtigungen = Berechtigungen;
  }

  // Anfang Methoden
  public String getVorname() {
    return Vorname;
  }


  public void setVorname(String VornameNeu) {
    Vorname = VornameNeu;
  }


  public String getName() {
    return Name;
  }

  public void setName(String NameNeu) {
    Name = NameNeu;
  }

  public int getBenutzerID() {
    return BenutzerID;
  }

  public void setBenutzerID(int BenutzerIDNeu) {
    BenutzerID = BenutzerIDNeu;
  }

  public int getBerechtigungen() {
    return Berechtigungen;
  }

  public void setBerechtigungen(int BerechtigungenNeu) {
    Berechtigungen = BerechtigungenNeu;
  }

  // Ende Methoden
} // end of Projekt

