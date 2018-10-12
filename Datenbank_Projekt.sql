-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 12. Okt 2018 um 10:09
-- Server-Version: 10.1.28-MariaDB
-- PHP-Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `team_edward`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `beamer`
--

CREATE TABLE `beamer` (
  `Inventar_NR` int(15) NOT NULL,
  `Seriennummer` varchar(255) NOT NULL,
  `Geraetetyp` varchar(255) NOT NULL,
  `Modell` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `buch`
--

CREATE TABLE `buch` (
  `Inventar_NR` int(15) NOT NULL,
  `ISBN` varchar(255) NOT NULL,
  `Autor` varchar(255) NOT NULL,
  `Fachrichtung` varchar(255) NOT NULL,
  `Status` tinyint(1) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `computer`
--

CREATE TABLE `computer` (
  `Inventar_NR` int(15) NOT NULL,
  `Seriennummer` varchar(255) NOT NULL,
  `Geraetetyp` varchar(255) NOT NULL,
  `Modell` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `drucker`
--

CREATE TABLE `drucker` (
  `Inventar_NR` int(15) NOT NULL,
  `Seriennummer` varchar(255) NOT NULL,
  `Geraetetyp` varchar(255) NOT NULL,
  `Modell` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `inventar`
--

CREATE TABLE `inventar` (
  `Inventar_NR` int(15) NOT NULL,
  `Seriennummer` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `monitor`
--

CREATE TABLE `monitor` (
  `Inventar_NR` int(15) NOT NULL,
  `Seriennummer` varchar(255) NOT NULL,
  `Geraetetyp` varchar(255) NOT NULL,
  `Modell` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `nutzer`
--

CREATE TABLE `nutzer` (
  `Benutzer_ID` int(3) NOT NULL,
  `Vorname` varchar(255) NOT NULL,
  `Nachname` varchar(255) NOT NULL,
  `Berechtigung` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `raum`
--

CREATE TABLE `raum` (
  `Raum_NR` int(15) NOT NULL,
  `Anzahl_Sitzplaete` int(5) NOT NULL,
  `Anzahl_PC_laete` int(5) NOT NULL,
  `Status` tinyint(1) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `beamer`
--
ALTER TABLE `beamer`
  ADD PRIMARY KEY (`Inventar_NR`);

--
-- Indizes für die Tabelle `buch`
--
ALTER TABLE `buch`
  ADD PRIMARY KEY (`Inventar_NR`);

--
-- Indizes für die Tabelle `computer`
--
ALTER TABLE `computer`
  ADD PRIMARY KEY (`Inventar_NR`);

--
-- Indizes für die Tabelle `drucker`
--
ALTER TABLE `drucker`
  ADD PRIMARY KEY (`Inventar_NR`);

--
-- Indizes für die Tabelle `inventar`
--
ALTER TABLE `inventar`
  ADD PRIMARY KEY (`Inventar_NR`);

--
-- Indizes für die Tabelle `monitor`
--
ALTER TABLE `monitor`
  ADD PRIMARY KEY (`Inventar_NR`);

--
-- Indizes für die Tabelle `nutzer`
--
ALTER TABLE `nutzer`
  ADD PRIMARY KEY (`Benutzer_ID`);

--
-- Indizes für die Tabelle `raum`
--
ALTER TABLE `raum`
  ADD PRIMARY KEY (`Raum_NR`);

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `beamer`
--
ALTER TABLE `beamer`
  ADD CONSTRAINT `beamer_ibfk_1` FOREIGN KEY (`Inventar_NR`) REFERENCES `inventar` (`Inventar_NR`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints der Tabelle `buch`
--
ALTER TABLE `buch`
  ADD CONSTRAINT `buch_ibfk_1` FOREIGN KEY (`Inventar_NR`) REFERENCES `inventar` (`Inventar_NR`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints der Tabelle `computer`
--
ALTER TABLE `computer`
  ADD CONSTRAINT `computer_ibfk_1` FOREIGN KEY (`Inventar_NR`) REFERENCES `inventar` (`Inventar_NR`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints der Tabelle `drucker`
--
ALTER TABLE `drucker`
  ADD CONSTRAINT `drucker_ibfk_1` FOREIGN KEY (`Inventar_NR`) REFERENCES `inventar` (`Inventar_NR`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints der Tabelle `monitor`
--
ALTER TABLE `monitor`
  ADD CONSTRAINT `monitor_ibfk_1` FOREIGN KEY (`Inventar_NR`) REFERENCES `inventar` (`Inventar_NR`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
