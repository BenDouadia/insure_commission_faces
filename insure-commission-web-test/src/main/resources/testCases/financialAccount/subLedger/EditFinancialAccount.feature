#TSTINSC-891

Feature: Nebenbuch

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Nebenbuch editieren
    Given Ich lege ein Nebenbuch an
    And Ich suche nach Nebenbuch
    And Ich rufe die Nebenbuch-Detailansicht auf
    And Ich rufe die Nebenbuch-Bearbeiten-Maske auf
    And Ich aendere das Nebenbuch
    When Ich speichere die Aenderung fuer Nebenbuch
    Then Die Aenderung fuer Nebenbuch ist gespeichert
