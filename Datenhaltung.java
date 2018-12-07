/**
Datenbanksystem
* @version 1.pi vom 16.11.2018
* @author <b>STITZKY</b> / Plötner / Niendorf
/ Berlin
*/
import java.util.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Datenhaltung {   //implements IDatenhaltung {
  private Statement statement= null;     
  private Connection connection= null;
  private ResultSet resultSet= null; 

  public static void main(String[] args)
  {
    new Datenhaltung.verbindeZurDatenhaltung();
  }

  public void verbindeZurDatenhaltung() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      connection  =  DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
      statement = connection.createStatement();     
    } catch (ClassNotFoundException ex) { System.out.println(ex.getMessage()); }
    catch (SQLException ex)
    { System.out.println(ex.getMessage()); }  
  }
  private void schliesseVerbindungZurDatenhaltung() {
    try {
      connection.close();
      statement.close();
    } catch (Exception e) { System.out.println(e); }
  }
  
    //statement.executeUpdate("INSERT INTO `nutzer` (`Vorname`, `Nachname`, `Berechtigung`) VALUES (`Paul`, `Stitzky`, 1)");
 
  

  
}
