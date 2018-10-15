#TSTINSC-893

Feature: Nebenbuch

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Nebenbuch anlegen
    Given Ich rufe die Nebenbuch-Ansicht auf
    And Ich rufe die Nebenbuch-Anlage auf
    And Ich fuelle die Pflichfelder fuer Nebenbuch aus
    When Ich speichere Nebenbuch
    Then Die angelegte Daten fuer Nebenbuch sind vorhanden